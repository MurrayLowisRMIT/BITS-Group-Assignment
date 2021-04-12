import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;

public class Earth2022 extends Canvas
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 1L;

   // game window resolution
   public static final int windowWidth = 1280;
   public static final int windowHeight = 720;
   private MainPanelCommands[] sceneCommands = new MainPanelCommands[10];
   // create window for the game to run in
   public static JFrame window = new JFrame("Earth2022");

   public Earth2022()
   {
      // makes program actually shutdown when closed
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // allows for manual positioning of elements within window
      window.setLayout(null);
      // set window dimensions
      window.setSize(Earth2022.windowWidth, Earth2022.windowHeight);
      // window can't be resized
      window.setResizable(false);
      // window is not placed relative to a point on the screen (starts in centre)
      window.setLocationRelativeTo(null);
      // makes window visible
      window.setVisible(true);
      window.getContentPane().setBackground(Color.RED);

      run();
   }

   // main game loop
   public void run()
   {
      do
      {
         new Overlay(this);
      } while (this.sceneCommands.length > 10);

      // record current time in nanoseconds
      long previous = System.nanoTime();
      // specify 60 frames per second
      double frameLength = 1000000000 / 60;
      double delta = 0;
      boolean running = true;
      while (running)
      {
         // add background images
         // Standard buttons in main text area as objects - inventory/save etc
         // Interactable on screen buttons as array of objects
         // Image included in interactable object or just area of background?

         long current = System.nanoTime();
         delta += (current - previous) / frameLength;
         previous = current;
         while (delta >= 1)
         {
            delta--;
            // run the 'tick()' method at specified framerate
            tick();
         }
      }
   }

   // method to run every frame to check for updates
   // delete later if we can't find a use for this
   public void tick()
   {

   }

   public static void main(String args[])
   {
      new Earth2022();
   }
}
