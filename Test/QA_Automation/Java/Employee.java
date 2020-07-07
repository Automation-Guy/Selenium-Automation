package Java;

public class Employee {
	
	String name;
	int age;
 
	public Employee() {
		System.out.println("Calling Employee class constructor");
		this.name = "Martin";
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
	}

}
