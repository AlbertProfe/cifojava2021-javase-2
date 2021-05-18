package model;

import java.util.Date;

public class Expense {

	public String name;
	public double value;
	public Date date;

	public Expense(String name, double value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Expense [name=" + name + ", value=" + value + ", date=" + date + "]";
	}

	

}
