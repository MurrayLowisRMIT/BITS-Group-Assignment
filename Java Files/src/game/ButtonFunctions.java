package game;

public class ButtonFunctions
{
   public ButtonFunctions(int buttonID)
   {
      // overlay that needs to be drawn on top listed first
      switch (buttonID)
      {
         case 0:
            a0();
            break;
         case 1:
            a1();
            break;
         case 2:
            a2();
            break;
         case 3:
            a3();
            break;
      }
   }

   // BUTTON FUNCTION CONTENT BEGINS HERE--------------------------------------
   // these are the methods called when clicking a button

   public void a0()
   {

   }

   public void a1()
   {

   }

   // toggle inventory
   public void a2()
   {
      if (Globals.stats.inventoryOverlayActive)
      {
         Globals.stats.inventoryOverlayActive = false;
         Globals.stats.sceneOverlayActive = true;
      }
      else
      {
         Globals.stats.inventoryOverlayActive = true;
         Globals.stats.sceneOverlayActive = false;
      }
   }

   // restart game
   public void a3()
   {
      Globals.stats = new Stats();
   }
}
