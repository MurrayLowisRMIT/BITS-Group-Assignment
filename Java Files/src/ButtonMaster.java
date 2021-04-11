import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

// this class is a template for creating buttons
// these are placeholder values - don't actually change these here
public class ButtonMaster extends JPanel implements ActionListener
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 1L;

   protected JButton button;

   // buttons are created with the below presets, edit as needed
   ButtonMaster()
   {
      button = new JButton();
      button.addActionListener(this);
      // button coordinates and dimensions
      button.setBounds(0, 0, 0, 0);
      // removes focus indicator around button text
      button.setFocusable(false);
      // button background colour
      button.setBackground(new Color(0, 0, 0, 0));
      // set button border
      button.setBorder(null);
      // set to false to have button greyed out
      button.setEnabled(true);
      
      // text on button
      button.setText("");
      // button text decoration
      button.setFont(new Font("arial", Font.BOLD, 10));
      // text colour
      button.setForeground(Color.BLACK);
      // add image to button - insert image address inside brackets
      button.setIcon(null);
      // places button text relative to button icon
      button.setHorizontalTextPosition(JButton.CENTER);
      button.setVerticalTextPosition(JButton.CENTER);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      // leave this blank
   }
}
