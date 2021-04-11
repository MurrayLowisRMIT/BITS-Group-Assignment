import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JFrame;

public class Window extends Canvas
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 1L;

   // create window for game and make it accessible to other classes
   public static JFrame window = new JFrame("Earth2022");

   public Window(int width, int height, Earth2022 earth2022)
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

      // calls back to main class to actually run the game
      earth2022.run(this);
   }
}
