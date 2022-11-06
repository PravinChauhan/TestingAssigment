package javaBasics;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str="I am Pravin Pravin";
		
		//using set==set does not allow duplicate
		String[] arr=str.split(" ");
		
		Set<String> myset=new LinkedHashSet<String>();
		for(String x:arr) {
			myset.add(x);
		}
		
		Iterator itr=myset.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}
