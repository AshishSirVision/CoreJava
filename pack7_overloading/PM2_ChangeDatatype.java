/**
 * In this lecture, we will learn
 * 
 *
 */
package pack7_overloading;

class Addition {
	public static void add(int a, int b) {
		System.out.println("ii, a :"+a+", b : "+b);
		System.out.println(a + b);
	}
	public static void add(double a, int b) {
		System.out.println("a :"+a+", b : "+b);
		System.out.println(a + b);
	}
	public static void add(int a, double b) {
		System.out.println("a :"+a+", b : "+b);
		System.out.println(a + b);
	}
	public static void add(double a, double b) {
		System.out.println("dd, a :"+a+", b : "+b);
		System.out.println(a + b);
	}
	public static void add(float a, float b) {
		System.out.println("ff, a :"+a+", b : "+b);
		System.out.println(a + b);
	}
	public static void add(float a, int b) {
		System.out.println("a :"+a+", b : "+b);
		System.out.println(a + b);
	}
	public static void add(int a, float b) {
		System.out.println("a :"+a+", b : "+b);
		System.out.println(a + b);
	}
	
	
}

public class PM2_ChangeDatatype {
	public static void main(String[] args) {
		Addition.add(12, 14);
		Addition.add(12.45, 14.67);
		Addition.add(12.45f, 14.67f);
		
	}
	public static void main(String args) {
		Addition.add(12, 14);
		
	}
	public static void main(int[] args) {
	
		Addition.add(12.45f, 14.67f);
		
	}
	
}
/**
 * Notes Conclusion
 * 
 *
 */