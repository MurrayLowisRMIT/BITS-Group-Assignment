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
public abstract class Commands extends JPanel
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 7810649496279389274L;

   protected JButton button = new JButton();
   // text on button
   protected String text = "";
   // global ID number of the selected button
   protected int globalID;
   // local ID number of the selected button
   protected int localID;
   // decides whether to run the 'draw button function' or 'button clicked function'
   protected static boolean action = false;
   // allows button to maintain unique appearance independent of other factors
   protected boolean enabled;

   public Commands(int globalID, int localID)
   {
      this.globalID = globalID;
      this.localID = localID;
   }

   protected void buttonTemplate()
   {
      // button coordinates and dimensions
      this.button.setBounds(0, 0, 0, 0);
      // removes focus indicator around button text
      this.button.setFocusable(false);
      // set whether to make background opaque (true) or transparent (false)
      this.button.setContentAreaFilled(true);
      // button background colour
      this.button.setBackground(Color.WHITE);
      // set button borders
      this.button.setBorder(BorderFactory.createRaisedSoftBevelBorder());
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
      // changes cursor when mouse hovers over button
      this.button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

      // disables certain buttons when inventory overlay is active
      if (Globals.stats.inventoryOverlayActive)
      {
         // button is greyed out
         this.button.setEnabled(false);
      }
      else
      {
         // button is active
         this.button.setEnabled(true);
      }

      selectCommand();

      // converting to this.text and using html allows for text formatting
      // keep this after 'selectCommand()' method
      this.button.setText("<html><p><center>" + this.text +
                          "<br><br></center></p></html>");
   }

   protected abstract void selectCommand();

   // method called when button is clicked
   protected void buttonAction()
   {
      this.button.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent event)
         {
            // method will run 'button clicked' function when called
            action = true;
            selectCommand();
            // method will run 'draw button' function when called
            action = false;
            Globals.update();
         }
      });
   }

   // method to select image to use as button icon
   protected void icon(String image)
   {
      this.button.setIcon(new ImageIcon("../Art/" + Globals.stats.artPack +
                                        " Art/Icon/" + image));
   }

   // method to select image for overlaid buttons/images etc.
   public void overlayImage(String image)
   {
      this.button.setIcon(new ImageIcon("../Art/" + Globals.stats.artPack +
                                        " Art/Overlay/" + image));
   }
}
