package game;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Scenes
{
   protected String text;
   protected ImageIcon characterImage;
   protected ImageIcon backgroundImage;
   protected MainPanelCommands[] mainPanelCommands;
   protected int[] mainPanelCommandsList;
   protected SceneCommands[] sceneCommands;
   protected int[] sceneCommandsList;

   public Scenes()
   {

   }

   public void updateScene()
   {
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
      new Overlay();
   }

   private void createCommands(int[] mainPanelCommandsList)
   {
      Globals.mainPanelCommands = new JButton[mainPanelCommandsList.length];
      this.mainPanelCommands = new MainPanelCommands[mainPanelCommandsList.length];
      for (int i = 0; i < mainPanelCommandsList.length; i++)
      {
         this.mainPanelCommands[i] =
                  new MainPanelCommands(mainPanelCommandsList[i], i);
      }

      Globals.sceneCommands = new JButton[sceneCommandsList.length];
      this.sceneCommands = new SceneCommands[sceneCommandsList.length];
      for (int i = 0; i < sceneCommandsList.length; i++)
      {
         this.sceneCommands[i] = new SceneCommands(sceneCommandsList[i], i);
      }
   }

   public void s0()
   {
      this.text = "You are in a dusty room with a sleeping hobo";
      this.backgroundImage = new ImageIcon("Dusty room.png");
      this.mainPanelCommandsList = new int[] { 0, 1, 2 };
      this.sceneCommandsList = new int[] { 0 };
      createCommands(this.mainPanelCommandsList);
   }

   public void s1()
   {
      this.text = "You go outside. There is a desert";
      this.characterImage = new ImageIcon("Happy hobo.png");
      this.backgroundImage = null;
      this.mainPanelCommandsList = new int[] { 0, 1, 2 };
      this.sceneCommandsList = new int[] { 1, 2 };
      createCommands(mainPanelCommandsList);
   }

   public void s2()
   {
      this.text = "You die in the desert";
      this.characterImage = null;
      this.backgroundImage = null;
      this.mainPanelCommandsList = new int[] { 2 };
      this.sceneCommandsList = new int[] { };
      createCommands(mainPanelCommandsList);
   }
}
