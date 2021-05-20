package languages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import management.ExpensesManagement;
import model.Expense;
import model.Language;
import model.User;

public class EnglishLanguage {

	public static void init(HashMap<String, Language> languagesInit) {
		
		
		// I declare english object type Language class and assign the result
		// of operation NEW that creates a new object with parameters
		// name is "English" and tag is "eng"
		Language english = new Language("English", "eng");
		
		// now we are setting the object with the translations
		english.getMessage().put("create", "create");
		english.getMessage().put("login", "login");
		english.getMessage().put("language", "language");
		english.getMessage().put("quit", "quit");
	
		english.getMessage().put("tellName", "Tell me your name: ");
		english.getMessage().put("tellSurname", "Tell me your surname: ");
		english.getMessage().put("tellAge", "Tell me your age:");
		
		english.getMessage().put("english", "english");
		english.getMessage().put("spanish", "spanish");
		english.getMessage().put("catalan", "catalan");
		english.getMessage().put("russian", "russian");
		
		english.getMessage().put("badinputMain", "\nPlease, you have to write \"create\", \"login\" or \"quit\".");
		english.getMessage().put("tryAnother", "Try another time ...\n");
		english.getMessage().put("expensesWelcome", "\nWelcome Login to Expenses");
		english.getMessage().put("tellUserName", "Tell me your userName: ");
		english.getMessage().put("tellPassword", "Tell me your password: ");
		
		english.getMessage().put("accesOK", "Access Granted! Welcome!");
		english.getMessage().put("badPassword", "Invalid Password!");
		english.getMessage().put("badUserName", "Invalid Username!");
		english.getMessage().put("badPasswordAndUserName", "Invalid Username & Password!");
		english.getMessage().put("attempts", "Total attempts: ");
		english.getMessage().put("block", "User blocked!");
		
		english.getMessage().put("add", "add");
		english.getMessage().put("delete", "delete");
		english.getMessage().put("update", "update");
		english.getMessage().put("list", "list");
		english.getMessage().put("badinputExpenses", "\nPlease, you have to write \"add\", \"delete\", \"upadate\", \"list\" or \"quit\".");
		
		english.getMessage().put("expenseName", "\nEnter expense name: ");
		english.getMessage().put("expenseValue", "Enter expense value: ");
		english.getMessage().put("deleting", "deleting ....");
		english.getMessage().put("deleted", "deleted!");
		english.getMessage().put("notFound", "not found ....\n");
		english.getMessage().put("delete", "delete");
		english.getMessage().put("update", "update");
		english.getMessage().put("list", "list");
		english.getMessage().put("list", "\nList of expenses: ");
		english.getMessage().put("todayDate", "Today date is : ");
		
		english.getMessage().put("showExpenseName", "Expense value: ");
		english.getMessage().put("questionUpdateValue", ". Do you want to update expense value? (Y/N) ");
		english.getMessage().put("showExpenseDate", "Expense date: ");
		english.getMessage().put("questionUpdateDate", ". Do you want to update expense date? (Y/N) ");
		english.getMessage().put("expenseDate", "Enter expense date (dd/MM/yyyy): ");
		english.getMessage().put("invalidFormat", "Not updated! Invalid format!");
		
		
		
		// use languageInit type HashMap to choose the language
		// call the method put of langugeInit
		languagesInit.put("english", english);
	}

}
