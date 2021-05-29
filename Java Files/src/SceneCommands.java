package game;

import java.awt.Font;

import javax.swing.JButton;

// these buttons form the interactive scene commands
public class SceneCommands extends Commands {
	// I don't know what this does, but it complains without it
	private static final long serialVersionUID = 7810649496279389274L;

	public SceneCommands(int globalID, int localID) {
		super(globalID, localID);
		super.buttonTemplate();
		newButton();
	}

	// includes features common to all scene buttons
	protected void newButton() {
		this.button.setFont(new Font("arial", Font.BOLD, 15));
		this.button.setBorder(null);
		if (!this.enabled) {
			this.button.setVerticalTextPosition(JButton.TOP);
			this.button.setContentAreaFilled(false);
		}
		this.enabled = true;

		super.buttonAction();
		// adds button to scene
		Globals.sceneCommands[this.localID] = this.button;
	}

	protected void selectCommand() {
		switch (this.globalID) {
		case -4:
			title();
			break;
		case -3:
			startGame();
			break;
		case -2:
			tutorial();
			break;
		case -1:
			artPack();
			break;
		case 0:
			sc0();
			break;
		case 1:
			sc1();
			break;
		case 2:
			sc2();
			break;
		case 3:
			sc3();
			break;
		case 4:
			sc4();
			break;
		case 5:
			sc5();
			break;
		case 6:
			sc6();
			break;
		case 7:
			sc7();
			break;
		case 8:
			sc8();
			break;
		case 9:
			sc9();
			break;
		case 10:
			sc10();
			break;
		case 11:
			sc11();
			break;
		case 12:
			sc12();
			break;
		case 13:
			sc13();
			break;
		case 14:
			sc14();
			break;
		case 15:
			sc15();
			break;
		case 16:
			sc16();
			break;
		case 17:
			sc17();
			break;
		case 18:
			sc18();
			break;
		case 19:
			sc19();
			break;
		case 20:
			sc20();
			break;
		case 21:
			sc21();
			break;
		case 22:
			sc22();
			break;
		case 23:
			sc23();
			break;
		case 24:
			sc24();
			break;
		case 25:
			sc25();
			break;
		case 26:
			sc26();
			break;
		case 27:
			sc27();
			break;
		case 28:
			sc28();
			break;
		case 29:
			sc29();
			break;
		case 30:
			sc30();
			break;
		case 31:
			sc31();
			break;
		case 32:
			sc32();
			break;
		case 33:
			sc33();
			break;
		case 34:
			sc34();
			break;
		case 35:
			sc35();
			break;
		case 36:
			sc36();
			break;
		case 37:
			sc37();
			break;
		case 38:
			sc38();
			break;
		case 39:
			sc39();
			break;
		case 40:
			sc40();
			break;
		case 41:
			sc41();
			break;
		case 42:
			sc42();
			break;
		case 43:
			sc43();
			break;
		case 44:
			sc44();
			break;
		case 45:
			sc45();
			break;
		case 46:
			sc46();
			break;
		case 47:
			sc47();
			break;
		case 48:
			sc48();
			break;
		case 49:
			sc49();
			break;
		case 50:
			sc50();
			break;
		case 51:
			sc51();
			break;
		case 52:
			sc52();
			break;
		case 53:
			sc53();
			break;
		case 54:
			sc54();
			break;
		case 55:
			sc55();
			break;
		case 56:
			sc56();
			break;
		case 57:
			sc57();
			break;

		}

	}

