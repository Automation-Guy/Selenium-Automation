package javaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistJava {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Test");
		ll.add("QTP");
		ll.add("Selenium");
		
		System.out.println("LinkedList Values are: " +ll);
		
		ll.addFirst("Admin");
		ll.addLast("Automation");
		
		System.out.println("LinkedList Values are: " +ll);
		
		//get values
		System.out.println(ll.get(0));
		
		//set values
		System.out.println(ll.set(4, "Auto"));
		System.out.println(ll);
		
		//remove
		System.out.println(ll.remove(4));
		System.out.println(ll);
		
		//Iterate all the values or print the values of LinkedList
		for (String string : ll) {
			System.out.println("Using advance for loop: "+string);
			
		}
		
		//Using Iterator
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			String val = it.next();
			System.out.println("Iterator values are: "+val);

		}
	}

}
