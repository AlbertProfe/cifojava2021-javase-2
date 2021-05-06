package personExample;

public class Expense {
	
	public String name;
	public int value;
	public MyDate date;
	
	
	public Expense() {
	
	}

	public Expense(String name, int value, MyDate date) {
	
		this.name = name;
		this.value = value;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Expense [name=" + name + ", value=" + value + ", date=" + date + "]";
	}
	
	

}
