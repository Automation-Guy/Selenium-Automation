package Java;

public class ExceptionHandling {
	
	public static void main(String[] args) throws InterruptedException, ArithmeticException {
		
		//Throwable is a super class of Error and Exception,so we cna use it to handle both of them in catch block
		//Object is a super class of all the classes like Throwable
		
		//difference between Throw and Throws 
		//throw -- we can create our won exception but we need to use try-catch block to handle it
		//throws -- used in the method signature(to declare the exception) simlar to try-catch block 
		
		//caught Exception
		//Thread.sleep(1000);
		
		//uncaught Exception
		/*try {
		int i = 10;
		System.out.println("The Division is: " + (i/0));
		}catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("You can't divide the number By Zero.");
		}*/
		
		//Throws
		ExceptionHandling exc = new ExceptionHandling();
		exc.sum();
		System.out.println("XYZ");
		
		//throw 
		try 
		{
			throw new Exception("Admin Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Admin");
	}
	
	public void sum() throws ArithmeticException{
		try {
			div();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void div() throws ArithmeticException{
		int a = 9/0;
	}

}
