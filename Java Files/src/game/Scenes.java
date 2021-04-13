package game;

import javax.swing.ImageIcon;

public class Scenes
{
   protected String text;
   protected ImageIcon characterImage;
   protected ImageIcon backgroundImage;
   protected MainPanelCommands[] mainPanelCommands;
   // protected SceneCommands[] sceneCommands;

   public Scenes()
   {
      updateScene();
   }

   public void updateScene()
   {
      this.mainPanelCommands = null;
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
   }

   public Scenes getSceneContent()
   {
      return this;
   }

   private void createCommands(int[] mainPanelCommands)
   {
      this.mainPanelCommands = new MainPanelCommands[mainPanelCommands.length];
      for (int i = 0; i < mainPanelCommands.length; i++)
      {
         this.mainPanelCommands[i] = new MainPanelCommands(mainPanelCommands[i]);
      }
   }

   public Scenes s0()
   {
      this.text = "You are in a dusty room";
      this.characterImage = new ImageIcon("Happy hobo.png");
      this.backgroundImage = new ImageIcon("Trees.png");
      int[] mainPanelCommands = { 0 };
      // int[] sceneCommands = { 0 };
      createCommands(mainPanelCommands);
      return this;
   }

   public Scenes s1()
   {
      this.text = "You are on top of a mountain";
      this.characterImage = null;
      this.backgroundImage = null;
      int[] mainPanelCommands = { 1 };
      // int[] sceneCommands = { 0 };
      createCommands(mainPanelCommands);
      return this;
   }

   public Scenes s2()
   {
      this.text = "You are in outer space";
      this.characterImage = null;
      this.backgroundImage = null;
      int[] mainPanelCommands = { 2 };
      // int[] sceneCommands = { 0 };
      createCommands(mainPanelCommands);
      return this;
   }
}
