package basicJavaPrograms;

import java.util.Scanner;

public class PositiveNnegative {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number here: ");
		double num = sc.nextDouble();
		
		if(num < 0.0)
			System.out.println("The Given Number is Negative Number");
		else if(num > 0.0)
			System.out.println("The Given Number is Positive Number");
		else 
			System.out.println("The Number is Zero");
	}

}
