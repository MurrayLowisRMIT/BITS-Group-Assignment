package game;

public class Earth2022
{
   public Earth2022()
   {
      new Globals();
   }

//   public void run()
//   {
//      // record the current time to the nearest nanosecond
//      long previous = System.nanoTime();
//      int framerate = 5;
//      double frameDuration = 1000000000 / framerate;
//      double delta = 0;
//      // this is probably bad coding - a problem for later if there's time
//      while (true)
//      {
//         long current = System.nanoTime();
//         delta += (current - previous) / frameDuration;
//         previous = current;
//         while (delta >= 1)
//         {
//            delta--;
//            // run the 'tick()' method at specified framerate
//            tick();
//         }
//      }
//   }
//
//   // method to run with every frame
//   public void tick()
//   {
//
//   }

   public static void main(String args[])
   {
      new Earth2022();
   }
}
