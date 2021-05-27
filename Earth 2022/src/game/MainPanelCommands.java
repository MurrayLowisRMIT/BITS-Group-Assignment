package game;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

// these buttons form the commands in the main panel
public class MainPanelCommands extends Commands {
	// I don't know what this does, but it complains without it
	private static final long serialVersionUID = 7810649496279389274L;

	public MainPanelCommands(int globalID, int localID) {
		super(globalID, localID);
		super.buttonTemplate();
		newButton();
	}

	// includes features common to all main panel buttons
	protected void newButton() {
		// changes colour if inventory is open
		if (Globals.stats.inventoryOverlayActive & !this.enabled) {
			this.button.setForeground(new Color(123, 116, 81));
			this.button.setBackground(new Color(227, 225, 213));
		} else {
			this.button.setForeground(new Color(53, 46, 10));
			this.button.setBackground(new Color(243, 235, 197));
		}
		this.button.setFont(new Font("arial", Font.BOLD, 15));
		this.button.setVerticalAlignment(JButton.CENTER);
		// reset 'enabled' check
		this.enabled = true;

		super.buttonAction();
		// adds button to scene
		Globals.mainPanelCommands[this.localID] = this.button;
	}

	protected void selectCommand() {
		switch (this.globalID) {
		case 0:
			mc0();
			break;
		case 1:
			mc1();
			break;
		case 2:
			mc2();
			break;
		case 3:
			mc3();
			break;
		case 4:
			mc4();
			break;
		case 5:
			mc5();
			break;
		case 6:
			mc6();
			break;
		case 7:
			mc7();
			break;
		case 8:
			mc8();
			break;
		case 9:
			mc9();
			break;
		case 10:
			mc10();
			break;
		case 11:
			mc11();
			break;
		case 12:
			mc12();
			break;
		case 13:
			mc13();
			break;
		case 14:
			mc14();
			break;
		case 15:
			mc15();
			break;
		case 16:
			mc16();
			break;
		case 17:
			mc17();
			break;
		case 18:
			mc18();
			break;
		case 19:
			mc19();
			break;
		case 20:
			mc20();
			break;
		case 21:
			mc21();
			break;
		case 22:
			mc22();
			break;
		case 23:
			mc23();
			break;
		case 24:
			mc24();
			break;
		case 25:
			mc25();
			break;
		case 26:
			mc26();
			break;
		case 27:
			mc27();
			break;
		case 28:
			mc28();
			break;
		case 29:
			mc29();
			break;
		case 30:
			mc30();
			break;
		case 31:
			mc31();
			break;
		case 32:
			mc32();
			break;
		case 33:
			mc33();
			break;
		case 34:
			mc34();
			break;
		case 35:
			mc35();
			break;
		case 36:
			mc36();
			break;
		case 37:
			mc37();
			break;
		case 38:
			mc38();
			break;
		case 39:
			mc39();
			break;
		case 40:
			mc40();
			break;
		case 41:
			mc41();
			break;
		case 42:
			mc42();
			break;
		case 43:
			mc43();
			break;
		}
		
	}

	// BUTTON CONTENT BEGINS HERE-----------------------------------------------
	// -------------------------------------------------------------------------

	// open/close inventory
	public void mc0() {
		if (action == false)
		// draw ----------------------------------------
		{
			icon("Inventory.png");
			this.button.setBounds(Globals.mainPanelWidth - 150, 0, 120, 50);
			// stops button being disabled by the inventory overlay
			this.button.setEnabled(true);
			// allow this button to keep colour with inventory open
			this.enabled = true;
		} else
		// action --------------------------------------
		{
			if (Globals.stats.inventoryOverlayActive) {
				Globals.stats.inventoryOverlayActive = false;
				Globals.stats.mainPanelOverlayActive = true;
				Globals.stats.sceneOverlayActive = true;
			} else {
				Globals.stats.inventoryOverlayActive = true;
				Globals.stats.mainPanelOverlayActive = false;
				Globals.stats.sceneOverlayActive = false;
			}
		}
	}

