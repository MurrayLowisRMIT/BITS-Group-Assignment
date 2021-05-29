package game;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Scenes {
	// text output to the text box
	protected String text;
	// image of character currently speaking
	protected ImageIcon characterImage;
	protected ImageIcon backgroundImage;
	// list of buttons available in current scene
	protected MainPanelCommands[] mainPanelCommands;
	protected int[] mainPanelCommandsList;
	protected SceneCommands[] sceneCommands;
	protected int[] sceneCommandsList;
	// all inventory element objects in game
	protected Inventory[] inventory;

	private void createCommands(int[] mainPanelCommandsList, int[] sceneCommandsList) {
		// update current button list for main panel
		Globals.mainPanelCommands = new JButton[mainPanelCommandsList.length];
		this.mainPanelCommands = new MainPanelCommands[mainPanelCommandsList.length];
		for (int i = 0; i < mainPanelCommandsList.length; i++) {
			this.mainPanelCommands[i] = new MainPanelCommands(mainPanelCommandsList[i], i);
		}

		// update current button list for scene interaction buttons
		Globals.sceneCommands = new JButton[sceneCommandsList.length];
		this.sceneCommands = new SceneCommands[sceneCommandsList.length];
		for (int i = 0; i < sceneCommandsList.length; i++) {
			this.sceneCommands[i] = new SceneCommands(sceneCommandsList[i], i);
		}

		// update inventory
		Globals.inventory = new JButton[Globals.stats.inventory.length];
		this.inventory = new Inventory[Globals.stats.inventory.length];
		for (int i = 0; i < Globals.stats.inventory.length; i++) {
			this.inventory[i] = new Inventory(i, i);
		}
	}

	public void updateScene() {
		// outputs scene contents based on the current sceneID
		switch (Globals.stats.staticSceneID) {
		case -1:
			mainMenu();
			break;
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
			s5();
			break;
		case 401:
			s6();
			break;
		case 8:
			s7();
			break;
		case 9:
			s8();
			break;
		case 10:
			s6();
			break;
		case 104:
			s4_1();
			break;
		case 402:
			s6();
			break;
		case 403:
			s7();
			break;
		case 404:
			s8();
			break;
		case 405:
			s9();
			break;
		case 406:
			s10();
			break;
		case 407:
			s11();
			break;
		case 408:
			s12();
			break;
		case 409:
			s13();
			break;
		case 410:
			s14();
			break;
		case 411:
			sc15();
			break;
		case 412:
			sc16();
			break;
		case 413:
			sc17();
			break;
		case 414:
			sc18();
			break;
		case 415:
			sc19();
			break;
		case 416:
			sc20();
			break;
		case 417:
			sc21();
			break;
		case 418:
			sc22();
			break;
		case 419:
			sc23();
			break;
		case 420:
			sc24();
			break;
		case 421:
			sc25();
			break;
		case 422:
			sc26();
			break;
		case 423:
			sc27();
			break;
		case 424:
			sc28();
			break;
		case 425:
			sc29();
			break;
		case 426:
			sc30();
			break;
		case 427:
			sc31();
			break;
		case 428:
			sc32();
			break;
		case 429:
			sc33();
			break;
		case 430:
			sc34();
			break;
		case 431:
			sc35();
			break;
		case 432:
			sc36();
			break;
		case 433:
			sc37();
			break;
		case 434:
			sc38();
			break;
		case 43:
			sc39();
			break;

		}
		// create new overlay with scene contents
		createCommands(this.mainPanelCommandsList, this.sceneCommandsList);
		new Overlay();
	}

	// method to select image to use as button icon
	public void background(String image) {
		this.backgroundImage = new ImageIcon("../Art/" + Globals.stats.artPack + " Art/Background/" + image);
	}

	// method to select character image
	public void characterImage(String image) {
		this.characterImage = new ImageIcon("../Art/" + Globals.stats.artPack + " Art/Character/" + image);
	}

	// SCENE CONTENT BEGINS HERE------------------------------------------------
	// -------------------------------------------------------------------------

	public void mainMenu() {
		background("");
		this.mainPanelCommandsList = new int[] {};
		this.sceneCommandsList = new int[] { -4, -3, -2, -1 };
	}

	public void s0() {
		background("Intro.png");
		this.text = "You have awoken in a broken-down house, with holes in the "
				+ "walls and the roofs is missing in parts and falling down "
				+ "around, you can see outside though the holes in the walls, it is dawn.";
		this.mainPanelCommandsList = new int[] { 0, 1 };
		this.sceneCommandsList = new int[] {};
	}

	public void s1() {
		background("InsideHouse.png");

		if (Globals.stats.check) {
			Globals.stats.check = false;
			this.text = "You pick up some bandages.";
			this.mainPanelCommandsList = new int[] { 0, 3 };
			if (Globals.stats.radio == 0) {
				this.sceneCommandsList = new int[] { 0 };
			} else {
				this.sceneCommandsList = new int[] { 10 };
			}
		} else if (Globals.stats.radio == 0) {
			this.text = "You look around and find there is no one else here for "
					+ "you to ask what happened, you see a handheld CB radio beside " + "you.";
			this.mainPanelCommandsList = new int[] { 0 };
			if (Globals.stats.bandages == 0) {
				this.sceneCommandsList = new int[] { 0, 1 };
			} else {
				this.sceneCommandsList = new int[] { 0 };
			}
		} else {
			this.text = "You pick up the radio. You turn it on and get a repeating "
					+ "message to come to Paradise City with a GPS location, you "
					+ "collect your things and head out to try reach Paradise City. ";
			this.mainPanelCommandsList = new int[] { 0, 4 };
			if (Globals.stats.bandages == 0) {
				this.sceneCommandsList = new int[] { 1, 10 };
			} else {
				this.sceneCommandsList = new int[] { 10 };
			}
		}
	}

	public void s2() {
		background("Side of road(fence).png");
		this.text = "After walking for a while, you notice a dark figure in the "
				+ "distance watching you. You blink, and the figure is gone. You "
				+ "continue down the road you come to an intersection. ";
		this.mainPanelCommandsList = new int[] { 0, 5 };
		this.sceneCommandsList = new int[] { 2 };
	}

	public void s3() {
		background("Intersection.png");
		this.text = "After collecting what you need for the trip you head out in "
				+ "the direction of the gps coordinates.";
		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] { 3, 4, 5 };
	}

	public void s4() {
		background("Striaght road 1.png");
		switch (Globals.stats.comicBookDecision) {
		case 0:
			this.text = "You follow the tattered road, noticing a lack of any "
					+ "wildlife sounds. As you traverse further you stumble "
					+ "upon a torn comic that draws your attention. It reminds "
					+ "you of a home where you read similar stories as a child.";
			this.mainPanelCommandsList = new int[] { 0, 6, 7, 8 };
			this.sceneCommandsList = new int[] { 6 };
			break;
		case 1:
			this.text = "As you flip through the pages you're reminded and feel "
					+ "for a more simplistic time once when you were a child " + "once when you didn’t fear waking up.";
			this.mainPanelCommandsList = new int[] { 0, 9 };
			this.sceneCommandsList = new int[] { 7 };
			break;
		case 2:
			background("Striaght road 3.png");
			this.text = "A flicker of resemblance to a childhood story is taken, "
					+ "but little more than a second is wasted as you walk onward. ";
			this.mainPanelCommandsList = new int[] { 0, 9 };
			this.sceneCommandsList = new int[] {};
			break;
		case 3:
			this.text = "Taking apart what once was sought after brings you a "
					+ "sense of catharsis only to be followed by the emptiness of "
					+ "taking emotion out on a book, stand to keep walking.";
			this.mainPanelCommandsList = new int[] { 0, 9 };
			this.sceneCommandsList = new int[] { 8 };
			break;
		}
	}

	public void s4_1() {
		background("Striaght road 1.png");
		switch (Globals.stats.dogDecision) {
		case 0:
			this.text = "You follow the road until you come across a dog "
					+ "walking aimlessly around the street looking for food, "
					+ "the dog comes up to you and sits on the road in front of you.";
			this.mainPanelCommandsList = new int[] { 0, 10, 11, 12 };
			this.sceneCommandsList = new int[] { 9 };
			break;
		case 1:
			this.text = "You put your hand out to pat the dog. The dog pulls " + "back from you sniffing your hand.";
			this.mainPanelCommandsList = new int[] { 0, 9 };
			this.sceneCommandsList = new int[] { 13, 11 };
			break;
		case 2:
			this.text = "You reach into your backpack looking for some food for "
					+ "the dog, you find some bread for the dog to eat, you place "
					+ "the bread on the road in front of the dog.";
			this.mainPanelCommandsList = new int[] { 0, 9 };
			this.sceneCommandsList = new int[] { 14 };
			break;
		case 3:
			this.text = "You ignore the dog and continue to travel down "
					+ "the road, the dog has started to follow you.";
			this.mainPanelCommandsList = new int[] { 0, 9 };
			this.sceneCommandsList = new int[] { 15 };
			break;
		}
	}
