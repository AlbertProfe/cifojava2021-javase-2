package personExample;

import java.util.ArrayList;

public class TestPerson {

	//------ start ----------------------------------
	//it is function is to execute all the designed methods
	// test them etc ...
	// that is, to start the program and define
	// the tempo, the sequencing of executing
	public static void executePerson() {

		// createAndTestObjectsPerson();
		// testMethodsObjectsPerson();
		testListObjectsPerson();
	}

	//----- no lo se metodos -------
	public static void createAndTestObjectsPerson() {

		// i am going to create an object WITHOUT parameters,
		// that is, an empty object
		Person sergi = new Person();

		// an object with just a pair of parameters: name and age
		Person isa = new Person("Isabel", 18);

		// an object with all the parameters used
		Person toni = new Person("Antonio", 30, 80, 180, 2000);

		// sergi object, that is, tag "sergi" calls toString Method
		sergi.toString();

		// and now i am going to use toString to print this object
		System.out.println(sergi.toString());

		// this Eclipse IDE allows me to use object without toString
		System.out.println(toni);

		System.out.println(isa);

		sergi.setName("Sergi");
		sergi.setAge(20);
		sergi.setWeigth(60);
		sergi.setHeigth(180);
		sergi.setBasicSalary(2000);

		System.out.println(sergi);

		System.out.println("Sergi's age: " + sergi.getAge() + "\n");

		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 30 years old

		toni.becomeOlder();

		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 31 years old

	}

	public static void testMethodsObjectsPerson() {

		// test yearNetSalary() method

		Person alexa = new Person("Alexa", 25, 60, 180, 2500);

		System.out.println("Alexa year net Salary is: " + alexa.yearNetSalary());

		Person jack = new Person("Jackson Pollock", 25);

		System.out.println("Jack year net Salary is: " + jack.yearNetSalary());
	}

	private static void testListObjectsPerson() {
		
		//create a variable people that is a ArrayList and assign a new ArrayList which
		//points to Person
		ArrayList<Person> people = new ArrayList<Person>();
		
		//create three Person Objects
		//remember: i need three constructors!!!
		Person alexa = new Person("Alexa", 25, 60, 180, 2500); // 5 parameters: string, int, int, int, int
		Person jack = new Person("Jackson Pollock", 25); // 2 parameters, string, int
		Person marc = new Person(); // 0 parameters
		
		//we add the previous created objects to People ArrayList
		people.add(alexa);
		people.add(marc);
		people.add(jack);
		
		
		//What do?
		//print people
		//How it works?
		//call printPeople -static method- with parameter people
		//people is an ArrayList of Person objects
		printPeople(people);
		
		//System.out.println(people.toString());
		
	}
	
	
	//--------utils ------------------
	private static void printPeople (ArrayList<Person> arrayToPrint) {
		

			System.out.println("People:\n");

			for (Person personToPrint : arrayToPrint) {
				System.out.println(personToPrint);
			}
			System.out.println("\n");

		
	}

}
