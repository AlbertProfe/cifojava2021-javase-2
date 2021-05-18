package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import model.Language;
import model.User;
import utils.UsersUtils;

public class MainController {

	public static void AppStarting() {

		ArrayList<User> users = new ArrayList<User>();
		HashMap<String, Language> languages = LanguagesController.initLanguages();

		Language language = languages.get("english");
		Scanner reader = new Scanner(System.in);
		String command;

		while (true) {

			MenuController.mainMenu(language.getTag());
			command = reader.next();

			if (command.equals(language.getPrompts().get("quit"))) {
				reader.close();
				break;

			} else if (command.equals(language.getPrompts().get("create"))) {
				UserController.createUser(reader, users, language);

			} else if (command.equals(language.getPrompts().get("login"))) {

				users = LoginController.validateUser(reader, users);

				if (UsersUtils.getValidatedUser(users) != null) {
					User userValidated = new User();
					userValidated = UsersUtils.getValidatedUser(users);

					ExpensesController.runExpenses(reader, userValidated);
					System.out.println("expenses finshing...");
				}

			} else if (command.equals(language.getPrompts().get("language"))) {

				language = LanguagesController.languageSelection(reader, language, languages);

			} else {
				System.out.println(
						"\nPlease, you have to write \"create\", \"login\" or \"quit\". Try another time ...\n");

			}

		}

	}

}
