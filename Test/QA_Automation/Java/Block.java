package Java;

public class Block {
	
	public Block() {
		System.out.println("Hello World");
	}
	
	{
		System.out.println("Inside Ananymous Block");
	}

	 static  {
		System.out.println("Inside Static Block");
	}
	 
	 public static void main(String[] args) {
		
		 Block b = new Block();
		 
		 System.out.println("*********************");
		 
		 Block b1 = new Block();
		 
	}
}
