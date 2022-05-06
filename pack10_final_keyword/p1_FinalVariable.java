/**
 * In this lecture, we will learn
 * 
 *
 */
package pack10_final_keyword;

public class p1_FinalVariable {
	final int b;
	final static int c;
	static
	{
		c=15;
	}
	public p1_FinalVariable() {
	b=12;
	}
	public static void main(String[] args) {
		final int a=12;
	//	a=13;//The final local variable a cannot be assigned. 
		//It must be blank and not using a compound assignment
		System.out.println(a);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */