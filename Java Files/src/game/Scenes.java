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
         case -1:
            mainMenu();
            break;
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
         case 104:
            s4_1();
            break;
         case 5:
            s5();
            break;
         case 200:
            s6();
            break;
         case 201:
            s6_1();
            break;
         case 202:
            s7();
            break;
         case 203:
            s8();
            break;
         case 204:
            s8_1();
            break;
         case 205:
            d1();
            break;
         case 10:
            s9();
            break;
         case 206:
            minigameB();
            break;
         case 207:
            s9();
            break;
         case 208:
            s12_1();
            break;
         case 209:
            w0();
            break;
         case 37:
            sc37();
            break;
      }
      // create new overlay with scene contents
      createCommands(this.mainPanelCommandsList, this.sceneCommandsList);
      new Overlay();
   }

   // method to select image to use as button icon
   public void background(String image)
   {
      this.backgroundImage = new ImageIcon("../Art/" + Globals.stats.artPack +
                                           " Art/Background/" + image);
   }

   // method to select character image
   public void characterImage(String image)
   {
      this.characterImage = new ImageIcon("../Art/" + Globals.stats.artPack +
                                          " Art/Character/" + image);
   }

   // SCENE CONTENT BEGINS HERE------------------------------------------------
   // -------------------------------------------------------------------------

   public void mainMenu()
   {
      background("Title Screen.png");
      this.mainPanelCommandsList = new int[] {};
      if (Globals.stats.gameComplete == true)
      {
         this.sceneCommandsList = new int[] { -4, -3, -2, -1 };
      }
      else
      {
         this.sceneCommandsList = new int[] { -4, -3, -2 };
      }
   }

   public void s0()
   {
      background("Intro.png");
      this.text = "You have awoken in a broken-down house, with holes in the " +
                  "walls and the roofs is missing in parts and falling down " +
                  "around, you can see outside though the holes in the walls, it is dawn.";
      this.mainPanelCommandsList = new int[] { 0, 1 };
      this.sceneCommandsList = new int[] {};
   }

   public void s1()
   {
      background("InsideHouse.png");

      if (Globals.stats.check)
      {
         Globals.stats.check = false;
         this.text = "You pick up some bandages.";
         this.mainPanelCommandsList = new int[] { 0, 3 };
         if (Globals.stats.radio == 0)
         {
            this.sceneCommandsList = new int[] { 0 };
         }
         else
         {
            this.sceneCommandsList = new int[] { 10 };
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
            this.sceneCommandsList = new int[] { 1, 10 };
         }
         else
         {
            this.sceneCommandsList = new int[] { 10 };
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
      background("Striaght road 1.png");
      switch (Globals.stats.comicBookDecision)
      {
         case 0:
            this.text = "You follow the tattered road, noticing a lack of any " +
                        "wildlife sounds. As you traverse further you stumble " +
                        "upon a torn comic that draws your attention. It reminds " +
                        "you of a home where you read similar stories as a child.";
            this.mainPanelCommandsList = new int[] { 0, 7, 8 };
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
            background("Striaght road 3.png");
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

   public void s4_1()
   {
      background("Striaght road 1.png");
      switch (Globals.stats.dogDecision)
      {
         case 0:
            this.text = "You follow the road until you come across a dog " +
                        "walking aimlessly around the street looking for food, " +
                        "the dog comes up to you and sits on the road in front of you.";
            this.mainPanelCommandsList = new int[] { 0, 10, 11, 12 };
            this.sceneCommandsList = new int[] { 9 };
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
            this.text = "You ignore the dog and continue to travel down " +
                        "the road, the dog has started to follow you.";
            this.mainPanelCommandsList = new int[] { 0, 9 };
            this.sceneCommandsList = new int[] { 15 };
            break;
      }
   }

   public void s5()
   {
      background("Striaght road 2.png");
      this.text = "As you continue along the road you sense uneasiness, as if " +
                  "you're still being watched, but as you look around there is a " +
                  "distinct lack of the living to bother you. As you wander " +
                  "further down the road you note the sun above your head. Half " +
                  "a day gone." +
                  "<br><br>You wonder if you should try your radio again.";
      this.mainPanelCommandsList = new int[] { 0 };
      this.sceneCommandsList = new int[] { 16, 17 };
   }

   public void s6() // id 200
   {
      background("Striaght road 2.png");
      switch (Globals.stats.radioDecision)
      {
         case 0:
            this.text = "You reach to check your CB radio as you grab your " +
                        "CB radio you notice the aerial is broken, as you " +
                        "look at it you notice the screen is cracked.";
            this.mainPanelCommandsList = new int[] { 0, 200, 201, 202 };
            this.sceneCommandsList = new int[] { 200 };
            break;
         case 1:
            this.text = "You reach into your backpack to find some " +
                        "tape to try make the aerial stay connected.";
            this.mainPanelCommandsList = new int[] { 203 };
            this.sceneCommandsList = new int[] { 204, 205 };
            break;
         case 2:
            this.text = "You try to tape around the screen and " +
                        "stop the screen falling out.";
            this.mainPanelCommandsList = new int[] { 203 };
            this.sceneCommandsList = new int[] { 204, 205 };
            break;
         case 3:
            this.text = "You grab the radio to see if it still " +
                        "gets a signal and is still working, at " +
                        "this stage it is";
            this.mainPanelCommandsList = new int[] { 204 };
            this.sceneCommandsList = new int[] { 202 };
            break;
      }
   }

   public void s6_1() // id 201
   {
      background("Striaght road 2.png");
      if (Globals.stats.radioDecision == 1)
      {
         this.text = "Your attempt to fix the aerial in turn the " +
                     "aerial has broken off and the CB is just " +
                     "picking up static now. Worried you might " +
                     "miss something you continue the head you were on before. ";
         this.mainPanelCommandsList = new int[] { 204 };
         this.sceneCommandsList = new int[] { 206 };
      }
      else if (Globals.stats.radioDecision == 2)
      {
         this.text = "Your attempt to fix the screen in turn " +
                     "screen has stayed in the CB radio but the " +
                     "CB radio will not turn on now. You continue " +
                     "the path you were last on.";
         this.mainPanelCommandsList = new int[] { 204 };
         this.sceneCommandsList = new int[] { 207 };
      }
      else if (Globals.stats.radioDecision == 3)
      {
         this.text = "You grab the radio to see if it still " +
                     "gets a signal and is still working, at " +
                     "this stage it is";
         this.mainPanelCommandsList = new int[] { 205 };
         this.sceneCommandsList = new int[] { 203 };
      }
   }

   public void s7() // id 202
   {
      background("brick Wall(no door).png");
      if (Globals.stats.radioDecision == 3 || Globals.stats.minigameA == true)
      {
         this.text = "You grab the CB and check if it is still " +
                     "working at this stage and follow on walking for a while, " +
                     "with the CB still working you check the signal and the " +
                     "signal is getting stronger as the surroundings become " +
                     "more bleak but you notice what seems to be buildings in the distance.";
         this.mainPanelCommandsList = new int[] { 0, 205, 206 };
         this.sceneCommandsList = new int[] { 203 };
      }
      else
      {
         this.text = "Following the road, you notice what " +
                     "seems to be a structure in the distance.";
         this.mainPanelCommandsList = new int[] { 205 };
         this.sceneCommandsList = new int[] {};
      }

   }

   public void s8() // id 203
   {
      background("brick Wall(no door).png");
      this.text = "As you approach the structure you notice " +
                  "that it goes beyond the horizon in both directions. " +
                  "You notice footsteps in either direction, which do you follow? ";
      this.mainPanelCommandsList = new int[] { 0, 206, 208 };
      this.sceneCommandsList = new int[] { 210, 211 };
   }

   public void s8_1() // id 204
   {
      background("brick Wall door.png");
      switch (Globals.stats.doorDecision)
      {
         case 0:
            if (Globals.stats.comicBook == 0)
            {
               this.text = "You continute to follow the wall until you " +
                           "come across a door. There doesn't seem to be anyone around...";
            }
            else
            {
               this.text =
                        "You follow the directions that the stranger gave you and " +
                           "you come to a large concrete wall with a door in it. There doesn't " +
                           "seem to be anyone around...";
            }
            this.mainPanelCommandsList = new int[] { 0, 209, 210 };
            this.sceneCommandsList = new int[] { 208 };
            break;
         case 1:
            this.text =
                     "You call out from outside the wall and you see someone stick their head over the wall...";
            this.mainPanelCommandsList = new int[] { 0, 212 };
            this.sceneCommandsList = new int[] { 208, 212 };
            break;
         case 2:
            this.text =
                     "You attempt to break in, and as you do, a figure appears at the top of the wall. He points his gun at you..." +
                        "\"You best get going stranger, before I blow your head off\" You back away slowly, returning to the desert...";
            this.mainPanelCommandsList = new int[] { 0, 36 };
            this.sceneCommandsList = new int[] { 208, 213 };
            break;
      }
   }

   public void d1() // id 205
   {
      background("death at wall.png");
      this.text = "After following the wall hoping for a way in " +
                  "you find yourself too exhausted to go on.  " +
                  "You die from dehydration.";
      this.mainPanelCommandsList = new int[] {};
      this.sceneCommandsList = new int[] { 209 };
   }

   public void minigameB() // id 206
   {
      background("brick Wall door.png");
      this.text =
               "The man approaches you, and asks \"Do you have anything of value? Any books?\"";
      this.mainPanelCommandsList = new int[] { 213, 214 };
      this.sceneCommandsList = new int[] { 214, 208 };

   }

   public void s9() // id 207
   {
      background("Thrown out.png");
      this.text =
               "You are found to be lying, you have been barred from entering Paradise city. You follow the wall hoping to find another way in...";
      this.mainPanelCommandsList = new int[] { 211 };
      this.sceneCommandsList = new int[] { 215 };
   }

   public void s12_1() // id 208
   {
      background("Following signal.png");
      if (Globals.stats.minigameA == true)
      {
         this.text = "Your CB radio is still damaged but now functions.";
         this.mainPanelCommandsList = new int[] { 0, 204 };
         this.sceneCommandsList = new int[] {};
      }
      else
      {
         this.text =
                  "Your CB radio is now broken with the screen now permanently black...";
         this.mainPanelCommandsList = new int[] { 0, 204 };
         this.sceneCommandsList = new int[] {};
      }
   }

   public void w0() // id 209
   {
      background("safe haven.png");
      if (Globals.stats.comicBook == 1)
      {
         this.text =
                  "You are deemed trustworthy and the book is valuable, you are allowed to enter Paradise City. Congratulations, you have made it to safety!";
      }
      else
      {
         this.text =
                  "You are deemed trustworthy, you are allowed to enter Paradise City. Congratulations, you have made it to safety!";
      }
      this.mainPanelCommandsList = new int[] { -1 };
      this.sceneCommandsList = new int[] {};
      Globals.stats.gameComplete = true;
   }

   // Death 0
   public void sc37()
   {
      background("Death.png");
      this.text =
               "As you continue down the road looking around for a source of sustenance, you cannot seem to find any as you keep going feeling like you should have turned back but it is too late to turn around, as the day turns to night, find yourself crawling to a building that is falling apart to try sleep in, you close your eyes one last time. . ";

      this.mainPanelCommandsList = new int[] { 0, -1 };
      this.sceneCommandsList = new int[] { 56 };
   }
}
