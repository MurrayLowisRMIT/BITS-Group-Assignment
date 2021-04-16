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

   public Scenes()
   {

   }

   public void updateScene()
   {
      // outputs scene contents based on the current sceneID
      switch (Globals.staticSceneID)
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
      }
      // create new overlay with scene contents
      new Overlay();
   }

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

   // SCENE CONTENT BEGINS HERE------------------------------------------------

   public void s0()
   {
      this.text = "This is the first scene in the game. The buttons below have not yet been programmed to do anything. Click the button near the window.";
      this.characterImage = null;
      this.backgroundImage = new ImageIcon("Dusty room.png");
      this.mainPanelCommandsList = new int[] { 0, 1, 2 };
      this.sceneCommandsList = new int[] { 0 };
      createCommands(this.mainPanelCommandsList, this.sceneCommandsList);
   }

   public void s1()
   {
      this.text = "There are no actions to be taken here so there are no buttons below.";
      this.characterImage = null;
      this.backgroundImage = new ImageIcon("Desert house.png");
      this.mainPanelCommandsList = new int[] { 2 };
      this.sceneCommandsList = new int[] { 1, 2 };
      createCommands(this.mainPanelCommandsList, this.sceneCommandsList);
   }

   public void s2()
   {
      this.text = "You die in the desert. Congratulations! (the button below does nothing)";
      this.characterImage = null;
      this.backgroundImage = new ImageIcon("Desert skeleton.png");
      this.mainPanelCommandsList = new int[] { 3 };
      this.sceneCommandsList = new int[] {};
      createCommands(this.mainPanelCommandsList, this.sceneCommandsList);
   }
}