//-------------------------------------------------------------------------------------------
	//
	//

	//
	//
	public void s5() {

		background("Striaght road 2.png");
		switch (Globals.stats.pathSc5Decision) {
		case 0:
			background("Striaght road 2.png");
			this.text = "As you continue along the road you sense uneasiness, as if "
					+ "you're still being watched, but as you look around there is a "
					+ "distinct lack of the living to bother you. As you wander "
					+ "further down the road you note the sun above your head. Half " + "a day gone."
					+ "<br><br>You wonder if you should try your radio again. You start to feel drousy after lots of walking";
			this.mainPanelCommandsList = new int[] { 0, 13 };
			this.sceneCommandsList = new int[] { 16, 17 };
			break;
		case 1:
			this.text = "SHELTER PATH";
			this.mainPanelCommandsList = new int[] { 0 };
			this.sceneCommandsList = new int[] {};
			break;
		case 2:
			this.text = "WALKING PATH";
			this.mainPanelCommandsList = new int[] { 0 };
			this.sceneCommandsList = new int[] {};
			break;
		case 3:
			this.text = "RADIO PATH";
			this.mainPanelCommandsList = new int[] { 0, 16 };
			this.sceneCommandsList = new int[] {};
			break;
		}

	}

//RADIO PATH
	public void s6() {
		background("Striaght road 2.png");
		this.text = "Radio PATH";
		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] { 18 };
	}

