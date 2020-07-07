package Java;

public class MethodOverloading {
	
	//Method with same name but different Parameters
    // we can't create method inside a method
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.sum();
		m.sum(15, 15);
		
	}
	
	public void sum() {
		System.out.println("This is the SUM Method");
	}
	
	public void sum(int x, int y) {
		System.out.println("The sum is: " + (x+y));
	}

}
