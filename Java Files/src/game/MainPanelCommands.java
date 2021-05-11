package game;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

// these buttons form the interactive scene commands
public class MainPanelCommands extends Commands
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 7810649496279389274L;

   public MainPanelCommands(int globalID, int localID)
   {
      super(globalID, localID);
      super.buttonTemplate();
      newButton();
   }

   protected void newButton()
   {
      // features common to all main panel buttons
      // this overwrites changes made to individual buttons below 
      this.button.setBorder(BorderFactory.createEtchedBorder());
      this.button.setVerticalTextPosition(JButton.CENTER);

      super.buttonAction();
      // adds button to scene
      Globals.mainPanelCommands[this.localID] = this.button;
   }

   protected void selectCommand()
   {
      switch (this.globalID)
      {
         case 0:
            mc0();
            break;
         case 1:
            mc1();
            break;
         case 2:
            mc2();
            break;
         case 3:
            mc3();
            break;
         case 4:
            mc4();
            break;
         case 5:
            mc5();
            break;
         case 6:
            mc6();
            break;
         case 7:
            mc7();
            break;
         case 8:
            mc8();
            break;
         case 9:
            mc9();
            break;
         case 10:
            mc10();
            break;
      }
   }

   // BUTTON CONTENT BEGINS HERE-----------------------------------------------
   // -------------------------------------------------------------------------

   
   public void icon(String image)
   {
      
   }
   // open/close inventory
   public void mc0()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth - 150, 0, 120, 50);
         icon("Inventory.png");
         this.button.setIcon(new ImageIcon("Inventory.png"));
         // this line is exclusive to the inventory button
         this.button.setEnabled(true);
      }
      else
      // action --------------------------------------
      {
         if (Globals.stats.inventoryOverlayActive)
         {
            Globals.stats.inventoryOverlayActive = false;
         }
         else
         {
            Globals.stats.inventoryOverlayActive = true;
         }
      }
   }

   // restart game
   public void mc1()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.button.setIcon(new ImageIcon("Restart.png"));
      }
      else
      // action --------------------------------------
      {
         Globals.stats = new Stats();
      }
   }

   public void mc2()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.text = "Open the comic and take it";
         this.button.setBounds(100, 0, 120, 50);
      }
      else
      // action --------------------------------------
      {
         Globals.stats.comicBookDecision = 1;
         Globals.stats.comicBook = 1;
      }
   }

   public void mc3()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.text = "Destroy the comic";
         this.button.setBounds(250, 0, 120, 50);
      }
      else
      // action --------------------------------------
      {
         Globals.stats.comicBookDecision = 2;
      }
   }

   public void mc4()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.text = "Ignore the comic and keep walking";
         this.button.setBounds(400, 0, 120, 50);
      }
      else
      // action --------------------------------------
      {
         Globals.stats.comicBookDecision = 3;
      }
   }

   public void mc5()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.text = "Continue";
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 4;
      }
   }

   public void mc6()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.text = "Pat the dog";
         this.button.setBounds(100, 0, 120, 50);
      }
      else
      // action --------------------------------------
      {
         Globals.stats.dogDecision = 1;
      }
   }

   public void mc7()
   {
      if (action == false)
      // draw ----------------------------------------
      {

         this.text = "Feed the dog";
         this.button.setBounds(250, 0, 120, 50);
      }
      else
      // action --------------------------------------
      {
         Globals.stats.dogDecision = 2;
      }
   }

   public void mc8()
   {
      if (action == false)
      // draw ----------------------------------------
      {

         this.text = "Ignore the dog";
         this.button.setBounds(400, 0, 120, 50);
      }
      else
      // action --------------------------------------
      {
         Globals.stats.dogDecision = 3;
      }
   }

   public void mc9()
   {
      if (action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }

   public void mc10()
   {
      if (action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }
}
