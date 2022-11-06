package javaBasics;

public class ExtractLastFourCharacterFromStirng {

	public static void main(String[] args) {
		
		String str="www.google.com";  // first 4 : www. and last 4: .com
		
		String first4=str.substring(0, 4);
	    System.out.println(first4);
	    
	    String last4=str.substring(10, 14);
	    System.out.println(last4);
		

	}

}
