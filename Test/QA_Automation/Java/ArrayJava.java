package Java;

public class ArrayJava {

	public static void main(String[] args) {
		
		//index start from 0(Lower Bound) till n-1(Upper Bound)
		//1D Array
		int[] a = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;

		System.out.println(a[2]);
		System.out.println(a.length);  // size or length of an array
		
		for(int j =0;j<a.length;j++) {
			System.out.println(a[j]);
		}
	

	/*DisAdvantages: Size is fixed -- To overcome this, we use collections (List, Set, HashMap)
	               same datatypes only -- To overcome this, we use Object array
	*/
	
		//Object array -- Used to store different dataType values
		Object[] obj = new Object[3];
		obj[0]="Hello";
		obj[1]=50;
		obj[2]=10.20;
		
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj.length);
	}
}
