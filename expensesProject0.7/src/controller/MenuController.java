package controller;

import menu.catalanMenu;
import menu.englishMenu;
import menu.russianMenu;
import menu.spanishMenu;

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

		if (language.equals("eng"))
			englishMenu.expensesMenu();
		else if (language.equals("cat"))
			catalanMenu.expensesMenu();
		else if (language.equals("spa"))
			spanishMenu.expensesMenu();
		else if (language.equals("rus"))
			russianMenu.expensesMenu();
		else {
		}
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