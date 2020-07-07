package Java;

public class ConstructorConcept {
	
	//Default Constructor
	public ConstructorConcept() {
		System.out.println("Welcome to the Constructor World");
	}
	
	//Parameterized Constructor
	public ConstructorConcept(int a, int b) {
		System.out.println("Welcome to the Parameterized Constructor World");
		System.out.println("The values of given number is: " + (a+b));
	}
	
	
	public static void main(String[] args) throws Throwable {
		ConstructorConcept c = new ConstructorConcept();
		ConstructorConcept c1 = new ConstructorConcept(4,5);
		c.finalize();
		System.out.println("This is Main Method");
	}

}
