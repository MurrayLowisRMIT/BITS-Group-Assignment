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

   protected JButton button = new JButton();
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
   
   public void mc0()
   {
      this.button.setBounds(100, Globals.mainPanelHeight / 2 + 16, 120, 50);
      this.button.setText("Talk to the hobo");
      this.button.setIcon(null);
   }

   public void mc1()
   {
      this.button.setBounds(300, Globals.mainPanelHeight / 2 + 16, 120, 50);
      this.button.setText("Rob the hobo");
      this.button.setIcon(null);
   }

   public void mc2()
   {
      this.button.setBounds(500, Globals.mainPanelHeight / 2 + 16, 120, 50);
      this.button.setIcon(new ImageIcon("Inventory.png"));
   }

   public void mc3()
   {
      this.button.setBounds(Globals.mainPanelWidth / 2 - 60,
                            Globals.mainPanelHeight / 2 + 16, 120, 50);
      this.button.setIcon(new ImageIcon("Restart.png"));
   }
}
