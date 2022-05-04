/**
 * In this lecture, we will learn
 * 
 *
 */
package pack9_super_keyword;

public class Instance_initializer_Block {

	Instance_initializer_Block() {// after block exectution constructor print the statement
		System.out.println("constructor");
	}

	{// first execute block
		System.out.println("Hello Instance_initializer_Block ");
	}

	public static void main(String[] args) {
		new Instance_initializer_Block();
		new Instance_initializer_Block();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */