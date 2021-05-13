package game;

import java.awt.Cursor;

import javax.swing.BorderFactory;

// these buttons form the inventory
public class Inventory extends Commands
{
   // I don't know what this does, but it complains without it
   private static final long serialVersionUID = 7810649496279389274L;
   // vertical position of button in inventory panel
   private int buttonYPos = 70;

   // localID not used
   public Inventory(int globalID, int localID)
   {
      super(globalID, localID);
      Globals.stats.updateInventoryArray();
      if (Globals.stats.inventory[globalID] != 0)
      {
         for (int i = 0; i < Globals.stats.inventory.length; i++)
         {
            if (Globals.stats.inventory[i] != 0 & globalID > i)
            {
               this.buttonYPos += 70;
            }
         }
      }
      super.buttonTemplate();
      newButton();
   }

   protected void newButton()
   {
      // features common to all inventory panel buttons
      // this overwrites changes made to individual buttons below
      this.button.setBorder(BorderFactory.createEtchedBorder());
      // prevents being disabled by the main panel inventory button
      this.button.setEnabled(true);
      this.button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

      super.buttonAction();
      // adds button to scene
      Globals.inventory[this.globalID] = this.button;
   }

   // remember to update Scenes.staticInventory above to match this
   protected void selectCommand()
   {
      switch (this.globalID)
      {
         case 0:
            i0();
            break;
         case 1:
            i1();
            break;
         case 2:
            i2();
            break;
         case 3:
            i3();
            break;
         case 4:
            i4();
            break;
         case 5:
            i5();
            break;
         case 6:
            i6();
            break;
         case 7:
            i7();
            break;
         case 8:
            i8();
            break;
         case 9:
            i9();
            break;
      }
   }

   // adds dimensions and position to button to make it visible
   private void add()
   {
      this.button.setBounds(20, this.buttonYPos, 120, 50);
   }
   // BUTTON CONTENT BEGINS HERE-----------------------------------------------
   // -------------------------------------------------------------------------

   public void i0()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {
         if (Globals.stats.radio != 0)
         {
            icon("Radio.png");
            add();
         }
         else
         {

         }
      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i1()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {
         if (Globals.stats.comicBook != 0)
         {
            icon("Comic.png");
            add();
         }
      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i2()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {
         if (Globals.stats.bandages != 0)
         {
            icon("Bandages.png");
            add();
         }
      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i3()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i4()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i5()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i6()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i7()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i8()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }

   public void i9()
   {
      if (this.action == false)
      // draw ----------------------------------------
      {

      }
      else
      // action --------------------------------------
      {

      }
   }
}
