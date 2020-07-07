package InterviewPro;

public class finalizeConcept {
	
	//finalize is a method
	//finally is a block
	//final is a keyword
	
	public static void main(String[] args) {
		
		finalizeConcept f1 = new finalizeConcept();
		finalizeConcept f2 = new finalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
		
	}
	
	public void finalize() {
		System.out.println("Finalize Method");
	}

}
