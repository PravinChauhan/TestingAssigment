package javaBasics;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterOccurence {

	public static void main(String[] args) {
	/*	String str="JAVA";
		int result=str.length()-str.replaceAll("A", "").length();
		System.out.println(result);
	*/	
		
		//java program to count the occurence of each character in a String using Hashmap
		
		String str="PravinChauhan";
//convertung given string to char array		
		char[] arr=str.toCharArray();
//creating hashmap containing char as a key and occurence as a value		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
// converting each character of arr
		for(char c:arr)
		{ if (map.containsKey(c))          //if char is present in charcountmap map implementing
		    {map.put(c, map.get(c)+1);}    // its count by 1
	      else 
		    { map.put(c, 1);}    // puttting char as its value
	    }
		
		//printing duplicates
		for (Map.Entry entry: map.entrySet()) 
		{System.out.println(entry.getKey()+" "+entry.getValue()); }

	}

}
