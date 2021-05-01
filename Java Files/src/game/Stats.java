package game;

public class Stats
{
   // PLAYER STATS-------------------------------------------------------------
   protected int intelligence = 100; // example
   protected int morality = +10; // example

   // INVENTORY----------------------------------------------------------------
   protected int comicBook = 0;

   // BOOLEANS AND OTHER FLAGS-------------------------------------------------
   // the ID number of the current scene (change number to change start scene)
   protected int staticSceneID = 0;
   protected boolean mainPanelOverlayActive = true;
   protected boolean sceneOverlayActive = true;
   protected boolean inventoryOverlayActive = false;

   // 0 = start state, 1 = comic taken, 2 = comic destroyed, 3 = comic ignored
   protected int comicBookDecision = 0;
}
