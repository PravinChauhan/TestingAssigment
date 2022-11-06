package day002;

public class Assignement01 {
	public int sum(int x, int y) {int sum=x+y; return sum;}
	public int sub(int p, int q) {int sub=p-q; return sub;}
	public int multiply(int m, int n) {int multiply=m*n; return multiply;}
	public float devide(float c, float d) {float devide=c/d; return devide;}
	public static String P="\u001B[35m", G="\u001B[32m";
	
	public static void main(String[] args) {
		
		Assignement01 obj=new Assignement01();
		
		int S=obj.sum(10,2);
		int S1=obj.sum(S, 2);
		int s=obj.sub(S1, 2);
		int M=obj.multiply(s, 2);
		float total=obj.devide(M, 2);
		
		System.out.println(P+"The value of (((10+2)+2)-2)*2)2) is "+G+total);

}
	

}
