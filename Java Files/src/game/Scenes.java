package game;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Scenes
{
   // text output to the text box
   protected String text;
   // image of character currently speaking
   protected ImageIcon characterImage;
   protected ImageIcon backgroundImage;
   // list of buttons available in current scene
   protected MainPanelCommands[] mainPanelCommands;
   protected int[] mainPanelCommandsList;
   protected SceneCommands[] sceneCommands;
   protected int[] sceneCommandsList;
   // all inventory element objects in game
   protected Inventory[] inventory;

   private void createCommands(int[] mainPanelCommandsList, int[] sceneCommandsList)
   {
      // update current button list for main panel
      Globals.mainPanelCommands = new JButton[mainPanelCommandsList.length];
      this.mainPanelCommands = new MainPanelCommands[mainPanelCommandsList.length];
      for (int i = 0; i < mainPanelCommandsList.length; i++)
      {
         this.mainPanelCommands[i] =
                  new MainPanelCommands(mainPanelCommandsList[i], i);
      }

      // update current button list for scene interaction buttons
      Globals.sceneCommands = new JButton[sceneCommandsList.length];
      this.sceneCommands = new SceneCommands[sceneCommandsList.length];
      for (int i = 0; i < sceneCommandsList.length; i++)
      {
         this.sceneCommands[i] = new SceneCommands(sceneCommandsList[i], i);
      }

      // update inventory
      Globals.inventory = new JButton[Globals.stats.inventory.length];
      this.inventory = new Inventory[Globals.stats.inventory.length];
      for (int i = 0; i < Globals.stats.inventory.length; i++)
      {
         this.inventory[i] = new Inventory(i, i);
      }
   }

   public void updateScene()
   {
      // outputs scene contents based on the current sceneID
      switch (Globals.stats.staticSceneID)
      {
         case 0:
            s0();
            break;
         case 1:
            s1();
            break;
         case 2:
            s2();
            break;
         case 3:
            s3();
            break;
         case 4:
            s4();
            break;
         case 5:
            s5();
            break;
         case 6:
            s6();
            break;
         case 7:
            s7();
            break;
         case 8:
            s8();
            break;
         case 9:
            s9();
            break;
         case 10:
            s10();
            break;
      }
      // create new overlay with scene contents
      createCommands(this.mainPanelCommandsList, this.sceneCommandsList);
      new Overlay();
   }

   // method to select image to use as button icon
   public void background(String image)
   {
      if (Globals.stats.artPack == 1)
      {
         this.backgroundImage =
                  new ImageIcon("../Art/Final Art/Background/" + image);
      }
      else
      {
         this.backgroundImage =
                  new ImageIcon("../Art/Placeholder Art/Background/" + image);
      }
   }

   // method to select character image
   public void characterImage(String image)
   {
      if (Globals.stats.artPack == 1)
      {
         this.characterImage =
                  new ImageIcon("../Art/Final Art/Character/" + image);
      }
      else
      {
         this.characterImage =
                  new ImageIcon("../Art/Placeholder Art/Character/" + image);
      }
   }

   // SCENE CONTENT BEGINS HERE------------------------------------------------
   // -------------------------------------------------------------------------

   public void s0()
   {
      background("Intro.png");
      this.text = "You have awoken in a broken-down house, with holes in the " +
                  "walls and the roofs is missing in parts and falling down " +
                  "around, you can see outside though the holes in the walls, it is dawn. ";
      this.mainPanelCommandsList = new int[] { 0, 1 };
      this.sceneCommandsList = new int[] {};
   }

   public void s1()
   {
      background("InsideHouse.png");

      if (Globals.stats.check)
      {
         Globals.stats.check = false;
         this.text = "You pick up some bandages";
         this.mainPanelCommandsList = new int[] { 0, 3 };
         if (Globals.stats.radio == 0)
         {
            this.sceneCommandsList = new int[] { 0 };
         }
         else
         {
            this.sceneCommandsList = new int[] {};
         }
      }
      else if (Globals.stats.radio == 0)
      {
         this.text = "You look around and find there is no one else here for " +
                     "you to ask what happened, you see a handheld CB radio beside " +
                     "you.";
         this.mainPanelCommandsList = new int[] { 0 };
         if (Globals.stats.bandages == 0)
         {
            this.sceneCommandsList = new int[] { 0, 1 };
         }
         else
         {
            this.sceneCommandsList = new int[] { 0 };
         }
      }
      else
      {
         this.text = "You pick up the radio. You turn it on and get a repeating " +
                     "message to come to Paradise City with a GPS location, you " +
                     "collect your things and head out to try reach Paradise City. ";
         this.mainPanelCommandsList = new int[] { 0, 4 };
         if (Globals.stats.bandages == 0)
         {
            this.sceneCommandsList = new int[] { 1 };
         }
         else
         {
            this.sceneCommandsList = new int[] {};
         }
      }
   }

   public void s2()
   {
      background("Side of road(fence).png");
      this.text = "After walking for a while, you notice a dark figure in the " +
                  "distance watching you. You blink, and the figure is gone. You " +
                  "continue down the road you come to an intersection. ";
      this.mainPanelCommandsList = new int[] { 0, 5 };
      this.sceneCommandsList = new int[] { 2 };
   }

   public void s3()
   {
      background("Intersection.png");
      this.text = "After collecting what you need for the trip you head out in " +
                  "the direction of the gps coordinates.";
      this.mainPanelCommandsList = new int[] { 0 };
      this.sceneCommandsList = new int[] { 3, 4, 5 };
   }

   public void s4()
   {
      background("Straight road.png");
      switch (Globals.stats.comicBookDecision)
      {
         case 0:
            this.text = "You follow the tattered road, noticing a lack of any " +
                        "wildlife sounds. As you traverse further you stumble " +
                        "upon a torn comic that draws your attention. It reminds " +
                        "you of a home where you read similar stories as a child.";
            this.mainPanelCommandsList = new int[] { 0, 6, 7, 8 };
            this.sceneCommandsList = new int[] { 6 };
            break;
         case 1:
            this.text = "As you flip through the pages you're reminded and feel " +
                        "for a more simplistic time once when you were a child " +
                        "once when you didn’t fear waking up.";
            this.mainPanelCommandsList = new int[] { 0, 9 };
            this.sceneCommandsList = new int[] { 7 };
            break;
         case 2:
            this.text = "A flicker of resemblance to a childhood story is taken, " +
                        "but little more than a second is wasted as you walk onward. ";
            this.mainPanelCommandsList = new int[] { 0, 9 };
            this.sceneCommandsList = new int[] {};
            break;
         case 3:
            this.text = "Taking apart what once was sought after brings you a " +
                        "sense of catharsis only to be followed by the emptiness of " +
                        "taking emotion out on a book, stand to keep walking.";
            this.mainPanelCommandsList = new int[] { 0, 9 };
            this.sceneCommandsList = new int[] { 8 };
            break;
      }
   }

   public void s5()
   {
      background("Straight road.png");
      switch (Globals.stats.dogDecision)
      {
         case 0:
            this.text = "You follow the road until you come across a dog " +
                        "walking aimlessly around the street looking for food, " +
                        "the dog comes up to you and sits on the road in front of you.";
            this.mainPanelCommandsList = new int[] { 0, 10, 11, 12 };
            this.sceneCommandsList = new int[] {};
            break;
         case 1:
            this.text = "You put your hand out to pat the dog. The dog pulls " +
                        "back from you sniffing your hand.";
            this.mainPanelCommandsList = new int[] { 0, 9 };
            this.sceneCommandsList = new int[] { 13, 11 };
            break;
         case 2:
            this.text = "You reach into your backpack looking for some food for " +
                        "the dog, you find some bread for the dog to eat, you place " +
                        "the bread on the road in front of the dog.";
            this.mainPanelCommandsList = new int[] { 0, 9 };
            this.sceneCommandsList = new int[] { 14 };
            break;
         case 3:
            this.text = "you choose to ignore the dog and continue to travel down " +
                        "the road, the dog has started to follow you.";
            this.mainPanelCommandsList = new int[] { 0, 9 };
            this.sceneCommandsList = new int[] { 12 };
            break;
      }
   }

   public void s6()
   {
      background("Straight road.png");
      this.text = "As you continue along the road you sense uneasiness, as if " +
                  "you're still being watched, but as you look around there is a " +
                  "distinct lack of the living to bother you. As you wander " +
                  "further down the road you note the sun above your head. Half " +
                  "a day gone.";
      this.mainPanelCommandsList = new int[] { 0 };
      this.sceneCommandsList = new int[] {};
   }

   public void s7()
   {

   }

   public void s8()
   {

   }

   public void s9()
   {

   }

   public void s10()
   {

   }
}
