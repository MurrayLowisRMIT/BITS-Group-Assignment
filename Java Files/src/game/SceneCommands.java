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

   protected void newButton()
   {
      // features common to all scene buttons
      // this overwrites changes made to individual buttons below
      this.button.setFont(new Font("arial", Font.BOLD, 15));
      this.button.setBorder(null);
      this.button.setVerticalTextPosition(JButton.TOP);
      this.button.setContentAreaFilled(false);

      super.buttonAction();
      // adds button to scene
      Globals.sceneCommands[this.localID] = this.button;
   }

   protected void selectCommand()
   {
      switch (this.globalID)
      {
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

   // pick up radio
   public void sc0()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("radio on table.png");
         this.button.setBounds(90, 470, 122, 61 + 30);
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
      // image needs updating!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
      overlayImage("Shadowman.png");
      this.button.setBounds((Globals.windowWidth - 425) / 2,
                            Globals.windowHeight - 600,
                            425,
                            542);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 3 go left
   public void sc3()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         overlayImage("Arrow Left.png");
         this.button.setBounds(100, 200, 116, 59 + 40);
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
         overlayImage("Arrow Right.png");
         this.button.setBounds(Globals.windowWidth - 160, 200, 116, 59 + 40);
         this.text = "Go right";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 5;
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
                            498, 312);
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

   // scene 5 dog being patted
   public void sc10()
   {
      overlayImage("dog standing.png"); // need image!!!
      this.button.setBounds(0, 0, 0, 0);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 5 dog being fed
   public void sc11()
   {
      overlayImage("Dog front.png");
      this.button.setBounds(Globals.mainPanelWidth / 2 + 100, 100, 370, 523);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 5 dog being ignored
   public void sc12()
   {
      overlayImage("Dog front.png");
      this.button.setBounds(Globals.mainPanelWidth / 2 + 400, 300, 370, 523);
      this.button.setEnabled(true);
      this.button.setCursor(null);
   }

   // scene 5 hand patting dog
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
