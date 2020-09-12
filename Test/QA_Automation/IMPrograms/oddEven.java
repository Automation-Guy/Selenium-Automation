package IMPrograms;

import java.util.Scanner;

public class oddEven {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		
		int num = sc.nextInt();
		System.out.println(num);
		
		if(num % 2 == 0) {
			System.out.println("The Given number is Even");
		}else {
			System.out.println("The Given number is Odd");
		}
	}

}
