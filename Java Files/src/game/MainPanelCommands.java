package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

// these buttons form the interactive scene commands
public class MainPanelCommands extends JPanel implements ActionListener
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 7810649496279389274L;

   protected JButton button;
   protected JLabel buttonLabel;
   private int setSceneID;
   private int commandID;

   public MainPanelCommands(int commandID)
   {
      this.commandID = commandID;

      this.button = new JButton();
      // turn panel into button?
      this.button.addActionListener(this);
      // button coordinates and dimensions
      this.button.setBounds(0, 0, 0, 0);
      // removes focus indicator around button text
      this.button.setFocusable(false);
      // button background colour
      this.button.setBackground(new Color(255, 0, 255, 20));
      // set button border
      this.button.setBorder(null);
      // set to false to have button greyed out
      this.button.setEnabled(true);
      // text on button
      this.button.setText("");
      // button text decoration
      this.button.setFont(new Font("arial", Font.BOLD, 10));
      // text colour
      this.button.setForeground(Color.BLACK);
      // add image to button - insert image address inside brackets
      this.button.setIcon(null);
      // places button text relative to button icon
      this.button.setHorizontalTextPosition(JButton.CENTER);
      this.button.setVerticalTextPosition(JButton.CENTER);

      selectCommand();

      // adds button to game window (change this to overlay later)
      Globals.window.add(this.button);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == this.button)
      {
         Globals.staticSceneID = this.setSceneID;
      }
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
      }
   }

   public void p0()
   {
      this.button.setBounds(200, 200, 120, 120);
      this.button.setText("Fight the hobo");
       this.button.setIcon(new ImageIcon("Angry hobo.png"));
      this.setSceneID = 1;

   }

   public void p1()
   {
      this.button.setBounds(500, 200, 120, 120);
      this.button.setText("Placate the hobo");
      this.setSceneID = 2;
   }
}
