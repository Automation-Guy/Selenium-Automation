package basicJavaPrograms;

import java.util.Scanner;

public class inputfromUser {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Number: ");
		int num = sc.nextInt();
		System.out.println("You have enter the number: "+ num);
	}

}
