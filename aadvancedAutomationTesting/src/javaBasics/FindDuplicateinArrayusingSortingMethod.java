package javaBasics;

import java.util.Arrays;

public class FindDuplicateinArrayusingSortingMethod {

	public static void main(String[] args) {
		int[] inputarr= {2,5,6,7,8,2,9,10,4,9,0,3,4};
		FindDuplicateinArrayusingSortingMethod.SortingMethod(inputarr);
		//using sorting method
		

	}
	
	private static void SortingMethod(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++)
		{
				if(arr[i]==arr[i+1])
				{
					System.out.println("Duplicate element found: "+arr[i]);
				}
			
		}
	}
	

}
