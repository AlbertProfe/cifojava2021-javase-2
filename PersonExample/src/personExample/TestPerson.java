package personExample;

public class TestPerson {

	public static void executePerson() {

		createAndTestObjectsPerson();

	}

	public static void createAndTestObjectsPerson() {

		// i am going to create an object WITHOUT parameters, that is a empty object
		Person sergi = new Person();
		
		Person isa = new Person ("Isabel", 18);
		
		Person toni = new Person ("Antonio", 30, 80, 180, 2000);
		
		
		//sergi object, that is, tag "sergi" calls toString Method
		sergi.toString();
		
		// and now i am going to use toString to print this object
		System.out.println(sergi.toString());
		
		//this Eclipse IDE allows me to use object without toString
		System.out.println(toni);
		
		System.out.println(isa);
		
		
	}

}
