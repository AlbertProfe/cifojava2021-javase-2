package Management;


import java.util.Scanner;
import model.Expense;
import model.User;

public class ExpensesManagement {
	

	public static void createExpense(Scanner reader, User userValidated) {
		
			System.out.println("\nEnter expense name: ");
			String expenseName = reader.next();

			System.out.println("Enter expense value: ");
			double valueExpense = reader.nextDouble();
			
		
			userValidated.add(new Expense (expenseName, valueExpense));
			
	}

	public static void deleteExpense(Scanner reader, User userValidated) {
		
		//to-do
	}

	public static void updateExpense(Scanner reader, User userValidated) {
		
		//to-do
	}

	public static void listExpense(Scanner reader, User userValidated) {
		
		for (Expense expense : userValidated.getExpenses()) {
			
			System.out.println(expense);
		}
	}

}
