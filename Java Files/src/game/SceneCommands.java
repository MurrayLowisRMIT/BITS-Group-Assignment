package game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

// these buttons form the interactive scene commands
public class SceneCommands extends JPanel
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 7810649496279389274L;

   protected JButton button = new JButton();
   // text on button
   private String text = "";
   // scene to change to when button is pressed
   private int setSceneID;
   // ID number of the selected button
   private int commandID;

   public SceneCommands(int globalSceneCommandID, int localSceneArrayID)
   {
      this.commandID = globalSceneCommandID;

      // button coordinates and dimensions
      this.button.setBounds(0, 0, 0, 0);
      // removes focus indicator around button text
      this.button.setFocusable(false);
      // button background colour
      this.button.setBackground(Color.WHITE);
      // add image to button
      this.button.setIcon(null);
      // these overwrite the image when hovered etc. (setIcon() must not be null)
      this.button.setRolloverEnabled(true);
      this.button.setRolloverIcon(null);
      this.button.setPressedIcon(null);
      // removes background
      this.button.setContentAreaFilled(false);
      // set button border
      this.button.setBorder(null);
      // set to false to have button greyed out
      this.button.setEnabled(true);
      // button text style
      this.button.setFont(new Font("arial", Font.BOLD, 10));
      // text colour
      this.button.setForeground(Color.BLACK);
      // places text relative to icon
      this.button.setHorizontalTextPosition(JButton.CENTER);
      this.button.setVerticalTextPosition(JButton.BOTTOM);
      // changes cursor when mouse hovers over button
      this.button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

      selectCommand();
      // text on button - placing here enables this.text for text wrapping 
      this.button.setText("<html><p>" + this.text + "</p></html>");

      this.button.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent event)
         {
            Globals.staticSceneID = setSceneID;
            Globals.update();
         }
      });

      // adds button to scene
      Globals.sceneCommands[localSceneArrayID] = this.button;
   }

   private void selectCommand()
   {
      switch (this.commandID)
      {
         case 0:
            sc0();
            break;
         case 1:
            sc1();
            break;
         case 2:
            sc2();
            break;
      }
   }

   // BUTTON CONTENT BEGINS HERE-----------------------------------------------

   public void sc0()
   {
      this.button.setBounds(800, 100, 80, 100);
      this.text = "This button has an image";
      this.button.setIcon(new ImageIcon("Arrow.png"));
      this.setSceneID = 1;
   }

   public void sc1()
   {
      this.button.setContentAreaFilled(true);
      this.button.setBounds(570, 100, 180, 50);
      this.text = "This button has a white background";
      this.setSceneID = 0;
   }

   public void sc2()
   {
      this.button.setBounds(1000, 170, 150, 50);
      this.text = "No background on this button";
      this.setSceneID = 2;
   }
}
