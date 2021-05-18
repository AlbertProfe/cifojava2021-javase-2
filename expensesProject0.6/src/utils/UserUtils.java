package utils;



public class UserUtils {
	
	public static String createEmail(String name, String surname) {
				
		
		String email = name.charAt(0) + surname + "@java.com";

		return email;
	}

	public static String createPassword() {
		

		String password = "";

		password = password + RandomUtils.createCharRandom() + RandomUtils.createIntRandom(10000) + RandomUtils.createCharRandom()
				+ RandomUtils.createCharRandom() + RandomUtils.createIntRandom(596);

		return password;
	}
	

}
