package game;

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
      // features common to all scene buttons
      // this overwrites changes made to individual buttons below
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

   public void sceneImage(String image)
   {
      String packType;
      
   }
   
   public void sc0()
   {
      if (action == false)
      // draw ----------------------------------------
      {
         this.button.setContentAreaFilled(false);
         this.button.setIcon(new ImageIcon("../Art/Overlay/CB Radio.png"));
         this.button.setBounds(800, 50, 49, 140);
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
         this.button.setContentAreaFilled(false);
         this.button.setIcon(new ImageIcon("../Art/Icons/Arrow Left.png"));
         this.button.setBounds(400, 200, 60, 80);
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
         this.button.setContentAreaFilled(false);
         sceneImage("Arrow Right.png");
         this.button.setIcon(new ImageIcon("../Art/Icons/Arrow Right.png"));
         this.button.setBounds(800, 200, 60, 80);
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
         this.button.setContentAreaFilled(false);
         this.button.setIcon(new ImageIcon("../Art/Overlay/Hand to Dog.png"));
         this.button.setBounds(100, 250, 482, 354);
         // these make it behave like part of the image and not a button
         this.button.setCursor(null);
         this.button.setEnabled(true);
         
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
         this.button.setContentAreaFilled(false);
         this.button.setIcon(new ImageIcon("../Art/Overlay/Dog Front.png"));
         this.button.setBounds(400, 100, 370, 523);
         // these make it behave like part of the image and not a button
         this.button.setCursor(null);
         this.button.setEnabled(true);
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
         this.button.setContentAreaFilled(false);
         this.button.setIcon(new ImageIcon("../Art/Overlay/Comic.png"));
         this.button.setBounds(400, 100, 370, 523);
         // these make it behave like part of the image and not a button
         this.button.setCursor(null);
         this.button.setEnabled(true);

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
         this.button.setContentAreaFilled(false);
         this.button.setIcon(new ImageIcon("../Art/Overlay/Broken Comic.png"));
         this.button.setBounds(100, 100, 1117, 728);
         // these make it behave like part of the image and not a button
         this.button.setCursor(null);
         this.button.setEnabled(true);

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
