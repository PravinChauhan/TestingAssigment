package javaBasics;

public class ReverseWord {

	public static void main(String[] args) {
		String str="I am learning Java";
		String result="";
		String[] arr=str.split(" ");   //or "\\s" define sapce
		for(int i=arr.length-1;i>=0;i--)
		{
			result=result+arr[i]+" ";
		}
		
		System.out.println(result);
	}

}
