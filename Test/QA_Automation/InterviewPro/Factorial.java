package InterviewPro;

public class Factorial {
	
	/*Factorial: 2! =  2*1 = 2
	             1! = 1
	             0! = 1
	             3! = 3*2*1 = 6
	            */          		 
	public static void main(String[] args) {
		
	fact(5);
	
	//1. Without Recursive
	int num1 = 10;
	int fact1 = 1;
	
	for(int j=1;j<=num1;j++) {
		fact1 = fact1*j;	
	}
	System.out.println("Factorial of " + num1 + " is: " + fact1);
	}
	
	//2. With Recursive: means a function is calling itself

	public static void fact(int num) {
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			fact = fact*i;	
		}
		System.out.println("Factorial of " + num + " is: " + fact);
	}
	
}
