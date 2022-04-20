/**
 * In this lecture, we will learn
 * 
 *
 */
package pack4_this_keyword;



class BigBag {
	public void meth() {

		System.out.println("meth called");
	}
	
	public BigBag meth1() {

		System.out.println("meth1 called");
		return this;
	}
}

public class ProgramMain10 {
	public static void main(String[] args) {
		BigBag obj = new BigBag();
		obj.meth1().meth();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */