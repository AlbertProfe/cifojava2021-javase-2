package controller;

import java.util.HashMap;
import java.util.Scanner;

import model.Language;

public class LanguagesController {

	public static Language languageSelection(Scanner reader, Language language, 
			HashMap<String, Language> languages) {

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

		//we are declaring languagesInit of type hashMap and assign a new object HashMap
		HashMap<String, Language> languagesInit = new HashMap<String, Language>();
		
		//declare english object type Language class and assign the result
		//of operation NEW that creates a new object with parameters
		//name is "English" and tag is "eng"
		Language english =  new Language("English", "eng" );
		//now we are setting the object with the translations
		english.getMessage().put("create", "create");
		english.getMessage().put("login", "login");
		english.getMessage().put("language", "language");
		english.getMessage().put("quit", "quit");
		english.getMessage().put("tellName", "Tell me your name: ");
		english.getMessage().put("tellSurname", "Tell me your surname: ");
		english.getMessage().put("tellAge", "Tell me your age:");
		//use languageInit type HashMap to choose the language
		//call the method put of langugeInit
		languagesInit.put("english", english);
		
		
		Language spanish = new Language ("Spanish", "spa");
		spanish.getMessage().put("create", "crear");
		spanish.getMessage().put("login", "acceder");
		spanish.getMessage().put("language", "idioma");
		spanish.getMessage().put("quit", "salir");
		spanish.getMessage().put("tellName", "Dime tu nombre: ");
		spanish.getMessage().put("tellSurname", "Dime tu apellido: ");
		spanish.getMessage().put("tellAge", "Dime tu edad:");
		languagesInit.put("spanish", spanish);
		
		
		Language catalan = new Language ("Catalan", "cat");
		catalan.getMessage().put("create", "crear");
		catalan.getMessage().put("login", "accedir");
		catalan.getMessage().put("language", "idioma");
		catalan.getMessage().put("quit", "sortir");
		catalan.getMessage().put("tellName", "Diga'm el teu nom: ");
		catalan.getMessage().put("tellSurname", "Diga'm el teu cognom: ");
		catalan.getMessage().put("tellAge", "Diga'm la teva edat: ");
		languagesInit.put("catalan", catalan);
		
		Language russian = new Language ("Russian", "rus");
		russian.getMessage().put("create", "создать");
		russian.getMessage().put("login", "войти");
		russian.getMessage().put("language", "язык");
		russian.getMessage().put("quit", "выход");
		russian.getMessage().put("tellName", "Назовите ваше имя:");
		russian.getMessage().put("tellSurname", "Назовите вашу фамилию: ");
		russian.getMessage().put("tellAge", "Назовите ваш возраст:");
		languagesInit.put("russian", russian);		
		

		return languagesInit;
	}

}
