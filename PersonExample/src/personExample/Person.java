package personExample;

public class Person {

	//fields from Person Class
	public String name;
	public int age;
	public int weigth;
	public int heigth;
	public double basicSalary;
	
	//Constructor from Person Class
	public Person() {
		
	}

	public Person(String name, int age, int weigth, int heigth, double basicSalary) {
		
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.heigth = heigth;
		this.basicSalary = basicSalary;
	}

	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	//Methods from Person Class
	
	public void becomeOlder () {
		
		this.age = age + 1;
	}
	
	
	//Getters and Setters and toString	
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
	
	//toString
	@Override
	public String toString() {
		return "Person Fields: (name=" + name + ", age=" + age + ", weigth=" + weigth + ", heigth=" + heigth + ", basicSalary="
				+ basicSalary + ")";
	}
	
	
	
	
	
	
}
