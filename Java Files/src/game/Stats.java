package game;

public class Stats
{
   // PLAYER STATS-------------------------------------------------------------
   protected int health = 0; // example

   // INVENTORY----------------------------------------------------------------
   // copy these into 'updateInventoryArray()' below
   protected int radio = 0;
   protected int comicBook = 0;
   protected int bandages = 0;

   // increase this number if more items are coded into the game
   protected int[] inventory = new int[10];

   // add a line to this array for every item coded into the game
   // the number represents its place in the array, not how many the player has
   public void updateInventoryArray()
   {
      this.inventory[0] = radio;
      this.inventory[1] = comicBook;
      this.inventory[2] = bandages;
   }

   // BOOLEANS AND OTHER FLAGS-------------------------------------------------
   // toggle whether each overlay should be active
   protected boolean mainPanelOverlayActive = true;
   protected boolean sceneOverlayActive = true;
   protected boolean inventoryOverlayActive = false;
   // the ID number of the current scene (change number to debug a scene)
   // -1 for main menu
   protected int staticSceneID = -1;
   // general purpose reusable confirmation (please reset to false when done)
   protected boolean check = false;

   // 0 = start state, 1 = comic taken, 2 = comic ignored, 3 = comic destroyed
   protected int comicBookDecision = 0;
   // 0 = start state, 1 = pat dog, 2 = feed dog, 3 = ignore dog
   protected int dogDecision = 0;
   // 0 = start state, 1 = fix aerial, 2 = fix screen, 3 = test radio
   protected int radioDecision = 0;
   // 0 = start state 1 = yell 2 = kick
   protected int doorDecision = 0;
   // false = start state or failed minigame, true = minigame success
   protected boolean minigameA = false;
   // the art pack chosen
   protected String artPack = "Final";
}
