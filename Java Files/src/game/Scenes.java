package game;

import javax.swing.ImageIcon;

public class Scenes
{
   protected String text;
   protected ImageIcon characterImage;
   protected MainPanelCommands[] mainPanelCommands;
   // protected SceneCommands[] sceneCommands;

   public Scenes()
   {
      updateScene();
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
      this.text = "You wake up to find a hobo rummaging through your rucksack";
      int[] mainPanelCommands = { 0 };
      // int[] sceneCommands = { 0 };
      createCommands(mainPanelCommands);
      return this;
   }

   public Scenes s1()
   {
      this.text = "Good sir! I challenge thee to fisticuffs.";
      this.characterImage = new ImageIcon("Angry hobo.png");
      this.mainPanelCommands = null;
      int[] mainPanelCommands = { 1 };
      // int[] sceneCommands = { 0 };
      createCommands(mainPanelCommands);
      return this;
   }

   public Scenes s2()
   {
      this.text = "I guess you can keep your eyelids.";
      this.characterImage = new ImageIcon("Happy hobo.png");
      this.mainPanelCommands = null;
      int[] mainPanelCommands = { 0, 1 };
      // int[] sceneCommands = { 0 };
      createCommands(mainPanelCommands);
      return this;
   }
}
