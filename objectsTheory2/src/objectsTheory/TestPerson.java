package objectsTheory;

public class TestPerson {

	public static void main(String[] args) {

		
		Person isa = new Person("Isabel");
		
		changeReference(isa);
		
		modifyReference(isa);
	}

	public static void changeReference(Person objectPersonToChange) {
		
		Person borja = new Person("Borja");
		
		//Person borja = null;
		objectPersonToChange = borja;
	}

	public static void modifyReference(Person objectPersonToModify) {
		objectPersonToModify.setName("Sergii");
	}

}
