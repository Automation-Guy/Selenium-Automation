package Basics;

import java.util.Scanner;

public class StringPalindrom {
	
	public static void main(String[] args){
		String original,reverse="";
		Scanner in= new Scanner(System.in);
		
		System.out.println("Plz enter String");
		original=in.nextLine();
		
		for(int i=original.length()-1;i >=0; i--){
			
			reverse=reverse+original.charAt(i);
			
			
		}
		
		if(original.equals(reverse)){
			System.out.println("palindorm");
		}
		else
		{
			System.out.println("Not");
		}
	}
	
	//2nd way
	 public static void checkPalindrome(String s)
	  {
	    // reverse the given String
	    String reverse = new StringBuffer(s).reverse().toString();
	 
	    // check whether the string is palindrome or not
	    if (s.equals(reverse))
	      System.out.println("Yes");
	 
	    else
	      System.out.println("No");
	  }

}
