package languages;

import java.util.HashMap;

import model.Language;

public class SpanishLanguage {

	public static void init(HashMap<String, Language> languagesInit) {

		Language spanish = new Language("Spanish", "spa");
		
		spanish.getMessage().put("create", "crear");
		spanish.getMessage().put("login", "acceder");
		spanish.getMessage().put("language", "idioma");
		
		spanish.getMessage().put("quit", "salir");
		spanish.getMessage().put("tellName", "Dime tu nombre: ");
		spanish.getMessage().put("tellSurname", "Dime tu apellido: ");
		spanish.getMessage().put("tellAge", "Dime tu edad:");
		
		languagesInit.put("spanish", spanish);

	}

}
