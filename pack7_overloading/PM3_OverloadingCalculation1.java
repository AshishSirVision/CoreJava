/**
 * In this lecture, we will learn
 * 
 *
 */
package pack7_overloading;

public class PM3_OverloadingCalculation1 {

	void sum(long a, int b) {
		System.out.println(a + b);
		System.out.println("int arg method invoked");
	}

	void sum(int a, long b) {
		System.out.println(a + b);
		System.out.println("int arg method invoked");
	}

	void sum(int a, int b) {
		System.out.println(a + b);
		System.out.println("int arg method invoked");
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
		System.out.println("long arg method invoked");
	}

	public static void main(String args[]) {
		PM3_OverloadingCalculation1 obj = new PM3_OverloadingCalculation1();
		obj.sum(24l, 20);// now second int literal will be promoted to long
		obj.sum(20, 20, 20);

	}
}
