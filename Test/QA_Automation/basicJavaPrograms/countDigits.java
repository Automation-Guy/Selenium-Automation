package basicJavaPrograms;

public class countDigits {
	
	public static void main(String[] args) {
		
		long num = 2;
		int count = 0;
		while(num!=0) {
			num = num/10;
			++count;
		}
		System.out.println("Number of digits is: "+ count);
	}

}
