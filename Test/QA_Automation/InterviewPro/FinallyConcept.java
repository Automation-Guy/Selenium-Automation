package InterviewPro;

public class FinallyConcept {
	
	public static void main(String[] args) {
	   //mthod();
		div();
	}
	
	
		public static void mthod() {
			try {
			System.out.println("Inside test method");
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Inside Catch Block");
		}finally {
			System.out.println("Inside Finally Block");
		}
	
		}
		
		
		public static void div() {
			try {
			int i = 10;	
			System.out.println("The division is: " + (i/0));
		    }catch (ArithmeticException e) {
				//e.printStackTrace();
				System.out.println("You can't divide the value by zero");
			}finally {
				System.out.println("Execute the code even after the failure");
			}
		}
}
