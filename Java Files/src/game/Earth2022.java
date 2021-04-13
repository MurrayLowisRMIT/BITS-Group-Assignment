package game;

public class Earth2022
{
   public Earth2022()
   {
      new Globals(this);
   }

   public void run()
   {
      // record current time in nanoseconds
      long previous = System.nanoTime();
      int framerate = 30;
      double frameDuration = 1000000000 / framerate;
      double delta = 0;
      // this is probably bad coding - a problem for later if there's time
      while (true)
      {
         long current = System.nanoTime();
         delta += (current - previous) / frameDuration;
         previous = current;
         while (delta >= 1)
         {
            delta--;
            // run the 'tick()' method at specified framerate
            tick();
         }
         Globals.staticOverlay.updateScene();
         Globals.scenes.updateScene();
         System.out.print(Globals.scenes.text + "\n");
         System.out.print(Globals.staticSceneID + "\n");      
      }
   }

   // method to run with every frame update - currently buggy
   public void tick()
   {
      
   }

   public static void main(String args[])
   {
      new Earth2022();
   }
}
