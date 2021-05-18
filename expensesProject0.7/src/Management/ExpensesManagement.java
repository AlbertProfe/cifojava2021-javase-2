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

		userValidated.add(new Expense(expenseName, valueExpense));

	}

	public static boolean deleteExpense(Scanner reader, User userValidated) {
		
		System.out.println("\nEnter expense name: ");
		String expenseName = reader.next();
		
		for (Expense expense : userValidated.getExpenses()) {

			if (expenseName.equals(expense.getName())) {
				System.out.println(expense + " deleting ....\n");
				
				userValidated.delete(expense);
				System.out.println(expense + " deleted!");
				return true;
			}
		}
		
		System.out.println(expenseName + " not found ....\n");
		return false;

	}

	public static void updateExpense(Scanner reader, User userValidated) {

		System.out.println("\nEnter expense name: ");
		String expenseName = reader.next();
		
		int count = 0;
		for (Expense expense : userValidated.getExpenses()) {

			if (expenseName.equals(expense.getName())) {
				
				System.out.println("Enter expense value: ");
				double valueExpense = reader.nextDouble();
				
				expense.setValue(valueExpense);
				
				userValidated.update(count , expense);
				
				break;
			}
			
			count++;
		}
		
		System.out.println(expenseName + " not found ....\n");
	}

	public static void listExpense(Scanner reader, User userValidated) {

		for (Expense expense : userValidated.getExpenses()) {

			System.out.println(expense);
		}
	}

}
