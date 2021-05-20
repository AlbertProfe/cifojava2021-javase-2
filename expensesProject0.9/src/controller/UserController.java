package controller;

import java.util.ArrayList;
import java.util.Scanner;

import management.UsersManagement;
import model.Language;
import model.User;
import utils.UserUtils;

public class UserController {
	
	//pending to-do userController while(true){} with all the OPTIONS:
	//createUser, deleteUser, updateUser, listUsers
	//we will do at v2.0, so far, we do pipeline straightforward to createUser
	
	public static void runUsers(Scanner reader, ArrayList<User> users, Language languageSelectedApp) {

		UsersManagement.createUser(reader, users, languageSelectedApp);
		
	}


	
}
