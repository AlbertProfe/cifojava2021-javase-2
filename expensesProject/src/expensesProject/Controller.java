package expensesProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

	public static void AppStarting() {

		ArrayList<User> users = new ArrayList<User>();

		while (true) {

			Scanner reader = new Scanner(System.in);

			System.out.println("Welcome to Expenses Managment");
			System.out.println("-------------------------\n");
			System.out.println("1-Create user");
			System.out.println("2-Login into Expenses");
			System.out.println("3-Quit");

			String command = reader.nextLine();

			if (command.equals("quit")) {
				break;

			} else if (command.equals("create")) {
				UserCreation.createuser(reader, users);

			} else if (command.equals("login")) {
				// to-do login
			} else {
				System.out
						.println("Please, you have to write \"create\", \"login\" or \"quit\". Try another time ...\n");
			}

		}

	}

}
