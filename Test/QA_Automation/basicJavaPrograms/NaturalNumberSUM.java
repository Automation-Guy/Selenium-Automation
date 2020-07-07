package basicJavaPrograms;

public class NaturalNumberSUM {

	public static void main(String[] args) {
		
		//1+2+3+...100 = 5050
		
		int num = 100;
		int sum = 0;
		
		for(int i =1; i<=num;i++)
			sum = sum+i;
		    System.out.println(sum);

	}

}
