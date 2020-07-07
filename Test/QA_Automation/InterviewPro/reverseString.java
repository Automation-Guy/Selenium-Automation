package InterviewPro;

public class reverseString {
	
	
	
	/* 3 Ways to reverse a String
	 *   1. For loop
	 *   2. StringBuffer
	 *   3. recursion 
	 */

	
	public static void main(String[] args) {
	String str = "KRINA";
	String reverse = "";
	
	System.out.println(str.length());
		
	//For Loop
	for(int i=str.length()-1;i>=0;i--) {
		reverse = reverse+str.charAt(i);
	}
    System.out.println(reverse);	
}
}