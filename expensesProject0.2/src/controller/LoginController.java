package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.User;

public class LoginController {

	public static void validateUser() {

		// as Parameter this method gets from MainController scanner-reader and Users
		// ARRAYLIST
		ArrayList<User> users = new ArrayList<User>();
		Scanner reader = new Scanner(System.in);

		String consoleUser;
		String passwordConsole;
		int countNumberofTries = 0;
		while (countNumberofTries < 5) {

			// scanner read userConsole and passwordConsole

			consoleUser = reader.nextLine();
			passwordConsole = reader.nextLine();

			if (checkUserAndPasswordWithinArray(consoleUser, passwordConsole)) {

				//
				// countNumberofTries ++;

			}

		}

	}

	public static boolean checkUserAndPasswordWithinArray(String consoleUser, String passwordConsole) {
		ArrayList<User> users = new ArrayList<User>();

		for (User usertoCheck : users) {

			if (usertoCheck.getName().equals(consoleUser)) {// in

			} else {
				// you are out
			}
		}

		return true;
	}

}
