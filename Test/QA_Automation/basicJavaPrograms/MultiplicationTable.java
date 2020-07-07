package basicJavaPrograms;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Enter the number for which you want the Table: ");
		int num = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num + " x "+ i + " = " + (num*i));
		}
		
		
	}

}
