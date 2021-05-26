package objectsTheory;

public class TestPerson {
	
	//call method type main that does not return anything
	public static void main(String[] args) {

		// I declare the isa variable of type Person and assign it to the new person
		// object that sends (isabel)
		Person isa = new Person("Isabel");
		//1. Is Calling a method operation changeReference();
		//2. Sending an Person object call "isa" for operation or evaluation.
		//3. The method is written as changeReference(isa);
		changeReference(isa);
		//Porque? usamos método modifyReference() para modificar objeto;
		//Con qué? con objeto isa de tipo User;
		//Cómo?  modifyReference(isa)
		modifyReference(isa);
	}

	// we declare a static and non-return public method that we name changeReference
	// and we declare object of type Person named objectPersonToChange (an argument
	// for the method)
	public static void changeReference(Person objectPersonToChange) {
		// I declare the borja variable which is of type Person and assign the value new
		// Peron ("Borja")
		Person borja = new Person("Borja");
		//In the modifyReference method, which receives a Person Object as a parameter, we call that parameter, 
		//and lift the setName () method, previously defined in the Person class, and in the setName () method parameter 
		//we introduce the String to which we want to change
		objectPersonToChange = borja;
	}

	// Create static method called “modifyReference”,sending “Person
	// objectPersonToModify” as parameter, in order to modify the sent objects.
	public static void modifyReference(Person objectPersonToModify) {

		objectPersonToModify.setName("Sergii");
	}

}
