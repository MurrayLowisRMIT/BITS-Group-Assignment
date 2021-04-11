
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

public class MainCommands extends ButtonMaster
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 1L;
   
   private MainPanel mainPanel;
   MainCommands(MainPanel mainPanel)
   {
      this.mainPanel = mainPanel;
      
      button.setBounds(200, 200, 120, 120);
      button.setText("Angry hobo");
      ImageIcon image = new ImageIcon("Angry hobo.png");
      button.setIcon(image);

      // adds button to game window (change this to mainPanel later)
      Window.window.add(button);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == button)
      {
         System.out.print("\nThe hobo bites you\n");
         this.mainPanel.setSceneID(2);
      }
   }
}
