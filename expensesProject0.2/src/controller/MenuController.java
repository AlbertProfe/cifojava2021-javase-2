package controller;

import view.catalanMenu;
import view.englishMenu;
import view.russianMenu;
import view.spanishMenu;

public class MenuController {

	public static void mainMenu(String language) {

		if (language.equals("eng"))
			englishMenu.mainMenu();
		else if (language.equals("cat"))
			catalanMenu.mainMenu();
		else if (language.equals("spa"))
			spanishMenu.mainMenu();
		else if (language.equals("rus"))
			russianMenu.mainMenu();
		else {
		}

	}

	public static void loginMenu(String language) {
	}

	public static void expensesMenu(String language) {
	}

	public static void languagesMenu(String language) {

		if (language.equals("eng"))
			englishMenu.languagesMenu();
		else if (language.equals("cat"))
			catalanMenu.languagesMenu();
		else if (language.equals("spa"))
			spanishMenu.languagesMenu();
		else if (language.equals("rus"))
			russianMenu.languagesMenu();
		else {
		}

	}

}