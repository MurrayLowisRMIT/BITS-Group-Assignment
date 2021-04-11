import java.awt.Canvas;

public class Earth2022 extends Canvas
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 1L;

   // game window resolution
   public static final int windowWidth = 1280;
   public static final int windowHeight = 720;

   public Earth2022()
   {
      // title on game window
      new Window(windowWidth, windowHeight, this);
   }

   // main game loop
   public void run(Window window)
   {
      MainPanel mainPanel = new MainPanel(window);
      System.out.print(mainPanel.getSceneID());

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

         // run the 'tick()' method at specified framerate
         long current = System.nanoTime();
         delta += (current - previous) / frameLength;
         previous = current;
         while (delta >= 1)
         {
            delta--;
            tick();
         }
      }
   }

   // method to run every frame to check for updates
   public void tick()
   {

   }

   public static void main(String args[])
   {
      new Earth2022();
   }
}
