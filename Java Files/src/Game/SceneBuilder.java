
public class Scenes
{
   private int sceneID;
   // these 2 strings represent the storyText and imageTitle respectively
   private String[] sceneContent = new String[2];

   public Scenes(int sceneID, Overlay overlay)
   {
      this.sceneID = sceneID;
      sceneSelect();
   }

   public int getSceneID()
   {
      return this.sceneID;
   }

   public String[] getSceneContent()
   {
      return this.sceneContent;
   }

   public void sceneSelect()
   {
      switch (this.sceneID)
      {
         case 0:
            this.sceneContent = s0();
            break;
         case 1:
            this.sceneContent = s1();
            break;
         case 2:
            this.sceneContent = s2();
            break;
      }
   }

   public String[] s0()
   {
      this.sceneContent[0] = "You wake up to find a hobo rummaging through your rucksack";
      this.sceneContent[1] = null;
      return this.sceneContent;
   }

   public String[] s1()
   {
      this.sceneContent[0] = "You shoo the hobo";
      this.sceneContent[1] = null;
      return this.sceneContent;
   }

   public String[] s2()
   {
      this.sceneContent[0] = "Angry hobo: Good sir I challenge thee to fisticuffs";
      this.sceneContent[1] = "Angry hobo.png";
      return this.sceneContent;
   }
}
