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

		catalan.getMessage().put("badinputMain", "\nSiusplau, introdueix \"crear\", \"accedir\" o \"sortir\".");
		catalan.getMessage().put("tryAnother", "Torna-ho a intentar ...\n");
		catalan.getMessage().put("expensesWelcome", "\n Benvingut/da a Despeses");
		catalan.getMessage().put("tellUserName", "Introdueix el teu nom d'usuari: ");
		catalan.getMessage().put("tellPassword", "Introdueix la teva contrassenya: ");

		catalan.getMessage().put("accesOK", "Acces concedit! Benvingut/da!");
		catalan.getMessage().put("badPassword", "Contrassenya no valida!");
		catalan.getMessage().put("badUserName", "Nom d'usuari no valid");
		catalan.getMessage().put("badPasswordAndUserName", "Nom d'usuari i contrassenya no valids!");
		catalan.getMessage().put("attempts", "Total d'intents: ");
		catalan.getMessage().put("block", "Usari bloquejat!");

		catalan.getMessage().put("add", "afeigr");
		catalan.getMessage().put("delete", "esborrar");
		catalan.getMessage().put("update", "actualitzar");
		catalan.getMessage().put("list", "llistar");
		catalan.getMessage().put("badinputExpenses",
				"\nSiusplau, introdueix \"afegir\", \"esborrar\", \"actualitzar\", \"llistar\" or \"sortir\".");

		catalan.getMessage().put("expenseName", "\nIntrodueix el nom de la despesa: ");
		catalan.getMessage().put("expenseValue", "Introdueix el valor de la despesa: ");
		catalan.getMessage().put("deleting", "esborrant ....");
		catalan.getMessage().put("deleted", "esborrat!");
		catalan.getMessage().put("notFound", "no s'ha pogut trobar ....\n");
		catalan.getMessage().put("delete", "esborra");
		catalan.getMessage().put("update", "actualitza");
		catalan.getMessage().put("list", "llista");
		catalan.getMessage().put("list", "\nLlista de despeses: ");
		catalan.getMessage().put("todayDate", "La data d'avui es : ");

		catalan.getMessage().put("showExpenseName", "Valor de la despesa: ");
		catalan.getMessage().put("questionUpdateValue", ". Vols actualitzar el valor de la despesa? (Y/N) ");
		catalan.getMessage().put("showExpenseDate", "Data de la despesa: ");
		catalan.getMessage().put("questionUpdateDate", ". Vols actualitzar la data de la despesa? (Y/N) ");
		catalan.getMessage().put("expenseDate", "Introdueix la data de la despesa (dd/MM/yyyy): ");
		catalan.getMessage().put("invalidFormat", "No actualitzat! Format no valid!");

		// use languageInit type HashMap to choose the language
		// call the method put of langugeInit
		languagesInit.put("catalan", catalan);
	}
}
