package Java;

public class staticNnostatic {
	
	String name = "admin";  // Non-static Global variable
	static int age = 25;    // static Global variable

	public static void main(String[] args) {
		
		//we can call directly
		sum();
		// or we call with class name
		staticNnostatic.sum();
		
		System.out.println(age);
		System.out.println(staticNnostatic.age);
		
		// non-static method we can call it using object creation
		staticNnostatic s = new staticNnostatic();
		s.sendmail();
		System.out.println(s.name);
	}
	
	public void sendmail() {
		
		System.out.println("Email Sent..!!");
	}
	
	public static void sum() {
		System.out.println("Hello World");
	}
}
