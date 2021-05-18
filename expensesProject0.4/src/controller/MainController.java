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

		while (true) {

			MenuController.mainMenu(language.getTag());
			Scanner reader = new Scanner(System.in);
			String command = reader.nextLine();

			if (command.equals(language.getQuit())) {
				reader.close();
				break;

			} else if (command.equals(language.getCreate())) {
				UserController.createUser(reader, users, language);

			} else if (command.equals(language.getLogin())) {
				
				users = LoginController.validateUser(reader, users);

				if (UsersUtils.getValidatedUser(users) != null) {
					
					// if user isValidated
					// ExpensesController.execute(user)
					//else 
					// keep going ..
					
					User userValidated = new User();
					userValidated = UsersUtils.getValidatedUser(users);
					
					
					
					//to-do expensesController VIEW
					//to-do menuController CONTROLLER
					//to-do expenses methods and class MODEL
					
					System.out.println("expenses feature in progress...");
				}

			} else if (command.equals(language.getLanguage())) {

				language = LanguagesController.languageSelection(reader, language, languages);

			} else {
				System.out.println(
						"\nPlease, you have to write \"create\", \"login\" or \"quit\". Try another time ...\n");
				reader.close();
			}

		}

		

	}

}