	// BUTTON CONTENT BEGINS HERE-----------------------------------------------
	// -------------------------------------------------------------------------

// main menu title
	public void title() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Title.png");
			this.button.setBounds((Globals.windowWidth - 400) / 2, 50, 400, 200);
			this.enabled = true;
			this.button.setEnabled(true);
			this.button.setCursor(null);
		}
	}

	// start game button
	public void startGame() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("New Game.png");
			this.button.setBounds((Globals.windowWidth - 200) / 2, 300, 200, 80);
			this.enabled = true;
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 0;
		}
	}

	// start tutorial
	public void tutorial() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Tutorial.png");
			this.button.setBounds((Globals.windowWidth - 200) / 2, 400, 200, 80);
			this.enabled = true;
		} else
		// action --------------------------------------
		{

		}
	}

	// change art pack
	public void artPack() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Art Pack.png");
			this.button.setBounds((Globals.windowWidth - 200) / 2, 500, 200, 80);
			this.enabled = true;
		} else
		// action --------------------------------------
		{
			if (Globals.stats.artPack == "Final") {
				Globals.stats.artPack = "Placeholder";
			} else {
				Globals.stats.artPack = "Final";
			}
		}
	}

	// pick up radio
	public void sc0() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("radio on table.png");
			this.button.setBounds(90, 470, 122, 61 + 60);
			this.text = "Pick up radio";
		} else
		// action --------------------------------------
		{
			Globals.stats.radio++;
		}
	}

	// pick up bandages
	public void sc1() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Bandage.png");
			this.button.setBounds(Globals.windowWidth - 180, 520, 89, 74 + 60);
			this.text = "Pick up bandages";
		} else
		// action --------------------------------------
		{
			Globals.stats.bandages++;
			Globals.stats.check = true;
		}
	}

	// scene 3 shadowy figure
	public void sc2() {
		overlayImage("Shadowman.png");
		this.button.setBounds((Globals.windowWidth - 425) / 2, Globals.windowHeight - Globals.mainPanelHeight - 207,
				159, 207);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// scene 3 go left
	public void sc3() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Arrow Left.png");
			this.button.setBounds(100, 200, 116, 59 + 60);
			this.text = "Go left";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 4;
		}
	}

	// scene 3 go right
	public void sc4() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Arrow Right.png");
			this.button.setBounds(Globals.windowWidth - 160, 200, 116, 59 + 60);
			this.text = "Go right";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 104;
		}
	}

	// scene 3 sign
	public void sc5() {
		overlayImage("intersection sign.png");
		this.button.setBounds(Globals.windowWidth / 2 - 107 / 2, 69, 107, 257);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// scene 4 comic
	public void sc6() {
		overlayImage("Comic.png");
		this.button.setBounds(Globals.windowWidth / 2, 280, 129, 156);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// scene 4 reading comic
	public void sc7() {
		overlayImage("Reading comic.png");
		this.button.setBounds(400, Globals.windowHeight - Globals.mainPanelHeight - 312, 498, 312);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// scene 4 broken comic
	public void sc8() {
		overlayImage("Broken Comic.png");
		this.button.setBounds(350, Globals.windowHeight - Globals.mainPanelHeight - 309, 480, 309);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// scene 5 dog first appearance
	public void sc9() {
		overlayImage("dog standing.png");
		this.button.setBounds(400, 200, 244, 192);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// scene 1 hand holding radio
	public void sc10() {
		overlayImage("hand holding radio.png");
		this.button.setBounds(400, Globals.windowHeight - Globals.mainPanelHeight - 450, 446, 450);
		this.button.setEnabled(true);
		this.button.setCursor(null);

	}

	// scene 5 dog being petted
	public void sc11() {
		overlayImage("Dog front.png");
		this.button.setBounds(Globals.mainPanelWidth / 2 + 100, 100, 370, 523);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc12() {

	}

	// scene 5 hand petting dog
	public void sc13() {
		overlayImage("Hand to Dog.png");
		this.button.setBounds(Globals.mainPanelWidth / 2 + 100 - 250, 200, 482, 354);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// scene 5 dog eating
	public void sc14() {
		overlayImage("dog eat bread.png");
		this.button.setBounds(420, 250, 214, 138);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// dog following player
	public void sc15() {
		overlayImage("following dog.png");
		this.button.setBounds(800, Globals.windowHeight - Globals.mainPanelHeight - 61, 145, 61);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// shelter in distance
	public void sc16() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("shelter.png");
			this.button.setBounds(200, 261, 145, 61);
			this.text = "Search for shelter";
		} else
		// action --------------------------------------

		{
			Globals.stats.staticSceneID = 403;
		}
	}

	// scene 5 - continue to walk
	public void sc17() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(550, 250, 200, 50);
			this.text = "Continue to walk";
		} else
		// action --------------------------------------

		{
			Globals.stats.staticSceneID = 404;
		}
	}

// Radio Path overlay
	public void sc18() {
		overlayImage("hand holding radio.png");
		this.button.setBounds(400, 0, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

// BUSTOP PATH SC5>11
	public void sc19() {
		overlayImage(".png");
		this.button.setBounds(200, 0, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc20() {
		overlayImage("Bus Stop.png");
		this.button.setBounds(400, 0, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);

	}

	public void sc21() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("rock.png");
			this.button.setBounds(250, 180, 500, 500);

			this.text = "Throw rock";
		} else
		// action --------------------------------------

		{
			Globals.stats.staticSceneID = 409;
		}
	}

	public void sc22() {

		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("bus stop backpack.png");
			this.button.setBounds(-150, 250, 500, 500);

			this.text = "Reach for backpack";
		} else
		// action --------------------------------------

		{
			Globals.stats.staticSceneID = 408;
		}

	}

	public void sc23() {
		overlayImage("dog sniffing backpack.png");
		this.button.setBounds(-70, 200, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	// scare dog hands
	public void sc24() {
		overlayImage("hands waving to scare dog.png");
		this.button.setBounds(400, 150, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc25() {
		overlayImage("Dog run out of sight.png");
		this.button.setBounds(-70, 50, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc26() {
		overlayImage("radio slight damaged use.png");
		this.button.setBounds(400, 150, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc27() {
		overlayImage("bus stop backpack.png");
		this.button.setBounds(-150, 250, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);

	}

	public void sc28() {
		overlayImage("hand reaching for backpack.png");
		this.button.setBounds(0, 250, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);

	}

	public void sc29() {
		overlayImage("rock flying.png");
		this.button.setBounds(-100, 200, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc30() {
		overlayImage("hand throwing rock.png");
		this.button.setBounds(0, 350, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc31() {
		overlayImage("side quest house in distance.png");
		this.button.setBounds(550, 60, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc32() {
		overlayImage("stranger in peace.png");
		this.button.setBounds(300, 60, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc33() {
		overlayImage("Side quest  door (eye seeing you).png");
		this.button.setBounds(360, 70, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}

	public void sc34() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Side quest rubble (side).png");
			this.button.setBounds(975, -15, 500, 500);

			this.text = "Look";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 413;
		}
	}

	public void sc35() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("side quest rubble (climb).png");
			this.button.setBounds(390, 0, 500, 500);

			this.text = "Climb Up";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 415;
		}
	}

	public void sc36() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("footsteps back (sidequest).png");
			this.button.setBounds(970, 200, 500, 500);

			this.text = "Too risky, turn back";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 416;
		}

	}

	public void sc37() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("side quest window.png");
			this.button.setBounds(380, -60, 500, 500);

			this.text = "Jump through";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 417;
		}
	}

	public void sc38() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("side quest guy attacks.png");
			this.button.setBounds(50, 0, 500, 500);

			this.text = "Stay";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 418;
		}
	}
	

	public void sc39() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("side quest window(inside).png");
			this.button.setBounds(995, -5, 500, 500);

			this.text = "Leave";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 419;
		}
	}

	public void sc40() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Baseball bat.png");
			this.button.setBounds(-200, 0, 500, 500);

			this.text = "WIN";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 420;
		}
	}
	public void sc41() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Hand.png");
			this.button.setBounds(200, 0, 500, 500);

			this.text = "LOSE";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 421;
		}
	}
	public void sc42() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("side quest book.png");
			this.button.setBounds(225, 210, 200, 200);

		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 422;
		}
		
	}
	public void sc43() {
		overlayImage("Holding book.png");
		this.button.setBounds(350, 60, 500, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}
	public void sc44() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("side quest window(inside).png");
			this.button.setBounds(995, -5, 500, 500);

			this.text = "Leave";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 423;
		}
	}
	public void sc45() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("stranger gratitue.png");
			this.button.setBounds(250,80, 500, 500);

			this.text = "Return book to stranger";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 424;
		}
	}
	public void sc46() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("stranger pointing the way.png");
			this.button.setBounds(250,80, 500, 500);

		} else
		// action --------------------------------------
		{
			
		}
	}
	public void sc47() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("hands laying dead.png");
			this.button.setBounds(270,150, 800, 500);

		} else
		// action --------------------------------------
		{
			
		}
	}
	public void sc48() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("blackout.png");
			this.button.setBounds(0,0, 1280, 720);

		} else
		// action --------------------------------------
		{
			
		}
	}
	public void sc49() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("hand with blood.png");
			this.button.setBounds(0,50, 800, 720);
			this.text ="Reach into backpack for bandages";
		} else
		// action --------------------------------------
		{
			if (Globals.stats.bandages == 0) {
				Globals.stats.staticSceneID =429 ;
			} else
				Globals.stats.staticSceneID =428;
		}
	}
	public void sc50() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Backpack.png");
			this.button.setBounds(800,280, 200, 200);
			this.text ="Look for missing items";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID=430;
		}
	}
	public void sc51() {
		overlayImage("Bandage hand.png");
		this.button.setBounds(200, 0, 900, 500);
		this.button.setEnabled(true);
		this.button.setCursor(null);
	}
	public void sc52() {
		overlayImage("hand holding backpack.png");
		this.button.setBounds(200, -100, 900, 900);
		this.button.setEnabled(true);
		this.button.setCursor(null);
		
	}
	public void sc53() {
		overlayImage("Bleeding veiw.png");
		this.button.setBounds(0, -40, 1280, 720);
		this.button.setEnabled(true);
		this.button.setCursor(null);
		
	}
	public void sc54() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("Backpack.png");
			this.button.setBounds(1050,230, 200, 200);
			
		} else
		// action --------------------------------------
		{
			
		}
	}
	//Take to S15G
	public void sc55() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("trun back sign.png");
			this.button.setBounds(150,0, 200, 400);
			this.text ="Turn Back";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID=434;
		}
	}
	public void sc56() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("crawling(death).png");
			this.button.setBounds(120,200, 1000, 500);
			
		} else
		// action --------------------------------------
		{
			
		}
	}
	public void sc57() {
		if (action == false)
		// draw ----------------------------------------
		{
			overlayImage("radio slight damaged.png");
			this.button.setBounds(400,80, 500, 500);
			this.text = "Grab Radio";
			
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID=403;
		}
	}

	


}
