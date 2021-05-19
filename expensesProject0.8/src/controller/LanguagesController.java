package controller;

import java.util.HashMap;
import java.util.Scanner;

import languages.CatalanLanguage;
import languages.EnglishLanguage;
import languages.RussianLanguage;
import languages.SpanishLanguage;
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

		// pending to-do while with all the OPTION v2.0 ....
	}

	public static HashMap<String, Language> initLanguages() {

		// we are declaring languagesInit of type hashMap and assigning a new object
		// HashMap of String and Language object
		HashMap<String, Language> languagesInit = new HashMap<String, Language>();

		EnglishLanguage.init(languagesInit);

		CatalanLanguage.init(languagesInit);

		RussianLanguage.init(languagesInit);

		SpanishLanguage.init(languagesInit);

		return languagesInit;
	}

}
