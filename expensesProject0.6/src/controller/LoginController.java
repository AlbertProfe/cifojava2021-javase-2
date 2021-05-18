package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.User;

public class LoginController {

	public static ArrayList<User> validateUser(Scanner reader, ArrayList<User> users) {
		
		int count = 1;
		String userConsole;
		String passwordConsole;
		System.out.println("\nWelcome Login to Expenses");

		do {

			System.out.println("\nEnter Username : ");
			userConsole = reader.next();

			System.out.println("Enter Password : ");
			passwordConsole = reader.next();

			if (validateUserAndPassword(userConsole, passwordConsole, users)) {
				System.out.println("Access Granted! Welcome!");
				return users;

			} else if (validateUser(userConsole, users)) {
				System.out.println("Invalid Password!");
			} else if (validatePassword(passwordConsole, users)) {
				System.out.println("Invalid Username!");
			} else {
				System.out.println("Invalid Username & Password!");
			}

			System.out.println("Total attempts: " + count + "/3");
			count++;

			if (count == 4)
				// to-do it is just a print line
				//we need to set field isBlocked to false
				System.out.println("User blocked!");

		} while (count < 4);

		return users;
	}

	public static boolean validateUserAndPassword(String userConsole, String passwordConsole, ArrayList<User> users) {

		for (User user : users) {
			if (userConsole.equals(user.getUserName()) && passwordConsole.equals(user.getPassword())) {
				user.setValidated(true);
				return true;
			}	

		}
		return false;
	}

	public static boolean validateUser(String userConsole, ArrayList<User> users) {

		for (User user : users) {
			if (userConsole.equals(user.getUserName()))
				return true;

		}
		return false;
	}

	public static boolean validatePassword(String passwordConsole, ArrayList<User> users) {

		for (User user : users) {
			if (passwordConsole.equals(user.getPassword()))
				return true;

		}
		return false;
	}

}