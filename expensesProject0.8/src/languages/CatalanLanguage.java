package languages;

import java.util.HashMap;

import model.Language;

public class CatalanLanguage {

	public static void init(HashMap<String, Language> languagesInit) {
		
		Language catalan = new Language("Catalan", "cat");
		
		catalan.getMessage().put("create", "crear");
		catalan.getMessage().put("login", "accedir");
		catalan.getMessage().put("language", "idioma");
		catalan.getMessage().put("quit", "sortir");
		
		catalan.getMessage().put("tellName", "Diga'm el teu nom: ");
		catalan.getMessage().put("tellSurname", "Diga'm el teu cognom: ");
		catalan.getMessage().put("tellAge", "Diga'm la teva edat: ");
		
		
		
		languagesInit.put("catalan", catalan);

	}

}
