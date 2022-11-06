package javaBasics;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Pravin";
		
		//way 1 == using stringbuffer
		
		StringBuffer st=new StringBuffer(str);
		String result=st.reverse().toString();
		System.out.println(result);
		
		//way2 = using loop
		String result1="";
		for(int i=str.length()-1;i>=0;i--)
		{
			 result1=result1+str.charAt(i);
		}
		System.out.println(result1);

	}

}
