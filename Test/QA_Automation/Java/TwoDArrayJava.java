package Java;

public class TwoDArrayJava {
	
	public static void main(String[] args) {
		
		int [][] data = new int[3][3];
		data[0][0]=100;
		data[0][1]=200;
		data[0][2]=300;
		
		data[1][0]=400;
		data[1][1]=500;
		data[1][2]=600;
		
		data[2][0]=700;
		data[2][1]=800;
		data[2][2]=900;
		
		System.out.println(data[2][2]);
		
		// first for loop: run once and then second loop will run for whole length of all columns
		//exa...for first row i=0 it will run for 0 to 2 (0,1,2) times and then again for i=1 till 0,1,2 etc.
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++) {
				System.out.print(data[i][j]);
			}
		}
	}

}
