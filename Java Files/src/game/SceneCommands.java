package game;

import java.awt.Font;

import javax.swing.JButton;

// these buttons form the interactive scene commands
public class SceneCommands extends Commands
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 7810649496279389274L;

   public SceneCommands(int globalID, int localID)
   {
      super(globalID, localID);
      super.buttonTemplate();
      newButton();
   }

   // includes features common to all scene buttons
   protected void newButton()
   {
      this.button.setFont(new Font("arial", Font.BOLD, 15));
      this.button.setBorder(null);
      if (!this.enabled)
      {
         this.button.setVerticalTextPosition(JButton.TOP);
         this.button.setContentAreaFilled(false);
      }
      this.enabled = true;

      super.buttonAction();
      // adds button to scene
      Globals.sceneCommands[this.localID] = this.button;
   }

   protected void selectCommand()
   {
      switch (this.globalID)
      {
         case -4:
            title();
            break;
         case -3:
            startGame();
            break;
         case -2:
            tutorial();
            break;
         case -1:
            artPack();
            break;
         case 0:
            sc0();
            break;
         case 1:
            sc1();
            break;
         case 2:
            sc2();
            break;
         case 3:
            sc3();
            break;
         case 4:
            sc4();
            break;
         case 5:
            sc5();
            break;
         case 6:
            sc6();
            break;
         case 7:
            sc7();
            break;
         case 8:
            sc8();
            break;
         case 9:
            sc9();
            break;
         case 10:
            sc10();
            break;
         case 11:
            sc11();
            break;
         case 12:
            sc12();
            break;
         case 13:
            sc13();
            break;
         case 14:
            sc14();
            break;
         case 15:
            sc15();
            break;
         case 16:
            sc16();
            break;
         case 17:
            sc17();
            break;
         case 18:
            sc18();
            break;
         case 19:
            sc19();
            break;
         case 20:
            sc20();
            break;
      }
   }

   // BUTTON CONTENT BEGINS HERE-----------------------------------------------
   // -------------------------------------------------------------------------

   // main menu title
   public void title()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("Title.png");
         this.button.setBounds((Globals.windowWidth - 400) / 2, 50, 400, 200);
         this.enabled = true;
         this.button.setEnabled(true);
         this.button.setCursor(null);
      }
   }

   // start game button
   public void startGame()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("New Game.png");
         this.button.setBounds((Globals.windowWidth - 200) / 2, 300, 200, 80);
         this.enabled = true;
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 0;
      }
   }

   // start tutorial
   public void tutorial()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("Tutorial.png");
         this.button.setBounds((Globals.windowWidth - 200) / 2, 400, 200, 80);
         this.enabled = true;
      }
      else
      // action --------------------------------------
      {

      }
   }

   // change art pack
   public void artPack()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("Art Pack.png");
         this.button.setBounds((Globals.windowWidth - 200) / 2, 500, 200, 80);
         this.enabled = true;
      }
      else
      // action --------------------------------------
      {
         if (Globals.stats.artPack == "Final")
         {
            Globals.stats.artPack = "Placeholder";
         }
         else
         {
            Globals.stats.artPack = "Final";
         }
      }
   }

   // pick up radio
   public void sc0()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("radio on table.png");
         this.button.setBounds(90, 470, 122, 61 + 60);
         this.text = "Pick up radio";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.radio++;
      }
   }

   // pick up bandages
   public void sc1()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("Bandage.png");
         this.button.setBounds(Globals.windowWidth - 180, 520, 89, 74 + 60);
         this.text = "Pick up bandages";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.bandages++;
         Globals.stats.check = true;
      }
   }

   // scene 3 shadowy figure
   public void sc2()
   {
      overlayImage("Shadowman.png");
      this.button.setBounds((Globals.windowWidth - 425) / 2,
                            Globals.windowHeight - Globals.mainPanelHeight - 207,
                            159,
                            207);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 3 go left
   public void sc3()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setHorizontalAlignment(JButton.LEFT);
         this.button.setBounds(Globals.windowWidth/2 - 120, 120, 110, 60);
         this.text = "Go left";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 4;
      }
   }

   // scene 3 go right
   public void sc4()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setHorizontalAlignment(JButton.RIGHT);
         this.button.setBounds(Globals.windowWidth/2 + 30, 120, 110, 60);
         this.text = "Go right";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 104;
      }
   }

   // scene 3 sign
   public void sc5()
   {
      overlayImage("intersection sign.png");
      this.button.setBounds(Globals.windowWidth / 2 - 107 / 2, 69, 107, 257);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 4 comic
   public void sc6()
   {
      overlayImage("Comic.png");
      this.button.setBounds(Globals.windowWidth / 2, 280, 129, 156);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 4 reading comic
   public void sc7()
   {
      overlayImage("Reading comic.png");
      this.button.setBounds(400,
                            Globals.windowHeight - Globals.mainPanelHeight - 312,
                            498,
                            312);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 4 broken comic
   public void sc8()
   {
      overlayImage("Broken Comic.png");
      this.button.setBounds(350,
                            Globals.windowHeight - Globals.mainPanelHeight - 309,
                            480,
                            309);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 5 dog first appearance
   public void sc9()
   {
      overlayImage("dog standing.png");
      this.button.setBounds(400, 200, 244, 192);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 1 hand holding radio
   public void sc10()
   {
      overlayImage("hand holding radio.png");
      this.button.setBounds(400,
                            Globals.windowHeight - Globals.mainPanelHeight - 450,
                            446,
                            450);
      this.button.setEnabled(true);
      this.button.setCursor(null);

   }

   // scene 5 dog being petted
   public void sc11()
   {
      overlayImage("Dog front.png");
      this.button.setBounds(Globals.mainPanelWidth / 2 + 100, 100, 370, 523);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   public void sc12()
   {

   }

   // scene 5 hand petting dog
   public void sc13()
   {
      overlayImage("Hand to Dog.png");
      this.button.setBounds(Globals.mainPanelWidth / 2 + 100 - 250, 200, 482, 354);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 5 dog eating
   public void sc14()
   {
      overlayImage("dog eat bread.png");
      this.button.setBounds(420, 250, 214, 138);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // dog following player
   public void sc15()
   {
      overlayImage("following dog.png");
      this.button.setBounds(800,
                            Globals.windowHeight - Globals.mainPanelHeight - 61,
                            145,
                            61);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // shelter in distance
   public void sc16()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("shelter.png");
         this.button.setBounds(200,
                               261,
                               145,
                               61);
         this.text = "Search for shelter";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 10;
      }
   }

   // scene 5 - continue to walk
   public void sc17()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setBounds(550,
                               250,
                               200,
                               50);
         this.text = "Continue to walk";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 10;
      }
   }

   public void sc18()
   {

   }

   public void sc19()
   {

   }

   public void sc20()
   {

   }
}
