package javaBasics;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
     String str1="Army";
     String str2="Mary";
     
 	char[] arr1=str1.toLowerCase().toCharArray();
 	char[] arr2=str2.toLowerCase().toCharArray();
 	
 	Arrays.sort(arr1);
 	Arrays.sort(arr2);
 	
 	if(Arrays.equals(arr1,arr2))
 	{ System.out.println("Given Strings are anagram");}
 	else 
	{ System.out.println("Given Strings are not anagram");}	

	}

}
