package expensesProject;

import java.util.ArrayList;
import java.util.Scanner;

public class UserCreation {
	public static void createuser(Scanner reader, ArrayList<User> users) {
		// public static void createuser(Scanner reader) {

		User newUser = new User();

		System.out.println("Tell me your name:");
		newUser.setName(reader.nextLine());

		System.out.println("Tell me your surname:");
		newUser.setSurname(reader.nextLine());

		System.out.println("Tell me your age:");
		newUser.setAge(reader.nextInt());

		// to-do methods create user and password

		users.add(newUser);

	}

}
