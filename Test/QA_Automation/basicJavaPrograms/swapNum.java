package basicJavaPrograms;

public class swapNum {

	public static void main(String[] args) {
		
		// with temp variable
		int a = 5;
		int b = 6;
		int temp = a;
		
		/*System.out.println("value of a is before Swapping: "+ a);
		System.out.println("value of b is before Swapping: "+ b);
		
		a = b;
		b = temp;
		
		System.out.println("value of a is After Swapping: "+ a);
		System.out.println("value of b is After Swapping: "+ b);

		
		//without temp variable
		
		System.out.println("value of a is before Swapping: "+ a);
		System.out.println("value of b is before Swapping: "+ b);
		
		a = a-b; // 5-6=-1
		b = a+b; // -1+6=5
		a = b-a; // 5+1=6
		
		System.out.println("value of a is After Swapping: "+ a);
		System.out.println("value of b is After Swapping: "+ b);*/
		
		a = a^b;
		b = a^b;
		a = b^a;
		
		System.out.println(a);
		System.out.println(b);
	}

}
