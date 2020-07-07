package Basics;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Pls enter string");
		
		String word=in.nextLine();
		
		char[] arr= word.toCharArray();
		int count=0;
		
		for(int i= arr.length-1;i >=0;i--){
			System.out.print(arr[i]);
			count++;
		}
		
	System.out.println(count);
	}

}
