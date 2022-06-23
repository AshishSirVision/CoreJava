package datatype;

public class DataTypePro {
	public static void main(String[] args) {
		byte by;
		short s;
		int a;
		long b;
		
		float f;
		double d;
		
		
		char ch;
		boolean bo;
		
		System.out.println("size in bit : "+Byte.SIZE+", maxvalue :"+Byte.MAX_VALUE+",min value: "+Byte.MIN_VALUE);
		System.out.println("size in byte :"+Byte.SIZE/8);
		
		System.out.println("size in bit : "+Integer.SIZE+", maxvalue :"+Integer.MAX_VALUE+",min value: "+Integer.MIN_VALUE);
		System.out.println("size in byte :"+Integer.SIZE/8);
	}
}
