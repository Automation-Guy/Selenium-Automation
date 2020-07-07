package basicJavaPrograms;


public class VowelorCosonent {

	public static void main(String[] args) {

    //Vowels: a,e,i,o,u
	
		char ch ='M';
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("The given alphabet is Vowel");
		}else {
			System.out.println("The given alphabet is Consonent");
		}
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch +" is Vowel");
			break;
			
		default:
			System.out.println(ch +" is Consonent");
			break;
		}

	}

}
