package controller;

import menu.CatalanMenu;
import menu.EnglishMenu;
import menu.RussianMenu;
import menu.SpanishMenu;

public class MenuController {

	public static void mainMenu(String language) {

		if (language.equals("eng"))
			EnglishMenu.mainMenu();
		else if (language.equals("cat"))
			CatalanMenu.mainMenu();
		else if (language.equals("spa"))
			SpanishMenu.mainMenu();
		else if (language.equals("rus"))
			RussianMenu.mainMenu();
		else {
		}

	}

	public static void loginMenu(String language) {
	}

	public static void expensesMenu(String language) {

		if (language.equals("eng"))
			EnglishMenu.expensesMenu();
		else if (language.equals("cat"))
			CatalanMenu.expensesMenu();
		else if (language.equals("spa"))
			SpanishMenu.expensesMenu();
		else if (language.equals("rus"))
			RussianMenu.expensesMenu();
		else {
		}
	}

	public static void languagesMenu(String language) {

		if (language.equals("eng"))
			EnglishMenu.languagesMenu();
		else if (language.equals("cat"))
			CatalanMenu.languagesMenu();
		else if (language.equals("spa"))
			SpanishMenu.languagesMenu();
		else if (language.equals("rus"))
			RussianMenu.languagesMenu();
		else {
		}

	}

}