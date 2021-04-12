
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;

// these buttons form the main command panel
public class MainPanelCommands extends ButtonMaster
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 1L;

   private Overlay overlay;
   private String overlayType;
   private int sceneID;
   // number of commands available in each scene
   private int[] sceneCommandCount;

   public MainPanelCommands(Overlay overlay, String overlayType)
   {
      this.overlay = overlay;
      this.overlayType = overlayType;

      switch (this.overlayType)
      {
         case "panel":
            panel();
            break;
      }

      // adds button to game window (change this to overlay later)
      Earth2022.window.add(this.button);
   }

   @Override
   public void actionPerformed(ActionEvent e)
   {
      if (e.getSource() == this.button)
      {
         this.overlay.setScene(this.sceneID);
      }
   }

   public void panel()
   {
      this.button.setBounds(200, 200, 120, 120);
      this.button.setText("Angry hobo");
      this.button.setIcon(new ImageIcon("Angry hobo.png"));
      this.sceneID = 1;
   }

   public void s0()
   {
      this.sceneCommandCount[0]++;
   }
}
