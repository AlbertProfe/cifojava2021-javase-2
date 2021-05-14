package controller;

import java.util.Scanner;

import model.Language;

public class LanguagesController {

	public static String languageSelection(Scanner reader, Language language) {
		
		MenuController.languagesMenu(language.getTag());
		
		String command = reader.nextLine();
		
		return command;
			
		// to-do while ....
	}
	
	

}
