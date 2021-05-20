
package languages;

import java.util.HashMap;
import model.Language;

public class RussianLanguage {
	
	public static void init(HashMap<String, Language> languagesInit) {
		
		Language russian = new Language("Russian", "rus");
		// I declare russian object type Language class and assign the result
		// of operation NEW that creates a new object with parameters
		// name is "Russian" and tag is "rus"
		// now we are setting the object with the translations
		russian.getMessage().put("create", "создать");
		russian.getMessage().put("login", "логин");
		russian.getMessage().put("language", "язык");
		russian.getMessage().put("quit", "выйти");
		
		russian.getMessage().put("tellName", "Назови свое имя:");
		russian.getMessage().put("tellSurname", "Назови свою фамилию:");
		russian.getMessage().put("tellAge", "Назови свой возраст:");
		
		russian.getMessage().put("english", "английский");
		russian.getMessage().put("spanish", "испанский");
		russian.getMessage().put("catalan", "каталонский");
		russian.getMessage().put("russian", "русский");
		
		russian.getMessage().put("badinputMain",
				"\nПожалуйста, вы должны написать \"создать\", \"войти\" или \"выйти\".");
		russian.getMessage().put("tryAnother", "Попробуйте в другой раз... \n");
		russian.getMessage().put("expensesWelcome", "\nДобро пожаловать в раздел расходов");
		russian.getMessage().put("tellUserName", "Назовите свое имя пользователя:");
		russian.getMessage().put("tellPassword", "Назовите свой пароль:");
		
		russian.getMessage().put("accesOK", "Доступ разрешен! Добро пожаловать!");
		russian.getMessage().put("badPassword", "Неверный пароль!");
		russian.getMessage().put("badUserName", "Неверное имя пользователя!");
		russian.getMessage().put("badPasswordAndUserName", "Неверное имя пользователя и пароль!");
		russian.getMessage().put("attempts", "Всего попыток:");
		russian.getMessage().put("block", "Пользователь заблокирован!");
		
		russian.getMessage().put("add", "добавить");
		russian.getMessage().put("delete", "удалить");
		russian.getMessage().put("update", "обновить");
		russian.getMessage().put("list", "список");
		
		russian.getMessage().put("badinputExpenses",
				"\nПожалуйста, вы должны написать \"добавить\", \"удалить\", \"обновить\", \"список\" or \"выйти\".");
		russian.getMessage().put("expenseName", "\nВведите название расхода: ");
		russian.getMessage().put("expenseValue", "Введите сумму расхода: ");
		russian.getMessage().put("deleting", "удаление ....");
		russian.getMessage().put("deleted", "удалено!");
		russian.getMessage().put("notFound", "не найдено ....\n");
		russian.getMessage().put("list", "\nСписок расходов: ");
		russian.getMessage().put("todayDate", "Сегодняшняя дата : ");
		
		russian.getMessage().put("showExpenseName", "Сумма расхода: ");
		russian.getMessage().put("questionUpdateValue", ". Хотите обновить сумму расхода? (Y/N) ");
		russian.getMessage().put("showExpenseDate", "Дата расхода: ");
		russian.getMessage().put("questionUpdateDate", ". Хотите обновить дату расхода? (Y/N) ");
		russian.getMessage().put("expenseDate", "Введите дату расхода (dd/MM/yyyy): ");
		russian.getMessage().put("invalidFormat", "Не обновлено! Неверный формат!");
		
		// use languageInit type HashMap to choose the language
		// call the method put of langugeInit
		languagesInit.put("russian", russian);
	}
}