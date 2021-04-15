package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

// these buttons form the interactive scene commands
public class MainPanelCommands extends JPanel
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 7810649496279389274L;

   protected JButton button = new JButton();;
   private int setSceneID;
   private int commandID;

   public MainPanelCommands(int globalPanelCommandID, int localPanelArrayID)
   {
      this.commandID = globalPanelCommandID;

      // button coordinates and dimensions
      this.button.setBounds(0, 0, 0, 0);
      // removes focus indicator around button text
      this.button.setFocusable(false);
      // button background colour
      this.button.setBackground(new Color(255, 0, 255, 255));
      // set button border
      this.button.setBorder(null);
      // set to false to have button greyed out
      this.button.setEnabled(true);
      // text on button
      this.button.setText("");
      // button text style
      this.button.setFont(new Font("arial", Font.BOLD, 10));
      // text colour
      this.button.setForeground(Color.BLACK);
      // add image to button
      this.button.setIcon(null);
      // places text relative to icon
      this.button.setHorizontalTextPosition(JButton.CENTER);
      this.button.setVerticalTextPosition(JButton.CENTER);

      selectCommand();

      this.button.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent event)
         {
            Globals.staticSceneID = setSceneID;
            Globals.update();
         }
      });
      
      // adds button to scene
      Globals.mainPanelCommands[localPanelArrayID] = this.button;
   }

   private void selectCommand()
   {
      switch (this.commandID)
      {
         case 0:            
            p0();
            break;
         case 1:
            p1();
            break;
         case 2:
            p2();
            break;
      }
   }

   public void p0()
   {
      this.button.setBounds(100, Globals.mainPanelHeight / 2 + 16, 120, 50);
      this.button.setText("Talk to the hobo");
      this.button.setIcon(null);
   }

   public void p1()
   {
      this.button.setBounds(300, Globals.mainPanelHeight / 2 + 16, 120, 50);
      this.button.setText("Rob the hobo");
      this.button.setIcon(null);
   }

   public void p2()
   {
      this.button.setBounds(500, Globals.mainPanelHeight / 2 + 16, 120, 50);
      this.button.setIcon(new ImageIcon("Inventory.png"));
   }
}
