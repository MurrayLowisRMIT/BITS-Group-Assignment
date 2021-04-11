import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MainPanel
{
   // set starting scene
   private int sceneID = 1;
   private Scenes scenes;
   private int panelWidth = 800;
   private int panelHeight = 300;

   // main game panel which includes story text, buttons etc.
   private JPanel mainPanel = new JPanel();
   // text body inside main panel area
   private JLabel textArea = new JLabel();

   public MainPanel(Window window)
   {
      mainPanel();
   }

   public void setSceneID(int sceneID)
   {
      this.sceneID = sceneID;
      mainPanel();
   }

   public int getSceneID()
   {
      return this.sceneID;
   }

   public void mainPanel()
   {
      this.scenes = new Scenes(this.sceneID, this);

      System.out.print(this.scenes.getSceneContent()[0]);
      // define border around the main text area
      int borderWeight = 3;
      Border border = BorderFactory.createLineBorder(Color.GREEN, borderWeight);

      // read story text for scene
      this.textArea.setText(this.scenes.getSceneContent()[0]);
      this.textArea.setFont(new Font("arial", Font.PLAIN, 20));
      // this is the text colour
      this.textArea.setForeground(Color.RED);
      this.textArea.setBackground(Color.BLACK);
      // get character image for scene if applicable
      // this.textArea.setIcon(new ImageIcon(this.scenes.getSceneContent()[1];));
      // set location of text relative to image
      this.textArea.setHorizontalTextPosition(JLabel.RIGHT);
      this.textArea.setVerticalTextPosition(JLabel.TOP);
      this.textArea.setOpaque(true);
      this.textArea.setBorder(border);
      // sets label location relative to housing panel
      this.textArea.setVerticalAlignment(JLabel.TOP);
      this.textArea.setHorizontalAlignment(JLabel.LEFT);
      this.textArea.setBounds(10, 10, this.panelWidth - 20,
                              (this.panelHeight - 10) / 2);

      // add textArea to mainPanel
      this.mainPanel.add(this.textArea);
      // allows manually specifying where panels are placed
      this.mainPanel.setLayout(null);
      this.mainPanel.setBackground(Color.BLACK);
      // panel position and dimensions
      this.mainPanel.setBounds((Earth2022.windowWidth - this.panelWidth) / 2,
                               Earth2022.windowHeight - this.panelHeight,
                               this.panelWidth,
                               this.panelHeight);

      // output full main panel
      Window.window.add(mainPanel);

      // add main panel buttons here (move above when it starts behaving)
      MainCommands controlPanel = new MainCommands(this);

      // add game interaction buttons here----------------------------------!!!
      // SomeClassName someClassName = new SomeClassName();
   }
}
