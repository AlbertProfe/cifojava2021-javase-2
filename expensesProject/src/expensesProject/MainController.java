package expensesProject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainController {

	public static void AppStarting() {

		ArrayList<User> users = new ArrayList<User>();
		Scanner reader = new Scanner(System.in);
		
		while (true) {

			
			Menu.mainMenu();
			
			String command = reader.nextLine();

			if (command.equals("quit")) {
				break;

			} else if (command.equals("create")) {
				UserCreation.createuser(reader, users);
				//UserCreation.createuser(reader);

			} else if (command.equals("login")) {
				// to-do login
				
			} else if (command.equals("language")) {
				// to-do language
					
			} else {
				System.out
						.println("\nPlease, you have to write \"create\", \"login\" or \"quit\". Try another time ...\n");
			}

		}
		
		reader.close();

	}
	
	

}
