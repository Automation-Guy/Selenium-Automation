package basicJavaPrograms;

public class largestAmong3Nums {
	
	public static void main(String[] args) {
		
		int x = 1000;
		int y = 200;
		int z = 1000;
		
		if(x>y && x>z) {
			System.out.println("x is Greatest Number");
		}else if(y>x && y>z) {
			System.out.println("y is Greatest Number");
		}else if(z>x && z>y) {
			System.out.println("z is Greatest Number");
		}else {
			System.out.println("All the Number are Equal");
		}
	}

}
