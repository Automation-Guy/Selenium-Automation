package IMPrograms;

import groovy.lang.Singleton;

public class SingletonDesignConcept {
	
	//IN OOP, singleton class means--it will have only one object(instance of a class)
	/* How to design singleton class?
	 * - Make constructor private
	 * - write static method (getInstance()) which has return type object of singleton class (Lazy Initialization)
	 * 
	 * diff. between normal class and singleton class
	 * -For Normal class, we use constructor
	 * - For Singleton class, we use getInstance() method
	 */
	
	
	private static SingletonDesignConcept var = null;
	public String str;
	
	private SingletonDesignConcept() {
		str ="Welcome to Selenium";
	}
	
	public static SingletonDesignConcept getInstance() {
		if (var == null) 
			var = new SingletonDesignConcept();
			return var;
		
	}
	
	public static void main(String args[]) {
		
		SingletonDesignConcept x= SingletonDesignConcept.getInstance();
		SingletonDesignConcept y= SingletonDesignConcept.getInstance();
		SingletonDesignConcept z= SingletonDesignConcept.getInstance();
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		
		System.out.println(y.str);
		
		System.out.println(z.str);
	}

}
