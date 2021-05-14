package model;

public class User {

	public String name;
	public String surname;
	public int age;
	public String email;
	public String userName;
	public String password;
	public static int countUsers = 0;
	public static String typeUser = "Standard";
	

	
	
	public static String getTypeUser() {
		return typeUser;
	}

	public static void setTypeUser(String typeUser) {
		User.typeUser = typeUser;
	}

	public static int getCountUsers() {
		return countUsers;
	}

	public static void setCountUsers(int countUsers) {
		User.countUsers = countUsers;
	}
	
	

	public User(String name, String surname, int age, String email, String userName, String password) {
		super();
		countUsers++;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}

	public User(String name, String surname, int age, String userName, String password) {
		super();
		countUsers++;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		countUsers++;
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", age=" + age + ", email=" + email + ", userName="
				+ userName + ", password=" + password + "]";
	}

}
