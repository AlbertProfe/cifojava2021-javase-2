package personExample;

import java.util.ArrayList;

public class Person {

	// Fields from Person Class
	public String name;
	public int age;
	public int weigth;
	public int heigth;
	public double basicSalary;
	public ArrayList<Expense> expenses;

	// Constructor from Person Class
	public Person() {

	}

	public Person(String name, int age, int weigth, int heigth, double basicSalary) {

		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
		this.expenses = new ArrayList<Expense>();

	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
		this.expenses = new ArrayList<Expense>();
	}

	// Methods from Person Class
	public void becomeOlder() {
		this.age = age + 1;
	}

	public double yearNetSalary() {

		double yearNetSalary = 0.0;

		// first i must check weather THIS object have got money
		// this.basicSalary > 1
		if (this.basicSalary > 1) {

			yearNetSalary = this.basicSalary * 14;

			if (this.age > 30) {
				yearNetSalary = yearNetSalary * 0.88;
			} else {
				yearNetSalary = yearNetSalary * 0.94;
			}

		} else {
			System.out.println(name + " has not got any salary, so YearNetSalary not available!");
		}

		return yearNetSalary;
	}
	
	public double calculateExpenses (int month) {
		
		double expensesMonth = 0.0;
		
		for (Expense expense : this.expenses) {
			if (expense.getDate().getMonth() ==  month ) 
				expensesMonth = expensesMonth + expense.getValue();
		}		
		
		return expensesMonth;
	}
	
	// Getters and Setters and toString
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public ArrayList<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(ArrayList<Expense> expenses) {
		this.expenses = expenses;
	}

	// toString
	@Override
	public String toString() {
		return "Person Data Fields:\n  name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth
				+ ", basicSalary=" + basicSalary + "\n";
	}

}
