package game;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// this contains all the variables and instances common across the game
public class Globals
{
   // create window for the game to run in
   public static JFrame window = new JFrame("Earth2022");
   public static Container content = window.getContentPane();

   // the full database of all scenes and their content
   public static Scenes scenes = new Scenes();
   // the ID number of the current scene - starts at 0
   public static int staticSceneID = 0;
   // the list of buttons in current scene
   public static JButton[] mainPanelCommands;
    public static JButton[] sceneCommands;

   // game window resolution
   public static final int windowWidth = 1280;
   public static final int windowHeight = 720;
   // main panel dimensions
   public static final int mainPanelWidth = windowWidth * 2 / 3;
   public static final int mainPanelHeight = windowHeight * 1 / 3;;

   public Globals()
   {
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

      update();
   }

   // method to run with every player action
   public static void update()
   {
      Globals.content.removeAll();
      scenes.updateScene();
      ((JPanel) Globals.content).repaint();
      System.out.print(Globals.scenes.text + "\n"); // delete later
      System.out.print(Globals.staticSceneID + "\n"); // delete later
   }
}
