package javaBasics;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateinArrayUsingHASHMAP {
	
	public static void main(String[] args) {
		int[] inputarr= {2,5,6,7,8,9,10,4,9,0,3,4};
		FindDuplicateinArrayUsingHASHMAP.UsingHashmap(inputarr);
		//using sorting method
		

	}
	
	private static void UsingHashmap(int[] arr) {
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int x:arr)
		{
				if(!hm.containsKey(x))
				{
					hm.put(x,1);
				} else {
					hm.put(x,hm.get(x)+1);
				}
		}
		for(int x: hm.keySet())
		{
				if(hm.get(x)>1)
				{System.out.println("Duplicate element is: "+x);
				}
		}
	}
	


}
