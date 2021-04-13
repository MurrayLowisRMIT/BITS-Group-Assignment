package game;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

// this contains all the variables and instances that are common across the game
public class Globals
{
   // contains all panels, labels and buttons overlaid over the screen
   public static Overlay staticOverlay;
   // the ID number of the current scene
   public static int staticSceneID;
   // the full database of all scenes and their content
   public static Scenes scenes;

   // create window for the game to run in
   public static JFrame window = new JFrame("Earth2022");
   // game window resolution
   public static final int windowWidth = 1280;
   public static final int windowHeight = 720;
   // set up main panel which includes the text area and main commands
   public static JPanel mainPanel;
   // main panel dimensions
   public static final int mainPanelWidth = windowWidth * 2 / 3;
   public static final int mainPanelHeight = windowHeight * 1 / 3;;

   public Globals(Earth2022 earth2022)
   {
      staticOverlay = new Overlay(earth2022);
      // starting scene
      staticSceneID = 0;
      scenes = new Scenes();
      mainPanel = new JPanel();

      // makes program actually shutdown when closed
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // allows for manual positioning of elements within window
      window.setLayout(null);
      // set window dimensions
      window.setSize(windowWidth, windowHeight);
      // window can't be resized
      window.setResizable(false);
      // window is not placed relative to a point on the screen (starts in centre)
      window.setLocationRelativeTo(null);
      // makes window visible
      window.setVisible(true);
      window.getContentPane().setBackground(Color.RED);

      // allows manually specifying where panels are placed
      mainPanel.setLayout(null);
      mainPanel.setBackground(Color.BLACK);
      // panel position and dimensions
      mainPanel.setBounds((windowWidth - mainPanelWidth) / 2,
                          windowHeight - mainPanelHeight,
                          mainPanelWidth,
                          mainPanelHeight);
      // output mainPanelOverlay panels to window
      window.add(Globals.mainPanel);
   }

}
