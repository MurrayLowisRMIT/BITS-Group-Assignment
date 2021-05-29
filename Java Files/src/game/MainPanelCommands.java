package game;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

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

   // includes features common to all main panel buttons
   protected void newButton()
   {
      // changes colour if inventory is open
      if (Globals.stats.inventoryOverlayActive & !this.enabled)
      {
         this.button.setForeground(new Color(123, 116, 81));
         this.button.setBackground(new Color(227, 225, 213));
      }
      else
      {
         this.button.setForeground(new Color(53, 46, 10));
         this.button.setBackground(new Color(243, 235, 197));
      }
      this.button.setFont(new Font("arial", Font.BOLD, 15));
      this.button.setVerticalAlignment(JButton.CENTER);
      // reset 'enabled' check
      this.enabled = true;

      super.buttonAction();
      // adds button to scene
      Globals.mainPanelCommands[this.localID] = this.button;
   }

   protected void selectCommand()
   {
      switch (this.globalID)
      {
         case -1:
            mc_1(); // play again
            break;
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
         case 100:
            mc100(); // go to death scene
            break;
         case 200:
            mc13();
            break;
         case 201:
            mc14();
            break;
         case 202:
            mc15();
            break;
         case 203:
            mc16();
            break;
         case 204:
            mc17();
            break;
         case 205:
            mc18();
            break;
         case 206:
            mc19();
            break;
         case 207:
            mc20();
            break;
         case 208:
            mc21();
            break;
         case 209:
            mc22();
            break;
         case 210:
            mc23();
            break;
         case 211:
            mc24();
            break;
         case 212:
            mc25();
            break;
         case 213:
            mc26();
            break;
         case 214:
            mc27();
            break;
         case 36:
            mc36();
            break;
      }
   }

   // BUTTON CONTENT BEGINS HERE-----------------------------------------------
   // -------------------------------------------------------------------------

   // restart game
   public void mc_1()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Game over";
      }
      else
      // action --------------------------------------
      {
         Globals.newGame();
      }
   }

   // open/close inventory
   public void mc0()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         icon("Inventory.png");
         this.button.setBounds(Globals.mainPanelWidth - 150, 0, 120, 50);
         // stops button being disabled by the inventory overlay
         this.button.setEnabled(true);
         // allow this button to keep colour with inventory open
         this.enabled = true;
      }
      else
      // action --------------------------------------
      {
         if (Globals.stats.inventoryOverlayActive)
         {
            Globals.stats.inventoryOverlayActive = false;
            Globals.stats.mainPanelOverlayActive = true;
            Globals.stats.sceneOverlayActive = true;
         }
         else
         {
            Globals.stats.inventoryOverlayActive = true;
            Globals.stats.mainPanelOverlayActive = false;
            Globals.stats.sceneOverlayActive = false;
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
         // blank - function determined by scene class statements
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

   public void mc6()
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

   // scene 4 - go to scene 5
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
         Globals.stats.staticSceneID = 5;
      }
   }

   // scene 4_1 pat dog
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

   // scene 4_1 feed dog
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

   // scene 4_1 ignore dog
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

   // scene 6_1 repair aerial id 200
   public void mc13()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(500, 0, 120, 50);
         this.text = "Try to repair the aerial";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.radioDecision = 1;
      }
   }

   // scene 6_1 check cb id 201
   public void mc14()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(300, 0, 120, 50);
         this.text = "See if the CB radio is working";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.radioDecision = 3;
      }
   }

   // scene 6_1 try fix screen id 202
   public void mc15()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(100, 0, 120, 50);
         this.text = "Try to repair the screen";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.radioDecision = 2;
      }
   }

   // scene 6 - go to scene 6_1 id 203
   public void mc16()
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
         Globals.stats.staticSceneID = 201;
      }
   }

   // scene 6_1/12_1 - go to scene 7 id 204
   public void mc17()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         if (Globals.stats.minigameA == false)
         {
            this.text = "Follow the road";
         }
         else if (Globals.stats.minigameA == true)
         {
            this.button.setBounds(Globals.mainPanelWidth / 2 - 100, 0, 120, 50);
            this.text = "Follow CB";
         }
         else
         {
            this.text = "Continue";
         }
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 202;
      }
   }

   // S8_1B sent away
   public void mc100()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Attempt to kick down door";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = -1; // set to death scene from Tom's !!!
                                           // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      }
   }

   // scene 6_1/7 - go to scene 8 id 205
   public void mc18()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         if (Globals.stats.radioDecision == 3 || Globals.stats.minigameA == true)
         {
            this.button.setBounds(Globals.mainPanelWidth / 2 - 1, 0, 120, 50);
            this.text = "Follow Road";
         }
         else
         {
            this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
            this.text = "Continue";
         }
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 203;
      }
   }

   // scene 7 - go to scene 9 id 206
   public void mc19()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         if (Globals.stats.radioDecision == 3 || Globals.stats.minigameA == true)
         {
            this.button.setBounds(Globals.mainPanelWidth / 2 - 200, 0, 120, 50);
            this.text = "Follow CB";
         }
         else
         {
            this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
            this.text = "Right";
         }
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 204;
      }
   }

   // scene 6_1/7 - go to scene 8 id 207
   public void mc20()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Follow Road";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 203;
      }
   }

   public void mc21() // id 208
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 200, 0, 120, 50);
         this.text = "Left";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 205;
      }
   }

   public void mc22() // id 209
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 200, 0, 120, 50);
         this.text = "Call out";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.doorDecision = 1;
      }
   }

   public void mc23() // id 210
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Break in";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.doorDecision = 2;
      }
   }

   public void mc24() // id 211
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 100, 0, 120, 50);
         this.text = "Follow the wall";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 205;
      }
   }

   public void mc25() // id 212
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 100, 0, 120, 50);
         this.text = "Introduce yourself";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 206;
      }
   }

   public void mc26() // id 213
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 200, 0, 120, 50);
         this.text = "Yes";
      }
      else
      // action --------------------------------------
      {
         if (Globals.stats.comicBook == 1)
            Globals.stats.staticSceneID = 209;
         else
            Globals.stats.staticSceneID = 207;
      }
   }

   public void mc27() // id 214
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "No";
      }
      else
      // action --------------------------------------
      {
         if (Globals.stats.comicBook == 1)
            Globals.stats.staticSceneID = 207;
         else
            Globals.stats.staticSceneID = 209;
      }
   }

   public void mc36()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
         this.text = "Slowly back away";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 37;
      }
   }
}