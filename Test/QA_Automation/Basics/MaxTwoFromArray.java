package Basics;

public class MaxTwoFromArray {

	public static void topTwo(int[] numbers) {
		int max1 = 0;
		int max2 = 0;
		for (int number : numbers) {
		//	System.out.println(number);
			if (number > max1) {
			//	System.out.println(max1);
				
				max2 = max1;
				max1 = number;
			} else if (number > max2) {
				//System.out.println(max2);
				max2 = number;
				System.out.println(max2);
			}
		}
		System.out.println("First maximum number is : " + max1);
		System.out.println("Second maximum number is : " + max2);

	}
	
	public static void main(String[] args) {
		MaxTwoFromArray m=new MaxTwoFromArray();
		 int arr[] = {64, 34, 25, 12, 22, 11, 90};
		 m.topTwo(arr);
	}

}
