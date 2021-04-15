package game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Overlay
{
   public Overlay()
   {
      mainPanelOverlay();
      sceneOverlay();
   }

   public void mainPanelOverlay()
   {
      // text body inside main panel area
      JLabel textField = new JLabel();
      // read story text for scene
      textField.setText(Globals.scenes.text);
      textField.setFont(new Font("arial", Font.PLAIN, 20));
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

      // set up main panel which includes the text area and main commands
      JPanel mainPanel = new JPanel(null);
      // allows manually specifying where panels are placed
      // perhaps change this to 'flow' later
      mainPanel.setLayout(null);
      mainPanel.setBackground(Color.BLACK);
      // panel position and dimensions
      mainPanel.setBounds((Globals.windowWidth - Globals.mainPanelWidth) / 2,
                          Globals.windowHeight - Globals.mainPanelHeight,
                          Globals.mainPanelWidth,
                          Globals.mainPanelHeight);
      mainPanel.add(textField);

      // add buttons
      for (int i = 0; i < Globals.mainPanelCommands.length; i++)
      {
         if (Globals.mainPanelCommands[i] != null)
         {
            mainPanel.add(Globals.mainPanelCommands[i]);
         }
      }

      // output overlay
      Globals.content.add(mainPanel);
   }

   public void sceneOverlay()
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

      // add buttons
      for (int i = 0; i < Globals.sceneCommands.length; i++)
      {
         if (Globals.sceneCommands[i] != null)
         {
            Globals.content.add(Globals.sceneCommands[i]);
         }
      }

      // output overlay
      Globals.content.add(background);
   }
}
