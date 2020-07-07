package Java;

public class WrapperclassConcept {

	public static void main(String[] args) {
		// you cannot convert String to char with wrapper class

        String x = "100";
        int y = 20;
        
        //Data conversion from String to int
        int i = Integer.parseInt(x);
        System.out.println(i+y);
        
        //String to Double conversion
        String a = "12.33";
        double d = Double.parseDouble(a);
        System.out.println(d);
        
        String u = "110A";
        int f = Integer.parseInt(u);  //NumberFormat Exception
        System.out.println(f);

	}

}
