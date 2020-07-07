package javaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	// can contain duplicate values
	// maintain order
	// Synchronized
	// allows random access to fetch any element cause store values in terms of index
	
	public static void main(String[] args) {
		
	
	ArrayList ar = new ArrayList();
	ar.add("Mike");
	ar.add(10);
	
	System.out.println(ar.size()); //size of an arrayList
	System.out.println(ar.get(0)); // get value of index
	
	//To print values of ArrayList
	//1. for Loop
	//2. Iterator
	
/*	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}*/
	
	//Generics and Non-generics
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(10);
	arr.add(20);
	arr.add(30);
	//System.out.println(arr.get(0));
	
	
	//Iterator: to traverse through the values
	Iterator<Integer> it = arr.iterator();
	while (it.hasNext()) {
		Integer val = it.next();
		System.out.println(val);
	}
	
	
	//addAll -- add all the elements of one list to another
	//removeAll -- remove all the elements
	//retainAll -- to get common element between two array
	}

}
