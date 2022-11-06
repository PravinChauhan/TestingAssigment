package javaBasics;

public class ReverseEachWordInSentence {

	public static void main(String[] args) {
		
	String str="Pravin Chauhan";
	String result="";
	String[] arr=str.split("\\s"); 
	
	for(String word:arr)
	{
		String reversWord="";
		int j=word.length()-1;
		
		while(j>=0)
		{
			char ch=word.charAt(j);
			reversWord=reversWord+ch;
			j--;
		}
		result=result+reversWord+" ";
	}
	System.out.println(result);

	}

}