//BUS SHELTER PATH s10A
	public void s7() {
		background("Bus side of road.png");
		this.text = "After a small look around, you find a mostly intact bus stop and decide the bench is the best bed you’ll get.\n";
		this.mainPanelCommandsList = new int[] { 0, 19 };
		this.sceneCommandsList = new int[] { 20 };
	}

//CONTINUE PATH AT SC 5
	public void s8() {
		background("Striaght road 2.png");
		this.text = "You start to stumble from exhaustion. As you’re struggling to keep going, you fall to the ground unconscious.";
		this.mainPanelCommandsList = new int[] { 0, 37 };
		this.sceneCommandsList = new int[] { 48 };
	}

//BUS PATH CONT
	public void s9() {

		switch (Globals.stats.pathSc11aDecision) {
		case 0:
			background("Busstop-1.png");
			this.text = "You awaken from your slumber just as dawn breaks over the horizon. You look around to check on your backpack, you notice a dog is sniffing your backpack. You slowly rise on the bench as to not startle the dog.";
			this.mainPanelCommandsList = new int[] { 0, 20, 21, 22 };
			this.sceneCommandsList = new int[] { 21, 22, 23 };
			break;
		case 1:
			// 11B
			this.text = "You try to scare the dog off from your backpack by waving your arms and shouting at the dog, the dog jumps up and runs a few meters away watching you as you get up and grab your backpack. As you start to walk, the dog then runs off out of sight.";
			this.mainPanelCommandsList = new int[] { 0, 23 };
			this.sceneCommandsList = new int[] { 24, 25, 27 };

			break;
		case 2:
			// 11C

			this.mainPanelCommandsList = new int[] { 0, 23 };
			this.sceneCommandsList = new int[] { 22 };
			break;
		case 3:
			// 11D

			this.mainPanelCommandsList = new int[] { 0 };
			this.sceneCommandsList = new int[] { 21 };
			break;
		}

	}

	// SC 11_1c
	public void s10() {
		background("Busstop-2.png");
		this.text = "You turn around and grab the radio while putting on your backpack to see if it still gets a signal and is still working, at this stage it is so you continue to follow it for a while.";

		this.mainPanelCommandsList = new int[] { 0, 23 };
		this.sceneCommandsList = new int[] { 26 };
	}

	// SC12
	public void s11() {
		background("Following signal.png");
		this.text = " you look around and don’t see anyone, so you gather your thoughts and continue down the road as the souroundings become more bleak, your CB starts to make sound as if it is missing a signal.";

		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] {};
	}

// SC 11c
	public void s12() {
		background("Busstop-1.png");
		this.text = "You slowly reach for your backpack trying not to startle the dog to attack you, you get a hold of one of the shoulder straps and slowly start moving the backpack towards you, the movement of the backpack startles the dog, and you watch the dog run off out of sight.";

		this.mainPanelCommandsList = new int[] { 0, 26 };
		this.sceneCommandsList = new int[] { 25, 28, 27 };
	}

