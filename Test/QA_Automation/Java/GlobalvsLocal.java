package Java;

public class GlobalvsLocal {
	
	int i = 25;
	static String name = "Random";
	
public static void main(String[] args) {
	   
       System.out.println(name);	   
	   GlobalvsLocal m = new GlobalvsLocal();
	   System.out.println(m.i);
	   
	}

 

}
