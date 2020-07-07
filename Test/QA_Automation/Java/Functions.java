package Java;

public class Functions {
	
	public static void main(String[] args) {
		
		// new Functions() is the object and fn is the reference variable referring to this Object
		//this fn object can access all the non-static methods
		Functions fn = new Functions();
		
		fn.test();
		
		int val = fn.value();
		System.out.println(val);
		
		int e = fn.method(10, 2);
		System.out.println(e);
	}

	public void test() {
		System.out.println("Hello World");
	}
	
	public int value() {
		int a = 1;
		int b = 2;
		int c = a+b;
		
		return c;
	}
	
	public int method(int x, int y) {
		int d = x/y;
		
		return d;
	}
}
