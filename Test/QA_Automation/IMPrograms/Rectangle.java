package IMPrograms;

import java.util.Scanner;

public class Rectangle {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length for Rectangle: ");
		Double length = sc.nextDouble();
		
		System.out.println("Enter the width for Rectangle: ");
		Double width = sc.nextDouble();
		
		//Area of Rectangle
		Double Area = length*width;
		System.out.println("Area of Rectangle for given value is: " + Area);
		
	}

}
