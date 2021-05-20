package languages;

import java.util.HashMap;

import model.Language;

public class RussianLanguage {
	
	

	public static void init(HashMap<String, Language> languagesInit) {
		
		Language russian = new Language ("Russian", "rus");
		
		russian.getMessage().put("create", "создать");
		russian.getMessage().put("login", "войти");
		russian.getMessage().put("language", "язык");
		russian.getMessage().put("quit", "выход");
		
		russian.getMessage().put("tellName", "Назовите ваше имя:");
		russian.getMessage().put("tellSurname", "Назовите вашу фамилию: ");
		russian.getMessage().put("tellAge", "Назовите ваш возраст:");
		
		languagesInit.put("russian", russian);	
		
	}
	

}
