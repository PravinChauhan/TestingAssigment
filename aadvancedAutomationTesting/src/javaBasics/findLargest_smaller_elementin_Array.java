package javaBasics;

import java.util.Arrays;

public class findLargest_smaller_elementin_Array {

	public static void main(String[] args) {
		int[] arr= {12,5,108,80,77,30,69,91};
		int largest=arr[0];
		int smallest=arr[0];
		
		for (int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest) 
			{
				largest=arr[i];
			}else if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("The largest elemenet is: "+largest);
		System.out.println("The smallest elemenet is: "+smallest);
	}

}
