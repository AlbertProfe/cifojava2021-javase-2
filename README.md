# cifojava2021-javase-2
Java SE exercises: Objects, POO, to practise with objects and classes, that is:  uses, composition, inherence, etc

# Expenses Project

Welcome to the cifojava2021-javase-2 wiki Expenses PROJECT!

## Expenses Project v0.0

Just first and base-version of the project with the creation of user and only one package.

Classes:

expensesProject

* /expensesProject/src/expensesProject/**Init.java**
* /expensesProject/src/expensesProject/**MainController.java**
* /expensesProject/src/expensesProject/**Menu.java**
* /expensesProject/src/expensesProject/**User.java**
* /expensesProject/src/expensesProject/**UserCreation.java**


## Expenses Project v0.1

Creation of packages and language structure. Besides, we study next step, that is, login controller and the process of log in.

In this version we practice **static** concept at `createUser static method`.

/expensesProject0.1/src

controller

* /expensesProject0.1/src/controller/**LanguagesController.java**
* /expensesProject0.1/src/controller/**LoginController.java**
* /expensesProject0.1/src/controller/**MainController.java**
* /expensesProject0.1/src/controller/**MenuController.java**
* /expensesProject0.1/src/controller/**UserController.java**

expensesProject

* /expensesProject0.1/src/expensesProject/**Init.java**

model

* /expensesProject0.1/src/model/**Language.java**
* /expensesProject0.1/src/model/**User.java**

view

* /expensesProject0.1/src/view/**catalanMenu.java**
* /expensesProject0.1/src/view/**englishMenu.java**
* /expensesProject0.1/src/view/**russianMenu.java**
* /expensesProject0.1/src/view/**spanishMenu.java**

## Expenses Project v0.2

/expensesProject0.2/src

controller

* /expensesProject0.2/src/controller/**LanguagesController.java**
* /expensesProject0.2/src/controller/**LoginController.java**
* /expensesProject0.2/src/controller/**MainController.java**
* /expensesProject0.2/src/controller/**MenuController.java**
* /expensesProject0.2/src/controller/**UserController.java**

expensesProject

* /expensesProject0.2/src/expensesProject/**Init.java**

model

* /expensesProject0.2/src/model/**Language.java**
* /expensesProject0.2/src/model/**User.java**

view

* /expensesProject0.2/src/view/**catalanMenu.java**
* /expensesProject0.2/src/view/**englishMenu.java**
* /expensesProject0.2/src/view/**russianMenu.java**
* /expensesProject0.2/src/view/**spanishMenu.java**

`public static void AppStarting() {`

		`ArrayList<User> users = new ArrayList<User>();
		Scanner reader = new Scanner(System.in);
		
		//HashMap<String,Language> lenguages = new HashMap<String, Language>();

		Language english = new Language("English", "eng", "create", "login", "language", "quit");
		Language catalan = new Language("Catalan", "cat", "crear", "logejar-se", "llengua", "sortir");
		Language spanish = new Language("Spanish", "spa", "crear", "loguearse", "lengua", "salir");
		Language russian = new Language("Russian", "rus");

		Language lenguage = english;

		while (true) {

			MenuController.mainMenu(lenguage.getTag());

			String command = reader.nextLine();

			if (command.equals(lenguage.getQuit())) {
				break;

			} else if (command.equals(lenguage.getCreate())) {
				UserController.createUser(reader, users);

			} else if (command.equals(lenguage.getLogin())) {
				LoginController.validateUser();

			} else if (command.equals(lenguage.getLanguage())) {
				String langaugeToSelect = LanguagesController.languageSelection(reader, lenguage);
				if (langaugeToSelect.equals("english"))
					lenguage = english;
				if (langaugeToSelect.equals("catalan"))
					lenguage = catalan;
				if (langaugeToSelect.equals("spanish"))
					lenguage = spanish;
				if (langaugeToSelect.equals("russian"))
					lenguage = russian;

			} else {
				System.out.println(
						"\nPlease, you have to write \"create\", \"login\" or \"quit\". Try another time ...\n");
			}

		}

		reader.close();

	}`



## Expenses Project v0.3

We go deep on login just doing a nice draft of login and the need of a new package: utils.

/expensesProject0.3/src

controller

* /expensesProject0.3/src/controller/LanguagesController.java
* /expensesProject0.3/src/controller/LoginController.java
* /expensesProject0.3/src/controller/MainController.java
* /expensesProject0.3/src/controller/MenuController.java
* /expensesProject0.3/src/controller/UserController.java

expensesProject

* /expensesProject0.3/src/expensesProject/Init.java

menu

* /expensesProject0.3/src/menu/catalanMenu.java
* /expensesProject0.3/src/menu/englishMenu.java
* /expensesProject0.3/src/menu/russianMenu.java
* /expensesProject0.3/src/menu/spanishMenu.java

model

* /expensesProject0.3/src/model/Language.java
* /expensesProject0.3/src/model/User.java

utils

* /expensesProject0.3/src/utils/**RandomUtils.java**
* /expensesProject0.3/src/utils/**UserUtils.java**


## Expenses Project v0.4

Login class implemented and draft of Expenses

controller

* /expensesProject0.4/src/controller/**ExpensesController.java**
* /expensesProject0.4/src/controller/LanguagesController.java
* /expensesProject0.4/src/controller/LoginController.java
* /expensesProject0.4/src/controller/MainController.java
* /expensesProject0.4/src/controller/MenuController.java
* /expensesProject0.4/src/controller/UserController.java

expensesProject

* /expensesProject0.4/src/expensesProject/Init.java

Managment

* /expensesProject0.4/src/Managment/**ExpensesManagement.java**

menu

* /expensesProject0.4/src/menu/catalanMenu.java
* /expensesProject0.4/src/menu/englishMenu.java
* /expensesProject0.4/src/menu/russianMenu.java
* /expensesProject0.4/src/menu/spanishMenu.java

model

* /expensesProject0.4/src/model/**Expense.java**
* /expensesProject0.4/src/model/Language.java
* /expensesProject0.4/src/model/User.java

utils

* /expensesProject0.4/src/utils/RandomUtils.java
* /expensesProject0.4/src/utils/**UsersUtils.java**
* /expensesProject0.4/src/utils/UserUtils.java


`public static ArrayList<User> validateUser(Scanner reader, ArrayList<User> users) {
		
		int count = 1;
		String userConsole;
		String passwordConsole;
		System.out.println("\nWelcome Login to Expenses");

		do {

			System.out.println("\nEnter Username : ");
			userConsole = reader.next();

			System.out.println("Enter Password : ");
			passwordConsole = reader.next();

			if (validateUserAndPassword(userConsole, passwordConsole, users)) {
				System.out.println("Access Granted! Welcome!");
				return users;

			} else if (validateUser(userConsole, users)) {
				System.out.println("Invalid Password!");
			} else if (validatePassword(passwordConsole, users)) {
				System.out.println("Invalid Username!");
			} else {
				System.out.println("Invalid Username & Password!");
			}

			System.out.println("Total attempts: " + count + "/3");
			count++;

			if (count == 4)
				// to-do it is just a println
				//we need to set field isBlocked to false
				System.out.println("User blocked!");

		} while (count < 4);

		return users;
	}`

## Expenses Project v0.5

## Expenses Project v0.6

## Expenses Project v0.7

We create a HashMap in **languagesController**

`public static HashMap<String, Language> initLanguages()`

## Expenses Project v0.8

Improvements in Management class: we add **Date** to Expenses.

**createExpense**

`public static void createExpense(Scanner reader, User userValidated)`

`SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");`
`Date todayDate = new Date();`
	    
`System.out.print("Today date is ");`
`System.out.println(dateFormat.format(todayDate));`
			
`userValidated.add(new Expense(expenseName, valueExpense, todayDate));`

**updateExpense**

`public static void updateExpense(Scanner reader, User userValidated)`


				
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

And we create all languages classes with all the messages in a HashMap


## Expenses Project v0.9

Add the language package and **refactor** to:

* correct some variables names
* relocate some methods
* define future improvements
* close definition of v1.0
* arrange comments
* find some bugs




