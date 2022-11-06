package javaBasics;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindNonRepeatedCharacter {

	public static void main(String[] args) {
		String str="Hello";
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		Integer count=1;

		for(int i=0; i<str.length();i++)
		{ if (!map.containsKey(str.charAt(i))) 
		    {map.put(str.charAt(i), count);}
	      else 
		    { map.put(str.charAt(i), map.get(str.charAt(i))+1);}
	    }
		
		//printing first non repeated charcter from map
		for (Entry<Character, Integer> entry: map.entrySet())
		{if (entry.getValue()==1) 
		{System.out.println("The first non repeated charcater is : "+entry.getKey()); 
		break;}
		}

	}

}
