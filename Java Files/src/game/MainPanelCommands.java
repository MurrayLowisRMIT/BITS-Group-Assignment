package game;

import javax.swing.BorderFactory;

// these buttons form the commands in the main panel
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
         case 11:
            mc11();
            break;
         case 12:
            mc12();
            break;
         case 13:
            mc13();
            break;
         case 14:
            mc14();
            break;
         case 15:
            mc15();
            break;
         case 16:
            mc16();
            break;
         case 17:
            mc17();
            break;
         case 18:
            mc18();
            break;
         case 19:
            mc19();
            break;
         case 20:
            mc20();
            break;
      }
   }

   // BUTTON CONTENT BEGINS HERE-----------------------------------------------
   // -------------------------------------------------------------------------

   // open/close inventory
   public void mc0()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {
         icon("Inventory.png");
         this.button.setBounds(Globals.mainPanelWidth - 150, 0, 120, 50);
         // stops button being disabled by the inventory overlay
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

   // go to scene 1
   public void mc1()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Continue";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 1;
      }
   }

   // turn on radio
   public void mc2()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Turn on radio";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.radio = 1;
      }
   }

   // "OK" button
   public void mc3()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "OK";
      }
      else
      // action --------------------------------------
      {
         // function determined by scene class statements
      }
   }

   // go to scene 2
   public void mc4()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Follow the signal";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 2;
      }
   }

   // go to scene 3
   public void mc5()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Continue";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 3;
      }
   }

   // scene 4 take comic
   public void mc6()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(80, 0, 120, 50);
         this.text = "Take the comic";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.comicBookDecision = 1;
      }
   }

   // scene 4 ignore comic
   public void mc7()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(220, 0, 120, 50);
         this.text = "Ignore the comic";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.comicBookDecision = 2;
      }
   }

   // scene 4 destroy comic
   public void mc8()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(360, 0, 120, 50);
         this.text = "Destroy the comic";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.comicBookDecision = 3;

      }
   }

   // go to scene 6
   public void mc9()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Continue";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 6;
      }
   }

   // scene 5 pat dog
   public void mc10()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(80, 0, 120, 50);
         this.text = "Pat the dog";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.dogDecision = 1;
      }
   }

   // scene 5 feed dog
   public void mc11()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(220, 0, 120, 50);
         this.text = "Feed the dog";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.dogDecision = 2;
      }
   }

   // scene 5 ignore dog
   public void mc12()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(360, 0, 120, 50);
         this.text = "Ignore the dog";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.dogDecision = 3;

      }
   }

   public void mc13()
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

   public void mc14()
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

   public void mc15()
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

   public void mc16()
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

   public void mc17()
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

   public void mc18()
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

   public void mc19()
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

   public void mc20()
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
