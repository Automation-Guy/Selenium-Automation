package Java;

public class Variables {
	
	int a = 20;
	
	private void method1(){
		int a=10;
		this.a=30;
		System.out.println("The value of a is: "+a);
	}
	
	private void method2(){
		System.out.println("The value of a is: "+ a);
	}

	public static void main(String[] args) {
		
		Variables var = new Variables();
		var.method1();
		var.method2();
		
	}
}
