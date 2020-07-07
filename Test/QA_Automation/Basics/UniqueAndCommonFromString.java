package Basics;

public class UniqueAndCommonFromString {
	
	public void m(String a, String b) {
		
		char c[]=a.toCharArray();
		char c1[]=b.toCharArray();
		
		for(int i=0;i<a.length();i++){
			
			for(int j=0;j<b.length();j++){
				if(c[i]==c1[j]){
					System.out.print(c[i]);
				}
				else if (c[i]!=c1[j]) {
					System.out.print(c[i]);
					System.out.println(c1[j]);
				}
				
			}
				
		}
		
		
		

	}
	public static void main(String[] args){
		
		UniqueAndCommonFromString s= new UniqueAndCommonFromString();
		s.m("abc", "bcd");
		
	}

	 

	//input string a - "abc"

	//input string b - "bcd"

	 

	//output common characters- ad

	//output unique characters - bc

}
