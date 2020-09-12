package IMPrograms;

public class MainMethodOverloading {

	//JVM search for main method pattern(String[] args)
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		main(10);
		main(10, 20);
	}
	
	public static void main(int a) {
		System.out.println("Main method with one variable: " + a);
	}
	
	public static void main(int a, int b) {
		System.out.println("Main method with multi. params: " +(a+b));
	}
}
