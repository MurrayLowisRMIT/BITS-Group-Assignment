package game;

import java.awt.Color;

import javax.swing.ImageIcon;
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
      // unique placeholder features of scene buttons
      this.button.setContentAreaFilled(false);
      this.button.setBorder(null);
      this.button.setVerticalTextPosition(JButton.TOP);

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
      }
   }

   // BUTTON CONTENT BEGINS HERE-----------------------------------------------
   // -------------------------------------------------------------------------

   public void sc0()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setContentAreaFilled(true);
         this.button.setBackground(Color.RED);
         this.button.setIcon(new ImageIcon("../Art/Overlaid items/CB Radio.png"));
         this.button.setBounds(800, 50, 174, 382);
         this.text = "Go after the signal";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 1;
      }
   }

   public void sc1()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setIcon(new ImageIcon("../Art/Icons/Arrow Left.png"));
         this.button.setBounds(400, 200, 60, 60);
         this.text = "Go left";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 2;
      }
   }

   public void sc2()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setIcon(new ImageIcon("../Art/Icons/Arrow Right.png"));
         this.button.setBounds(800, 200, 60, 60);
         this.text = "Go right";
      }
      else
      // action --------------------------------------
      {
         Globals.stats.staticSceneID = 3;
      }
   }

   public void sc3()
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

   public void sc4()
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

   public void sc5()
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

   public void sc6()
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

   public void sc7()
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

   public void sc8()
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

   public void sc9()
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

   public void sc10()
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
