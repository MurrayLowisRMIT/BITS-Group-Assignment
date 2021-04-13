package game;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Overlay
{

   public Overlay(Earth2022 earth2022)
   {

   }

   public void updateScene()
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
      int borderWeight = 3;
      Border border = BorderFactory.createLineBorder(Color.GREEN, borderWeight);
      textField.setBorder(border);
      // sets textField location relative to housing panel
      textField.setVerticalAlignment(JLabel.TOP);
      textField.setHorizontalAlignment(JLabel.LEFT);
      textField.setBounds(10,
                          10,
                          Globals.mainPanelWidth - 20,
                          (Globals.mainPanelHeight - 10) / 2);

      // set background image for scene
      JLabel background = new JLabel();
      // set single colour background in case no image or image fails to load
      background.setBackground(Color.BLACK);
      // set background image
      background.setIcon(Globals.scenes.backgroundImage);
      background.setBounds(0,
                           0,
                           Globals.windowWidth,
                           Globals.windowHeight);

      // add to mainPanelOverlay
      Globals.window.add(background);
      Globals.mainPanel.add(textField);
   }

   public void sceneOverlay()
   {
      // this.scenes = new SceneBuilder(this.sceneID, this);
      // this.overlayType = "scenery";
      //
      // System.out.print(this.scenes.getSceneContent()[0]);
      //
      // // get image for button
      // this.textField.setIcon(new ImageIcon(this.scenes.getSceneContent()[1]));
      // this.textField.setOpaque(true);
      // this.textField.setBorder(null);
      // // sets textField location relative to housing panel
      // this.textField.setVerticalAlignment(JLabel.TOP);
      // this.textField.setHorizontalAlignment(JLabel.LEFT);
      // // set coordinates for button
      // this.textField.setBounds(100, 100, 50, 50);
      //
      // // add textField to panel
      // this.overlay.add(this.textField);
      // // allows manually specifying where panels are placed
      // this.overlay.setLayout(null);
      // this.overlay.setBackground(Color.BLACK);
      // // panel position and dimensions
      // this.overlay.setBounds(0,
      // 0,
      // Earth2022.windowWidth,
      // Earth2022.windowHeight);
      //
      // // output mainPanelOverlay panels to window
      // Earth2022.window.add(this.overlay);
      //
      // // add main panel buttons here (move above when it starts behaving)
      // new MainPanelCommands(this, 1);
   }
}
