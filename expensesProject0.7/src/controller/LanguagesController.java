package controller;

import java.util.HashMap;
import java.util.Scanner;

import model.Language;

public class LanguagesController {

	public static Language languageSelection(Scanner reader, Language language, HashMap<String, Language> languages) {

		MenuController.languagesMenu(language.getTag());
		String command = reader.next();

		if (command.equals("english"))
			language = languages.get("english");
		if (command.equals("catalan"))
			language = languages.get("catalan");
		if (command.equals("spanish"))
			language = languages.get("spanish");
		if (command.equals("russian"))
			language = languages.get("russian");

		return language;

		// to-do while ....
	}

	public static HashMap<String, Language> initLanguages() {

		HashMap<String, Language> languagesInit = new HashMap<String, Language>();
		
		Language english =  new Language("English", "eng" );

		
		english.getPrompts().put("create", "create");
		english.getPrompts().put("login", "login");
		english.getPrompts().put("language", "language");
		english.getPrompts().put("tellName", "Tell me your name: ");
		english.getPrompts().put("tellSurname", "Tell me your surname: ");
		english.getPrompts().put("tellAge", "Tell me your age:");
		
		
		languagesInit.put("english", english);
		
		
				
				
		
				
		/*languagesInit.put("catalan", new Language("Catalan", "cat", "crear", "logejar-se", "llengua", "sortir",
				"Diga'm el teu nom:", "Diga'm el teu cognom:", "Diga'm la teva edat:"));
		languagesInit.put("spanish", new Language("Spanish", "spa", "crear", "loguearse", "lengua", "salir",
				"Dime tu nombre:", "Dime tu apellido:", "Dime tu edad:"));
		languagesInit.put("russian", new Language("Russian", "rus", "создать", "войти", "язык", "выход",
				"Назовите ваше имя:", "Назовите вашу фамилию:", "Назовите ваш возраст:"));*/

		return languagesInit;
	}

}
