/**
 * In this lecture, we will learn
 * Constructor Overloading
 * Constructor name, same name as the class name
 *   Constructor similar to method
 *   does not have return type
 *   when object created constructor automatically called
 *   
 *constructor have different signature
 *      number of parameter different
 *      data type of parameter different
 *within the same class
 */
package pack1;

class Sum {
	public Sum() {
		System.out.println("sum method called-no");
	}

	public Sum(int a) {
		System.out.println("sum method called-1");
	}

	
	public Sum(float a, int b) {
		System.out.println("sum method called-fi");
	}

	public Sum(int a, float b) {
		System.out.println("sum method called-if");
	}

	public Sum(float a, float b) {
		System.out.println("sum method called-ff");
	}
	public Sum(float a, float b,float c) {
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

public class ProgramMain6 {
	public static void main(String[] args) {
	new Sum();
	new Sum();
	new Sum(2);
	new Sum(2,45.45f);
	new Sum(2.54f,454);
	new Sum(3.4f,45.45f);


	}
}
/**
 * Notes Conclusion
 * 
 *
 */