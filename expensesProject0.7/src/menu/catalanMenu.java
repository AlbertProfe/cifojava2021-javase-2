package menu;

public class catalanMenu {

	public static void mainMenu() {

		System.out.println("\nBenvingut a Prgramari de Desepeses");
		System.out.println("-------------------------\n");
		System.out.println("1-Crear usuari");
		System.out.println("2-Login a Despeses");
		System.out.println("3-Llengua");
		System.out.println("4-Sortir");
		System.out.print("Opció: ");

	}
	
	public static void loginMenu() {
	}

	public static void expensesMenu() {
		
		System.out.println("\nWelcome to Expenses Menu");
		System.out.println("-------------------------\n");
		System.out.println("1-Add expense");
		System.out.println("2-Delete expense");
		System.out.println("3-Update expenses");
		System.out.println("4-List expenses");
		System.out.println("5-Quit");
		System.out.print("Option: ");
	}

	public static void languagesMenu() {

		System.out.println("\nWelcome to Languages Menu");
		System.out.println("-------------------------\n");
		System.out.println("1-English");
		System.out.println("2-Catalan");
		System.out.println("3-Spanish");
		System.out.println("4-Russian");
		System.out.println("5-Quit");
		System.out.print("Option: ");
	}
}
