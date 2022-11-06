package javaBasics;

public class ReverseNumber {
	
	public static int reverse(int num) {
		int result=0;
		
		while (num>0)
		{
			result=result*10+num%10;
			num=num/10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1234));
	}

}
