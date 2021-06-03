package management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.Expense;
import model.User;

public class ExpensesManagement {

	public static void createExpense(Scanner reader, User userValidated) {
		 
		String clean = reader.nextLine();
		//bug: select language options		
		System.out.println("\nEnter expense name: ");
		String expenseName = reader.nextLine();

		System.out.println("Enter expense value: ");
		double valueExpense = reader.nextDouble();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    Date todayDate = new Date();
	    
	    System.out.print("Today date is ");
	    System.out.println(dateFormat.format(todayDate));
	    //add new object Expense with name, value and date			
		userValidated.add(new Expense(expenseName, valueExpense, todayDate));

	}

	public static boolean deleteExpense(Scanner reader, User userValidated) {
		
		System.out.println("\nEnter expense name: ");
		String expenseName = reader.next();
		//Go through expenses array		
		for (Expense expense : userValidated.getExpenses()) {
			//if input equals an existing expense, delete it (through delete method)
			if (expenseName.equals(expense.getName())) {
				
				System.out.println(expense + " deleting ....\n");
				userValidated.delete(expense);
				System.out.println(expense + " deleted!");
				return true;
			}
		}
		//if input is not equal to an existing expense, return false.		
		System.out.println(expenseName + " not found ....\n");
		return false;

	}

	public static void updateExpense(Scanner reader, User userValidated) {
		//Find expense to be updated
		System.out.println("\nEnter expense name: ");
		String expenseName = reader.next();
		//Go through expenses array		
		int count = 0;
		for (Expense expense : userValidated.getExpenses()) {
			//if input equals an existing expense name, get it and ask if user wants to change its value or date
			//if user says yes (Y), set the object's value.			
			if (expenseName.equals(expense.getName())) {
				
				System.out.print("Expense value: " + expense.getValue());
				System.out.print(". Do you want to update expense value? (Y/N) ");
				String updateValueAnswer = reader.next();
				
				if (updateValueAnswer.equalsIgnoreCase("Y")) {
					System.out.println("Enter expense value: ");
					double valueExpense = reader.nextDouble();
					expense.setValue(valueExpense);
				}
				
				System.out.print("Expense date: " + expense.getDate());
				System.out.print(". Do you want to update expense date? (Y/N) ");
				String updateDateAnswer = reader.next();
				
				if (updateDateAnswer.equalsIgnoreCase("Y")) {
					System.out.println("Enter expense date (dd/MM/yyyy): ");
					String dateExpense = reader.next();
					
					Date dateToUpdate = expense.getDate();;
					try {
						dateToUpdate = new SimpleDateFormat("dd/MM/yyyy").parse(dateExpense);
					} catch (ParseException e) {
						System.out.print("Not updated! Invalid format!");
						e.printStackTrace();
					} 
					expense.setDate(dateToUpdate);
				}
					
				userValidated.update(count , expense);
				
				break;
			}
			
			count++;
		}
		// if input's not found in array, print "not found".		
		if (userValidated.getExpenses().size() == count) 
			System.out.println(expenseName + " not found ....\n");
	}

	public static void listExpense(Scanner reader, User userValidated) {
		//set a counter and print message		
		int position = 1;
		System.out.println("\nList of expenses: ");
		//go through expenses array, get each expense object and print them.		
		for (Expense expense : userValidated.getExpenses()) {

			System.out.println("#" + position + " " + expense);
			position++;
		}
	}

}
