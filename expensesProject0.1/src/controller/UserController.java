package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.User;

public class UserController {

	public static void createUser(Scanner reader, ArrayList<User> users) {
		

		
		System.out.println("Users created (static with class User): " + User.getTypeUser());
		User newUser = new User();
		newUser.getCountUsers();
		
		User borja = new User();
		System.out.println("Tell me your name:");
		newUser.setName(reader.nextLine());

		System.out.println("Tell me your surname:");
		newUser.setSurname(reader.nextLine());

		System.out.println("Tell me your age:");
		newUser.setAge(reader.nextInt());

		// to-do methods create user and password

		users.add(newUser);
		
		System.out.println("Users created (static with class User): " + User.getCountUsers());
		System.out.println("Users created (static with newUser): " + newUser.getCountUsers());
		
		System.out.println("Users created (static with class User): " + User.getTypeUser());
		System.out.println("Users created (static with newUser): " + newUser.getTypeUser());
		
		System.out.println("Borja: " + borja.getCountUsers());
		System.out.println("Borja: " + borja.getTypeUser());
		
		
		borja.setTypeUser("admin");
		System.out.println("Borja: " + borja.getTypeUser());
		System.out.println("Borja: " + User.getTypeUser());
		
		
		
		System.out.println(newUser.getClass().descriptorString());
		
	}

	public static void deleteUser() {

		// to-do
	}

	public static void updateUser() {

		// to-do
	}
	
	public static void listgUsers() {

		// to-do
	}

}