//S11D
	public void s13() {
		background("Busstop-1.png");
		this.text = "You look around where you are to see what is within reach to throw at the dog, you see a large rock, you slowly grab the rock, you slowly raise your arm ready to throw the rock the dog notices you moving and starts to growl at you, in your attempt to launch the rock at the animal you miss the dog hit the bus shelter pole making a loud bang scaring both yourself and the dog, the dog runs away out of sight. The loud noise has startled someone you hear nearby they approach you. ";
		this.mainPanelCommandsList = new int[] { 0, 27 };
		this.sceneCommandsList = new int[] { 25, 27, 29, 30 };
	}

	public void s14() {
		background("Busstop-2.png");
		this.text = "As you turn to face the sound a man approaches you, hands raised above his head to show he comes in peace \n"
				+ "\n" + "Aproaching you, you notice him look at your backpack as you’ve put it back on. ";
		this.mainPanelCommandsList = new int[] { 0, 28 };
		this.sceneCommandsList = new int[] { 31, 32 };
	}

//sc 13A
	public void sc15() {
		background("side quest house outside.png");
		this.text = "You head off towards the building that the stranger pointed at in search of this book he is after, you arrive at the building he was talking about. looking at the building you see the door is locked and the windows have been boarded up. ";
		this.mainPanelCommandsList = new int[] { 0, 29 };
		this.sceneCommandsList = new int[] { 34 };
	}

	// sc13B
	public void sc16() {
		background("side quest house outside.png");
		this.text = "You knock on the door multiple times; you hear someone unlocking the door from the other side. The door opens slowly, and you see a one eye looking at you. The door closes again, and you hear it lock again.";
		this.mainPanelCommandsList = new int[] { 0, 30 };
		this.sceneCommandsList = new int[] { 33 };

	}

	// sc13c
	public void sc17() {
		background("side quest house side.png");
		this.text = "you look around the building for another way in, you spot a window on the second floor  ";
		this.mainPanelCommandsList = new int[] { 0, 31 };
		this.sceneCommandsList = new int[] { 35, 36 };

	}

//sc13d
	public void sc18() {
		background("side quest house outside.png");
		this.text = "After the door closes you try knocking again to no response you then start to look around the building for another way in ";
		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] { 34 };
	}

//sc13e
	public void sc19() {
		background("Getting in window side quest.png");
		this.text = "After looking for a way to get up to the second floor you notice some rubble that looks like you can climb on it to get though the open window. ";
		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] { 37 };
	}

	// sc11_1B from 13c or 13g
	public void sc20() {
		background("Busstop-2.png");
		this.text = "As of walking back up to the bus stop the stranger is nowhere in sight now, checking your cb seems to be the only reasonable option";
		this.mainPanelCommandsList = new int[] { 0, 31 };
		this.sceneCommandsList = new int[] { 31 };

	}

	// sc13 f
	public void sc21() {
		background("side quest house inside.png");
		this.text = "You have made it through the window, but you have not been unnoticed, the person who closed the door on you have come to meet you he is holding a bat, he demands you leave. ";
		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] { 38, 39 };

	}

	// minigame c
	public void sc22() {
		// couldnt get this background to work?? so placeholdered Intro image
		background("Intro.png");
		this.text = "MINIGAME.";
		this.mainPanelCommandsList = new int[] {};
		this.sceneCommandsList = new int[] { 40, 41 };

	}

//SC13G
	public void sc23() {
		background("returning to bus stop.png");
		this.text = "you see the man and fell you will lose this fight and leave via the window you come in through and hand back to the stranger to tell him you are unable to complete his task. Disappointed in this outcome the man attacks you, you defend just in time [-10 health] he runs away after hitting you.";
		this.mainPanelCommandsList = new int[] { 0, 32 };
		this.sceneCommandsList = new int[] {};

	}

	// WIN FROM MINI GAME sc14c
	public void sc24() {
		background("side quest house inside.png");
		this.text = "You have won the fight, the agressive man has fallen and is laying on the floor. Now you must look for the book";

		this.mainPanelCommandsList = new int[] { 0, 33 };
		this.sceneCommandsList = new int[] { 42 };
	}

	// LOSE FROM MINIGAME sc14B
	public void sc25() {
		background("side quest house inside.png");
		this.text = "You have lost, the man has left the room, you are bleeding you crawl to a wall to lean against. DO you have anything in your backpack that may help? Perhaps you can bandage up and then find that book!";
		this.mainPanelCommandsList = new int[] { 0, 35, 36 };
		this.sceneCommandsList = new int[] {};

	}

	// S14D
	public void sc26() {
		background("side quest house inside.png");
		this.text = "You see the book you are looking for resting on a book shelf, you pick yourself up and look around the room for anything else  ";
		this.mainPanelCommandsList = new int[] { 0, };
		this.sceneCommandsList = new int[] { 43, 44 };
	}

