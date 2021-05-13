package game;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Overlay
{
   // determine which overlays should be active
   public Overlay()
   {
      // the overlay that needs to be drawn on top is to be listed first
      if (Globals.stats.inventoryOverlayActive)
         inventoryOverlay();
      if (Globals.stats.mainPanelOverlayActive)
         mainPanelOverlay();
      if (Globals.stats.sceneOverlayActive)
         sceneOverlay();

      background();
   }

   // draws main command area at the bottom of the screen
   public void mainPanelOverlay()
   {
      // text body inside main panel area
      JLabel textField = new JLabel();
      // read story text for scene - the html adds text wrapping
      textField.setText("<html><p>" + Globals.scenes.text + "</p></html>");
      textField.setFont(new Font("arial", Font.PLAIN, 15));
      // this is the text colour
      textField.setForeground(Color.RED);
      textField.setBackground(Color.BLACK);
      // get character image for scene if applicable
      textField.setIcon(Globals.scenes.characterImage);
      // set location of text relative to image
      textField.setHorizontalTextPosition(JLabel.RIGHT);
      textField.setVerticalTextPosition(JLabel.TOP);
      textField.setOpaque(true);
      // define border around the main text area
      textField.setBorder(BorderFactory.createLineBorder(Color.CYAN, 3));
      // sets textField location relative to housing panel
      textField.setVerticalAlignment(JLabel.TOP);
      textField.setHorizontalAlignment(JLabel.LEFT);
      textField.setBounds(10,
                          10,
                          Globals.mainPanelWidth - 20,
                          (Globals.mainPanelHeight - 10) / 2);

      JPanel buttonPanel = new JPanel();
      // allows manually specifying where panels are placed
      buttonPanel.setLayout(null);
      buttonPanel.setBackground(Color.DARK_GRAY);
      // panel position and dimensions
      buttonPanel.setBounds(10,
                            (Globals.mainPanelHeight - 10) / 2 + 20,
                            Globals.mainPanelWidth - 20,
                            (Globals.mainPanelHeight - 10) / 2);

      // set up main panel which includes the text area and main commands
      JPanel mainPanel = new JPanel(null);
      // allows manually specifying where panels are placed
      mainPanel.setLayout(null);
      mainPanel.setBackground(Color.DARK_GRAY);
      // panel position and dimensions
      mainPanel.setBounds((Globals.windowWidth - Globals.mainPanelWidth) / 2,
                          Globals.windowHeight - Globals.mainPanelHeight,
                          Globals.mainPanelWidth,
                          Globals.mainPanelHeight);
      mainPanel.add(textField);
      mainPanel.add(buttonPanel);

      // add buttons
      for (int i = 0; i < Globals.mainPanelCommands.length; i++)
      {
         if (Globals.mainPanelCommands[i] != null)
         {
            buttonPanel.add(Globals.mainPanelCommands[i]);
         }
      }

      // output overlay
      Globals.content.add(mainPanel);
   }

   // add buttons to background
   public void sceneOverlay()
   {
      // add buttons
      for (int i = 0; i < Globals.sceneCommands.length; i++)
      {
         if (Globals.sceneCommands[i] != null)
         {
            Globals.content.add(Globals.sceneCommands[i]);
         }
      }
   }

   // draws inventory layer
   public void inventoryOverlay()
   {

      // set up main panel which includes the text area and main commands
      JPanel inventoryOverlay = new JPanel(null);
      // allows manually specifying where panels are placed
      inventoryOverlay.setLayout(null);
      inventoryOverlay.setBackground(Color.BLACK);
      // panel position and dimensions
      inventoryOverlay.setBounds((Globals.windowWidth - Globals.mainPanelWidth) / 2 +
                                 Globals.mainPanelWidth,
                                 0,
                                 (Globals.windowWidth - Globals.mainPanelWidth) / 2,
                                 Globals.windowHeight);

      // heading shown in inventory panel
      JLabel inventoryHeading = new JLabel();
      // the html adds text wrapping
      inventoryHeading.setText("<html><p>Inventory</p></html>");
      inventoryHeading.setFont(new Font("arial", Font.PLAIN, 25));
      // text colour
      inventoryHeading.setForeground(Color.RED);
      // location relative to housing panel
      inventoryHeading.setVerticalAlignment(JLabel.TOP);
      inventoryHeading.setBounds(30,
                                 10,
                                 100,
                                 100);

      // add heading to inventory JPanel
      inventoryOverlay.add(inventoryHeading);
      // add inventory to JPanel as buttons
      for (int i = 0; i < Globals.stats.inventory.length; i++)
      {
         inventoryOverlay.add(Globals.inventory[i]);
      }

      // output overlay
      Globals.content.add(inventoryOverlay);
   }

   public void background()
   {
      // add background image
      JLabel background = new JLabel();
      background.setIcon(Globals.scenes.backgroundImage);
      // default background colour in case no image added or in case of error
      background.setBackground(Color.RED);
      background.setOpaque(true);
      background.setBounds(0,
                           0,
                           Globals.windowWidth,
                           Globals.windowHeight);

      // output overlay
      Globals.content.add(background);
   }
}
