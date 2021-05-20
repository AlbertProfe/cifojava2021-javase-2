package utils;

import java.util.ArrayList;

import model.User;

public class UsersUtils {

	public static User getValidatedUser(ArrayList<User> users) {

		
		int index = 0;
		for (User user : users) {

			if (user.isValidated)
				return  users.get(index);
			index++;
		}

		return null;
	}

}
