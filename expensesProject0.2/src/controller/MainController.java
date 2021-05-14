package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Language;
import model.User;

public class MainController {

	public static void AppStarting() {

		ArrayList<User> users = new ArrayList<User>();
		Scanner reader = new Scanner(System.in);
		
		//HashMap<String,Language> lenguages = new HashMap<String, Language>();

		Language english = new Language("English", "eng", "create", "login", "language", "quit");
		Language catalan = new Language("Catalan", "cat", "crear", "logejar-se", "llengua", "sortir");
		Language spanish = new Language("Spanish", "spa", "crear", "loguearse", "lengua", "salir");
		Language russian = new Language("Russian", "rus");

		Language lenguage = english;

		while (true) {

			MenuController.mainMenu(lenguage.getTag());

			String command = reader.nextLine();

			if (command.equals(lenguage.getQuit())) {
				break;

			} else if (command.equals(lenguage.getCreate())) {
				UserController.createUser(reader, users);

			} else if (command.equals(lenguage.getLogin())) {
				LoginController.validateUser();

			} else if (command.equals(lenguage.getLanguage())) {
				String langaugeToSelect = LanguagesController.languageSelection(reader, lenguage);
				if (langaugeToSelect.equals("english"))
					lenguage = english;
				if (langaugeToSelect.equals("catalan"))
					lenguage = catalan;
				if (langaugeToSelect.equals("spanish"))
					lenguage = spanish;
				if (langaugeToSelect.equals("russian"))
					lenguage = russian;

			} else {
				System.out.println(
						"\nPlease, you have to write \"create\", \"login\" or \"quit\". Try another time ...\n");
			}

		}

		reader.close();

	}

}
