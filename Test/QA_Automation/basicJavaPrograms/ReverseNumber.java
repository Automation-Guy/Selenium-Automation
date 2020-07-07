package basicJavaPrograms;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num = 1234; //output should be: 4321
		int rev = 0;
		
		while (num != 0) {
			int n = num % 10;
			//System.out.println(n);
			rev = rev * 10 + n;
			//System.out.println(rev);
			num = num/10;
			//System.out.println(num);
		}
		
		System.out.println(rev);
	}

}
