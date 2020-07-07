package Basics;

import java.util.Scanner;


public class DigitCountFromString {
	public static void main(String[] args) {
		
		String string= "";
		Scanner in = new Scanner(System.in);

		System.out.println("Plz enter 1st String");
		string = in.nextLine();
		char[] ch = string.toCharArray();
		int digit = 0;
		char c='k';
		char s='z';
	
		
		for(int i = 0; i < string.length(); i++){
			System.out.println("hi");
			if(!Character.isLetter(ch[i]=c) ){
			System.out.println("hello");
			if(Character.isDigit(ch[i])){
				
				digit ++ ;
			}
			}
	
			}
		System.out.println(digit);
	}

}
