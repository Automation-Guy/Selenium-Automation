package InterviewPro;

import java.util.Scanner;

public class Circle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius value for Circle Area: ");
		Double radius = sc.nextDouble();
		System.out.println(radius);
		//Area of Circle is = 3.14*radius(square)
		Double Area= Math.PI * (radius*radius);
		System.out.println("The Area of Circle is:  "+Area);
	}

}
