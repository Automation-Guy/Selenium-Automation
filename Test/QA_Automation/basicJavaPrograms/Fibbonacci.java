package basicJavaPrograms;

import java.util.Scanner;

public class Fibbonacci {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, Enter the number for which you want the Fibbonacci Series: ");
		int num = sc.nextInt();
		
		int f1 = 0;
		int f2 = 1;
		int temp;
		
		for(int i=1; i<=num;i++) {
			
			System.out.println(f1);
			temp = f1 + f2;
			f1 = f2;
			f2 = temp;
			
		}
		
		
	}

}
