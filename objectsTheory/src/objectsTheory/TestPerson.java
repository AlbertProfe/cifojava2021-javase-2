package objectsTheory;

public class TestPerson {

	// call method type main that does not return anything
	public static void main(String[] args) {

		// I declare the isa variable of type Person and assign it to the new person
		// object that sends (isabel)
		Person isa = new Person("Isabel");
		// Is Calling a method operation changeReference();
		// Sending an Person object call "isa" for operation or evaluation.
		// The method is written as changeReference(isa);
		changeReference(isa);
		// we use modifyReference () method to modify object;
		// with isa object of type User;
		// to modifyReference (isa)
		modifyReference(isa);
	}

	// we declare a static and non-return public method that we name changeReference
	// and we declare object of type Person named objectPersonToChange (an argument
	// for the method)
	public static void changeReference(Person objectPersonToChange) {
		
		// I declare the borja variable which is of type Person and assign the value new
		// Peron ("Borja")
		Person borja = new Person("Borja");
		// In the modifyReference method, which receives a Person Object as a parameter,
		// we call that parameter,
		// and lift the setName () method, previously defined in the Person class, and
		// in the setName () method parameter
		// we introduce the String to which we want to change
		objectPersonToChange = borja;
	}

	// Create static method called “modifyReference”,sending “Person
	// objectPersonToModify” as parameter, in order to modify the sent objects.
	public static void modifyReference(Person objectPersonToModify) {

		//we get object objectPersonToModify and set its Name attribute to "Sergii" trough method setName
		//objectPersonToModify is a reference-variable which points to object isa (which points to object new Person())
		//that executes its method setName a change its value to  "Sergii"
		objectPersonToModify.setName("Sergii");
	}

}
