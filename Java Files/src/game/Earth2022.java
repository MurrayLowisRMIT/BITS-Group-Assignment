package game;

public class Earth2022
{
   public Earth2022()
   {
      // create the overlay which we define in Globals
      new Globals(this);
      
      // record current time in nanoseconds
      long previous = System.nanoTime();
      int framerate = 5;
      double frameDuration = 1000000000 / framerate;
      double delta = 0;
      // this is probably bad coding - a problem for later if there's time
      while (true)
      {
         // add background images
         // Standard buttons in main text area as objects - inventory/save etc
         // Interactable on screen buttons as array of objects
         // Image included in interactable object or just area of background?

         long current = System.nanoTime();
         delta += (current - previous) / frameDuration;
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
   public void tick()
   {
      Globals.staticOverlay.updateScene();
      System.out.print(Globals.staticSceneID + "\n");
   }

   public static void main(String args[])
   {
      new Earth2022();
   }
}
