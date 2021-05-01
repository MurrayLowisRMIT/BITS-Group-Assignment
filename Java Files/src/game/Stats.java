package game;

public class Stats
{
   // PLAYER STATS-------------------------------------------------------------
   protected int intelligence = 100; // example
   protected int morality = +10; // example

   // INVENTORY----------------------------------------------------------------
   protected int comicBook = 0;

   // BOOLEANS AND OTHER FLAGS-------------------------------------------------
   // toggle whether each overlay should be active
   protected boolean mainPanelOverlayActive = true;
   protected boolean sceneOverlayActive = true;
   protected boolean inventoryOverlayActive = false;
   // the ID number of the current scene (change number for debugging)
   protected int staticSceneID = 0;

   // 0 = start state, 1 = comic taken, 2 = comic destroyed, 3 = comic ignored
   protected int comicBookDecision = 0;
   // 0 = start state, 1 = pat dog, 2 = feed dog, 3 = ignore dog
   protected int dogDecision = 0;
}
