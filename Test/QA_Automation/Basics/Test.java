package Basics;

import java.util.HashSet;

public class Test {
	
	public static void main(String[] args) {
		String [] arry= {"dog","cat","dog","hourse","cat"};
		
		
		HashSet<String> has = new HashSet<String>();
		
		for(String s: arry){
			
			if(!has.add(s)){
				System.out.println(s);
				
			}
		}
	}

}
