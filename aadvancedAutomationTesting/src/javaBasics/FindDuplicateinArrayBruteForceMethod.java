package javaBasics;

public class FindDuplicateinArrayBruteForceMethod {

	public static void main(String[] args) {
		int[] inputarr= {2,5,6,7,8,2,9,10};
		FindDuplicateinArrayBruteForceMethod.bruteforcemethod(inputarr);
		
		//Brute Force Method (Time complexity issue means high)

	}
	
	private static void bruteforcemethod(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate element found: "+arr[i]);
				}
			}
		}
	}

}
