package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateinArrayHASHSET {

	public static void main(String[] args) {
		int[] inputarr= {2,5,6,7,8,9,10,4,9,0,3,4};
		FindDuplicateinArrayHASHSET.usingset(inputarr);
		//using sorting method
		

	}
	
	private static void usingset(int[] arr) {
		Set<Integer> hs=new HashSet<Integer>();
		for(int x:arr)
		{
				if(!hs.add(x))
				{
					System.out.println("Duplicate element is: "+x);
				}
			
		}
	}
	


}
