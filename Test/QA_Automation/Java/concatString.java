package Java;

public class concatString {
	
	public static void main(String[] args) {
		
	
	String a = "Hello";
	String b = "World";
	
	int c = 10;
	int d = 20;
	
    System.out.println(a+b);
    System.out.println(c+d);
    
    System.out.println(a+b+c+d);
    System.out.println(c+d+a+b);
    
    System.out.println(a+b+(c+d));
    
    System.out.println(a+c+b+d);
	
	}
}
