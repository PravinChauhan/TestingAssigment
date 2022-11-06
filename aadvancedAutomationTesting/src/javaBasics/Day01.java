package javaBasics;

public class Day01 {
	
	int age;
	
	public void Display() {
		System.out.println("Welcome to All");
	}
	
 public static void main(String[] args) {
	 
	 Day01 ref_obj=new Day01();
	 ref_obj.Display();
	 ref_obj.age=25;
	 System.out.println(ref_obj.age);
	
}

}
