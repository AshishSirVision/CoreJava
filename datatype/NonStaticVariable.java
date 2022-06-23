package datatype;

public class NonStaticVariable {
	 byte by;
	 short s=113;
	 int a;
	 long b;
	
	 float f;
	 double d;
	
	
	 char ch='u';
	 boolean bo;
	
	public static void main(String[] args) {
		NonStaticVariable obj=new NonStaticVariable();
		
		System.out.println("vaue of ch : "+obj.ch);
		System.out.println(obj.s);
		System.out.println(obj.a);
	
		
	}}
