import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Overlay
{
   // set starting scene
   private int sceneID = 0;
   private Scenes scenes;
   private int panelWidth = 800;
   private int panelHeight = 300;
   private String overlayType;

   // main game panel which includes story text, buttons etc.
   private JPanel overlay = new JPanel();
   // text body inside main panel area
   private JLabel label = new JLabel();

   public Overlay(Earth2022 earth2022)
   {
      overlay();
   }

   public void setScene(int sceneID)
   {
      this.sceneID = sceneID;
      overlay();
   }

   public int getSceneID()
   {
      return this.sceneID;
   }

   public void overlay()
   {
      if (this.overlayType == "panel")
      {
         panelOverlay();
      }
      else
      {
         sceneOverlay();
      }
   }

   public void panelOverlay()
   {
      this.scenes = new Scenes(this.sceneID, this);
      this.overlayType = "panel";

      System.out.print(this.scenes.getSceneContent()[0]);
      // define border around the main text area
      int borderWeight = 3;
      Border border = BorderFactory.createLineBorder(Color.GREEN, borderWeight);

      // read story text for scene
      this.label.setText(this.scenes.getSceneContent()[0]);
      this.label.setFont(new Font("arial", Font.PLAIN, 20));
      // this is the text colour
      this.label.setForeground(Color.RED);
      this.label.setBackground(Color.BLACK);
      // get character image for scene if applicable
      this.label.setIcon(new ImageIcon(this.scenes.getSceneContent()[1]));
      // set location of text relative to image
      this.label.setHorizontalTextPosition(JLabel.RIGHT);
      this.label.setVerticalTextPosition(JLabel.TOP);
      this.label.setOpaque(true);
      this.label.setBorder(border);
      // sets label location relative to housing panel
      this.label.setVerticalAlignment(JLabel.TOP);
      this.label.setHorizontalAlignment(JLabel.LEFT);
      this.label.setBounds(10,
                           10,
                           this.panelWidth - 20,
                           (this.panelHeight - 10) / 2);

      // add label to overlay
      this.overlay.add(this.label);
      // allows manually specifying where panels are placed
      this.overlay.setLayout(null);
      this.overlay.setBackground(Color.BLACK);
      // panel position and dimensions
      this.overlay.setBounds((Earth2022.windowWidth - this.panelWidth) / 2,
                             Earth2022.windowHeight - this.panelHeight,
                             this.panelWidth,
                             this.panelHeight);

      // output overlay panels to window
      Earth2022.window.add(this.overlay);

      // add main panel buttons here (move above when it starts behaving)
      new MainPanelCommands(this, this.overlayType);
   }

   public void sceneOverlay()
   {
      this.scenes = new Scenes(this.sceneID, this);
      this.overlayType = "scenery";

      System.out.print(this.scenes.getSceneContent()[0]);

      // get image for button
      this.label.setIcon(new ImageIcon(this.scenes.getSceneContent()[1]));
      this.label.setOpaque(true);
      this.label.setBorder(null);
      // sets label location relative to housing panel
      this.label.setVerticalAlignment(JLabel.TOP);
      this.label.setHorizontalAlignment(JLabel.LEFT);
      // set coordinates for button
      this.label.setBounds(100, 100, 50, 50);

      // add label to panel
      this.overlay.add(this.label);
      // allows manually specifying where panels are placed
      this.overlay.setLayout(null);
      this.overlay.setBackground(Color.BLACK);
      // panel position and dimensions
      this.overlay.setBounds(0,
                             0,
                             Earth2022.windowWidth,
                             Earth2022.windowHeight);

      // output overlay panels to window
      Earth2022.window.add(this.overlay);

      // add main panel buttons here (move above when it starts behaving)
      new MainPanelCommands(this, this.overlayType);
   }
}
