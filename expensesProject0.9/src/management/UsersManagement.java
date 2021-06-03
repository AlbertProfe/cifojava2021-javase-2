package management;

import java.util.ArrayList;
import java.util.Scanner;

import model.Language;
import model.User;
import utils.UserUtils;

public class UsersManagement {
	
	public static void createUser(Scanner reader, ArrayList<User> users, Language language) {
		//creating new object User
		User newUser = new User();
		//ask for attributes (Name/Surname/Age), read the commands and set them.
		System.out.println(language.getMessage().get("tellName"));
		newUser.setName(reader.next());

		System.out.println(language.getMessage().get("tellSurname"));
		newUser.setSurname(reader.next());

		System.out.println(language.getMessage().get("tellAge"));
		newUser.setAge(reader.nextInt());
		//creating Username from Name.
		newUser.setUserName(newUser.getName());
		//creating Email from Name and Surname (thanks to createEmail method, located in UserUtils class).		
		newUser.setEmail(UserUtils.createEmail(newUser.getName(), newUser.getSurname()));
		//creating Password (thanks to createPassword method, located in UserUtils class).		
		newUser.setPassword(UserUtils.createPassword());
		System.out.println("Password: "  + newUser.getPassword());
		//adding newUser to our array.		
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
