package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Language;
import model.User;
import utils.UserUtils;

public class UserController {
	
	//pending to-do userController while with all the OPTION v2.0

	public static void createUser(Scanner reader, ArrayList<User> users, Language language) {
		
		User newUser = new User();

		System.out.println(language.getPrompts().get("tellName"));
		newUser.setName(reader.next());

		System.out.println(language.getPrompts().get("tellSurame"));
		newUser.setSurname(reader.next());

		System.out.println(language.getPrompts().get("tellAge"));
		newUser.setAge(reader.nextInt());

		newUser.setUserName(newUser.getName());
		
		newUser.setEmail(UserUtils.createEmail(newUser.getName(), newUser.getSurname()));
		
		newUser.setPassword(UserUtils.createPassword());
		System.out.println("Password: "  + newUser.getPassword());
		
		users.add(newUser);

	}

	public static void deleteUser() {

		// to-do
	}

	public static void updateUser() {

		// to-do
	}
	
	public static void listUsers() {

		// to-do
	}

}
