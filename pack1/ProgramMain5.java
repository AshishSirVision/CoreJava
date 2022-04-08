/**
 * In this lecture, we will learn
 * Overloading
 *same method name different signature
 *      number of parameter different
 *      datatype of parameter different
 *within the same class
 */
package pack1;

class Addition {
	public void sum() {
		System.out.println("sum method called-no");
	}

	public void sum(int a) {
		System.out.println("sum method called-1");
	}

	public void sum(int a, int b) {
		System.out.println("sum method called-ii");
	}

	public void sum(float a, int b) {
		System.out.println("sum method called-fi");
	}

	public void sum(int a, float b) {
		System.out.println("sum method called-if");
	}

	public void sum(float a, float b) {
		System.out.println("sum method called-ff");
	}
	public void sum(float a, float b,float c) {
		System.out.println("sum method called-ff");
	}
	/*
	 * fff
	 * ffi
	 * fif
	 * fii
	 * 
	 * iff
	 * ifi
	 * iif
	 * iii
	 */

}

public class ProgramMain5 {
	public static void main(String[] args) {
	Addition obj=new Addition();
	obj.sum();
	obj.sum(2);
	obj.sum(2,6);
	obj.sum(2,45.45f);
	obj.sum(2.54f,454);
	obj.sum(3.4f,45.45f);


	}
}
/**
 * Notes Conclusion
 * 
 *
 */