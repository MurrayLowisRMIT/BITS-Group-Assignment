package game;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

// these buttons form the interactive scene commands
public class MainPanelCommands extends JPanel
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 7810649496279389274L;

   protected JButton button = new JButton();
   // text on button
   private String text = "";
   // ID number of the selected button
   private int commandID;

   public MainPanelCommands(int globalPanelCommandID, int localPanelArrayID)
   {
      this.commandID = globalPanelCommandID;

      // button coordinates and dimensions
      this.button.setBounds(0, 0, 0, 0);
      // removes focus indicator around button text
      this.button.setFocusable(false);
      // button background colour
      this.button.setBackground(Color.WHITE);
      // set button borders
      this.button.setBorder(BorderFactory.createEtchedBorder());
      // add image to button
      this.button.setIcon(null);
      // these overwrite the image when hovered etc. (setIcon() must not be null)
      this.button.setRolloverEnabled(true);
      this.button.setRolloverIcon(null);
      this.button.setPressedIcon(null);
      // button text style
      this.button.setFont(new Font("arial", Font.BOLD, 10));
      // text colour
      this.button.setForeground(Color.BLACK);
      // places text relative to icon
      this.button.setHorizontalTextPosition(JButton.CENTER);
      this.button.setVerticalTextPosition(JButton.CENTER);
      // changes cursor when mouse hovers over button
      this.button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

      if (Globals.stats.inventoryOverlayActive)
      {
         this.button.setEnabled(false);
      }
      else
      {
         this.button.setEnabled(true);
      }

      selectCommand();

      // converting to this.text allows for text wrapping
      this.button.setText("<html><p>" + this.text + "</p></html>");

      this.button.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent event)
         {
            new ButtonFunctions(globalPanelCommandID);
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
            mc0();
            break;
         case 1:
            mc1();
            break;
         case 2:
            mc2();
            break;
         case 3:
            mc3();
            break;
      }
   }

   // BUTTON CONTENT BEGINS HERE-----------------------------------------------
   // these are the methods called when creating a button (not clicking it)

   public void mc0()
   {
      this.button.setBounds(100, 0, 120, 50);
      this.text = "No function";
      this.button.setIcon(null);
   }

   public void mc1()
   {
      this.button.setBounds(300, 0, 120, 50);
      this.text = "No function";
      this.button.setIcon(null);
   }

   public void mc2()
   {
      this.button.setEnabled(true);
      this.button.setBounds(500, 0, 120, 50);
      this.button.setIcon(new ImageIcon("Inventory.png"));
   }

   public void mc3()
   {
      this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
      this.button.setIcon(new ImageIcon("Restart.png"));
   }
}
