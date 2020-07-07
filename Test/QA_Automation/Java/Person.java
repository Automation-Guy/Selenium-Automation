package Java;

public class Person {

		String name;
	 
		public Person() {
			System.out.println("Calling Person constructor");
			name = "Default";
			System.out.println(name);
		}
	
public static void main(String[] args) {
	
	Person p = new Person();
}
}
