package Basics;

import java.util.HashMap;
import java.util.Map;

public class RepeatOccurance {

	public static void main(String []args){
		int [] arraya={1,2,1,3,2,4,3,5};
		int [] arrayb={2,3,4,5};
		
		int sizea= arraya.length;
		int sizeb= arrayb.length;
		
		int length= sizea > sizeb ? sizea:sizeb;
		Map<Integer,Integer> map= new HashMap<Integer, Integer>();
		
		for(int i=0 ;i <length;i++){
			if(i<sizea){
				map.putIfAbsent(arraya[i], 0);
			//	System.out.println(map);
				map.put(arraya[i], map.get(arraya[i])+1);
			//	System.out.print(arraya[i]);
			
			}
			
			if(i<sizeb){
				map.putIfAbsent(arrayb[i], 0);
				map.put(arrayb[i], map.get(arrayb[i])+1);
			}
		
		}
		System.out.println(map);
		
	}
}
