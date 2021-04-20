package game;

public class Stats
{
   // PLAYER STATS-------------------------------------------------------------
   protected int health = 100;
   protected int intelligence = 100;
   protected int personalHygiene = -100;
   
   // INVENTORY----------------------------------------------------------------
   protected int potions = 5;
   
   // BOOLEANS AND OTHER FLAGS-------------------------------------------------
   // the ID number of the current scene (change number to change start scene)
   protected int staticSceneID = 0;
   protected boolean mainPanelOverlayActive = true;
   protected boolean sceneOverlayActive = true;
   protected boolean inventoryOverlayActive = false;
   protected boolean comicBookAcquired = false;
   protected boolean dogAcquired = false;
}
