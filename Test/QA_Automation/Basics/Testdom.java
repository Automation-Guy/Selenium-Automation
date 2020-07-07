package Basics;

public class Testdom {

	public static class TextInput{
		String s;
		public void add(char c){
			s=s+c;
		}
		public String getValue(){
			return s;
		}
	}
	public static class NumericInput extends TextInput{
		public void add(){
			super.add('s');
			
		};
		
	}
	
	
}