//S14E
	public void sc27() {
		background("Busstop-2.png");
		this.text = "After climbing back out though the window carefully, you make your way back to where the stranger was, you hand him the book.";
		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] { 45 };
	}

//S14F
	public void sc28() {
		background("Busstop-2.png");
		this.text = "Ther stranger show you his gratiude for doing this task for him, in return he tells you of the loction of paradise city and point you in the right direction";
		this.mainPanelCommandsList = new int[] { 0, 34 };
		this.sceneCommandsList = new int[] { 46 };
	}

	// S8_1C
	public void sc29() {
		background("brick Wall door.png");
		this.text = "TOM TO PATRYK SECTION";
		this.mainPanelCommandsList = new int[] {};
		this.sceneCommandsList = new int[] {};
	}

	// sc D2
	public void sc30() {
		background("side quest death.png");
		this.text = "You have not been able to banadge your wounds and have been left for a slow death as atempting to escape only exascabated your bleeding. ";
		this.mainPanelCommandsList = new int[] { 36 };
		this.sceneCommandsList = new int[] { 47 };
	}

//15b
	public void sc31() {
		background("Striaght road 2.png");
		this.text = "As you regain consciousness you notice that you have grazed your hand and your forehand has a cut that is slowly bleeding because of falling, you also notice your backpack has been opened and you have lost some of your belongings from your backpack. You look around and see if there is any body around you. ";

		this.mainPanelCommandsList = new int[] { 0, 38 };
		this.sceneCommandsList = new int[] { 49, 50 };
	}

//Bandages 15d
	public void sc32() {
		background("Striaght road 2.png");
		this.text = "You reach into your backpack finding less items in there than before. After finding your bandages you fix yourself up to stop the bleeding. You get up and soldier on.";

		this.mainPanelCommandsList = new int[] { 0, 40 };
		this.sceneCommandsList = new int[] { 51 };
	}

	// Sc15D_1 = no bandages link to s10A ( Ive added this change as seemed no
	// consequence or affect for)
	// having no bandages
	public void sc33() {
		background("Striaght road 2.png");
		this.text = "You have no bandages. You think you should find shelter and rest up.";

		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] { 16 };
	}

	// check backpack rout s15e
	public void sc34() {
		background("Side of road (item search).png");
		this.text = "You open you backpack and look though what has gone missing you find your CB radio is the only thing missing, you do not believe your wound is bleeding that much and continue along your way.";

		this.mainPanelCommandsList = new int[] { 0, 40 };
		this.sceneCommandsList = new int[] { 52, 53 };
	}

	// s15C
	public void sc35() {
		background("Side of road (item search).png");
		this.text = "You stand up and brush yourself off and without looking in you backpack you start to look around the aera you fell in to see if you can notice any of your belongings laying on the ground, you do not notice anything, you continue along your way";

		this.mainPanelCommandsList = new int[] {0,41};
		this.sceneCommandsList = new int[] { 53,54 };
	}

	// s15f
	public void sc36() {
		background("Turn back.png");
		this.text = "You have continued down the road for a few kilometers more feeling you have lost your way you reach into your backpack for your CB, it is not there. ";

		this.mainPanelCommandsList = new int[] { 0, 39 };
		this.sceneCommandsList = new int[] { 55 };
	}

	// D0
	public void sc37() {
		background("Death.png");
		this.text = "As you continue down the road looking around for a source of sustenance, you cannot seem to find any as you keep going feeling like you should have turned back but it is too late to turn around, as the day turns to night, find yourself crawling to a building that is falling apart to try sleep in, you close your eyes one last time. . ";

		this.mainPanelCommandsList = new int[] { 0, 36 };
		this.sceneCommandsList = new int[] {56};
	}

	// s15G
	public void sc38() {
		background("striaght road 2.png");
		this.text = "As you have made it back to a place that seems more failmer you see a shelter you could stay in for the night, as you approch the shelter you see your radio on the ground ";

		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] {16, 57};
	}
	//s10B
	public void sc39() {
		background("Bus side of road 1.png");
		this.text = "After making your way to the bus shelter you place your bag down and get comfortable for the night";
		this.mainPanelCommandsList = new int[] { 0 };
		this.sceneCommandsList = new int[] {};
	}

}