	// go to scene 1
	public void mc1() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 1;
		}
	}

	// turn on radio
	public void mc2() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Turn on radio";
		} else
		// action --------------------------------------
		{
			Globals.stats.radio = 1;
		}
	}

	// "OK" button
	public void mc3() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "OK";
		} else
		// action --------------------------------------
		{
			// blank - function determined by scene class statements
		}
	}

	// go to scene 2
	public void mc4() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Follow the signal";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 2;
		}
	}

	// go to scene 3
	public void mc5() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 3;
		}
	}

	// scene 4 take comic
	public void mc6() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(80, 0, 120, 50);
			this.text = "Take the comic";
		} else
		// action --------------------------------------
		{
			Globals.stats.comicBookDecision = 1;
			Globals.stats.comicBook++;
		}
	}

	// scene 4 ignore comic
	public void mc7() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(220, 0, 120, 50);
			this.text = "Ignore the comic";
		} else
		// action --------------------------------------
		{
			Globals.stats.comicBookDecision = 2;
		}
	}

	// scene 4 destroy comic
	public void mc8() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(360, 0, 120, 50);
			this.text = "Destroy the comic";
		} else
		// action --------------------------------------
		{
			Globals.stats.comicBookDecision = 3;

		}
	}

	// scene 4 - go to scene 5
	public void mc9() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 5;
		}
	}

	// scene 4_1 pat dog
	public void mc10() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(80, 0, 120, 50);
			this.text = "Pat the dog";
		} else
		// action --------------------------------------
		{
			Globals.stats.dogDecision = 1;
		}
	}

	// scene 4_1 feed dog
	public void mc11() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(220, 0, 120, 50);
			this.text = "Feed the dog";
		} else
		// action --------------------------------------
		{
			Globals.stats.dogDecision = 2;
		}
	}

	// scene 4_1 ignore dog
	public void mc12() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(360, 0, 120, 50);
			this.text = "Ignore the dog";
		} else
		// action --------------------------------------
		{
			Globals.stats.dogDecision = 3;
		}
	}

//	----------------------------------------------------------
//	
// -----------------------------------------------------------tom
	
//RADIO CHOICE
	public void mc13() {

		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Check Your Radio";

		} else
		// action --------------------------------------
		{
			Globals.stats.pathSc5Decision = 3;
		}
	}
// N/a
	// shelter path
	public void mc14() {
		if (action == false)
		// draw ----------------------------------------
		{

		} else
		// action --------------------------------------

		{

		}
	}
// N/a
//Continue path
	public void mc15() {
		if (action == false)
		// draw ----------------------------------------
		{

		} else
		// action --------------------------------------

		{

		}
	}

//RADIO
	public void mc16() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "RADIO PATH";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 402;
		}
	}

//SHELTER
	public void mc17() {

		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "PATH";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 403;
		}
	}

	public void mc18() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "PATH";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 404;
		}
	}

// BUS PATH CONT S10a to s11a
	public void mc19() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Rest";
		} else
		// action --------------------------------------

		{
			Globals.stats.staticSceneID = 405;
		}
	}

//S11a rock
	public void mc20() {
		if (action == false)
		// draw ----------------------------------------
		{

		} else
		// action --------------------------------------
		{
			Globals.stats.pathSc11aDecision = 3;
		}
	}

//S11a dog
	public void mc21() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Scare the dog";
		} else
		// action --------------------------------------
		{
			Globals.stats.pathSc11aDecision = 1;
		}
	}

//S11a bag
	public void mc22() {
		if (action == false)
		// draw ----------------------------------------
		{

		} else
		// action --------------------------------------
		{
			Globals.stats.pathSc11aDecision = 2;
		}
	}

//move to 11_1c
	public void mc23() {

		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 406;
		}
	}

//SC 12
	public void mc24() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 407;
		}
	}

	public void mc25() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 408;
		}
	}

	public void mc26() {

		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 406;
		}
	}

//Continue s11D->s11_1a
	public void mc27() {

		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 410;
		}
	}

	public void mc28() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Help the man";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 411;
		}
	}

	public void mc29() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Knock on the door";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 412;
		}

	}

	public void mc30() {
		if (action == false)
		// draw ----------------------------------------
		{

			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);

			this.text = "Knock Again";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 414;
		}

	}

//s11_1b back to s11_1c (method sc10())
	public void mc31() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Check Radio";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 406;
		}

	}

//Flee to bus stop s11_1b
	public void mc32() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Flee to bus stop";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 416;
		}
	}

//look for book (WIN PATH) to sc14d
	public void mc33() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.button.setEnabled(true);
			this.button.setCursor(null);
			this.text = "Look for book";
		} else
		// action --------------------------------------
		{

		}

	}

	// to Patryk scene S8_1C
	public void mc34() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Follow directions";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 425;
		}
	}

	public void mc35() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Check for bandages";
		} else
		// action --------------------------------------
		{
			if (Globals.stats.bandages == 0) {
				Globals.stats.staticSceneID = 426;
			} else
				Globals.stats.staticSceneID = 422;
		}
	}

//RETURN TO MAIN MENU
	public void mc36() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Return to main menu";
			
		} else
		// action --------------------------------------
		{
			
			Globals.stats.staticSceneID = -1;
			
		}
	}
	public void mc37() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue..";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 427;
		}
	}
	public void mc38() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Grab bag and move on";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 431;
		}
	}
	public void mc39() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue..";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 433;
		}
	}
	public void mc40() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Continue..";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 432;
		}
	}
	public void mc41() {
		if (action == false)
		// draw ----------------------------------------
		{
			this.button.setBounds(Globals.mainPanelWidth / 2 - 60, 0, 120, 50);
			this.text = "Pick up bag and move on";
		} else
		// action --------------------------------------
		{
			Globals.stats.staticSceneID = 432;
		}
	}
	public void mc42() {
		
	}
	public void mc43() {
		
	}

}