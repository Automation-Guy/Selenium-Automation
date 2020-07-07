package Java;

public class OOPS1 {
	
	/* Abstraction
	 * Encapsulation
	 * Polymorphism
	 * Inheritence
	 */
	
	//class variables or Global variables
	int carModel;
	int carYear;
	
	
	public static void main(String[] args) {
		
		//new Keyword is used to create the object
		// new OOPS: is the object of the class
		//java is the object reference variable
		OOPS1 java = new OOPS1();
		java.carModel=1;
		java.carYear=2020;
		
		OOPS1 java1 = new OOPS1();
		java1.carModel=2;
		java1.carYear=2019;
		
		OOPS1 java2 = new OOPS1();
		java2.carModel=3;
		java2.carYear=2021;

		
		java = java1;
		java1 = java2;
		
		System.out.println(java.carModel);
		System.out.println(java.carYear);
		
		System.out.println(java1.carModel);
		System.out.println(java1.carYear);
		
		
	}
	
	
	
	

}
