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
   // list of buttons available on this screen
   protected MainPanelCommands[] mainPanelCommands;
   protected int[] mainPanelCommandsList;
   protected SceneCommands[] sceneCommands;
   protected int[] sceneCommandsList;

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

   // SCENE CONTENT BEGINS HERE------------------------------------------------

   public void s0()
   {
      this.text =
               "You have a woken in a broken-down house, with holes the walls and the roofs is missing in parts and falling down around, you can see outside though the holes in the walls, it is dawn. You look around and find there is no one else here for you to ask what happened, you see a handheld CB radio beside you, you turn it on and get a repeating message to come to Paradise City with a GPS location, you collect your things and head out to try reach Paradise City.";
      this.backgroundImage = new ImageIcon("../Art/Backgrounds/Intro.png");
      this.mainPanelCommandsList = new int[] { 0 };
      this.sceneCommandsList = new int[] { 0 };
   }

   public void s1()
   {
      this.text =
               "After collecting what you need for the trip you head out in the direction of the gps coorderantes crossing a <RNG on terrain type (e.g., grass field, forest, urban etc.)> while crossing <terrain> you notice a dark figure in the distance watching you, you blink, and the figure is gone. You continue down the road you come to an intersection. ";
      this.backgroundImage = new ImageIcon("../Art/Backgrounds/Intersection.png");
      this.mainPanelCommandsList = new int[] { 0 };
      this.sceneCommandsList = new int[] { 1, 2 };
   }

   public void s2()
   {
      switch (Globals.stats.comicBookDecision)
      {
         case 0:
            this.text =
                     "You go <Left> following the tattered road and notice the lack of life sounding and as you’ve trans-versed further you stumble upon a torn comic that draws your attention, reminds you of a home where you read similar stories as a child.";
            this.mainPanelCommandsList = new int[] { 0, 2, 3, 4 };
            this.sceneCommandsList = new int[] { 5 };
            break;

         case 1:
            this.text =
                     "as you flip through the pages you're reminded and feel for a more simplistic time once when you were a child once when you didn’t fear waking up.";
            this.mainPanelCommandsList = new int[] { 0, 5 };
            this.sceneCommandsList = new int[] {  };
            break;

         case 2:
            this.text =
                     "taking apart what once was sought after brings you a sense of catharsis only to be followed by the emptiness of taking emotion out on a book, stand to keep walking.";
            this.mainPanelCommandsList = new int[] { 0, 5 };
            this.sceneCommandsList = new int[] { 6 };
            break;

         case 3:
            this.text =
                     "flicker of resemblance to a childhood story is taken but little more than a second is wasted as you walk onward. ";
            this.mainPanelCommandsList = new int[] { 0, 5 };
            this.sceneCommandsList = new int[] {  };
            break;
      }
      this.backgroundImage = new ImageIcon("../Art/Backgrounds/Straight road.png");
   }

   public void s3()
   {
      switch (Globals.stats.dogDecision)
      {
         case 0:
            this.text =
                     "You go <Right> you follow the road until you come across a dog walking aimlessly around the street looking for food, the dog comes up to you and sits on the road in front of you.";
            this.mainPanelCommandsList = new int[] { 0, 6, 7, 8 };
            this.sceneCommandsList = new int[] { 4 };
            break;

         case 1:
            this.text =
                     "You put your hand out to pay the dog, the dog pulls back from you sniffing your hand.";
            this.mainPanelCommandsList = new int[] { 0, 5 };
            this.sceneCommandsList = new int[] { 3, 4 };
            break;

         case 2:
            this.text = "Sir Dogmund of Wickersham:<br>\"Good sir! How dare thee!\"";
            this.characterImage = new ImageIcon("../Art/Characters/Angry dog.png");
            this.mainPanelCommandsList = new int[] { 0, 5 };
            this.sceneCommandsList = new int[] { 4 };
            break;

         case 3:
            this.text =
                     "you choose to ignore the dog and continue to travel down the road, the dog has started to follow you.";
            this.mainPanelCommandsList = new int[] { 0, 5 };
            this.sceneCommandsList = new int[] {  };
            break;
      }
      this.backgroundImage = new ImageIcon("../Art/Backgrounds/Straight road.png");
   }

   public void s4()
   {
      this.text =
               "As you continue upon the road you sense uneasiness as if you're still being watched but as you look around there is a distinct lack of the living to bother you, as you wander further down the road you note the sun above your head half a day gone.";
      this.backgroundImage = new ImageIcon("../Art/Backgrounds/Straight road.png");
      this.mainPanelCommandsList = new int[] { 0 };
      this.sceneCommandsList = new int[] {  };
   }

   public void s5()
   {

   }

   public void s6()
   {

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
