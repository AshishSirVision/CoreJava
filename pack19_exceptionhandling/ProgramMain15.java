/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain15 {
	public static void main(String[] args) {
		try
		{
			throw new ArithmeticException("/ by zero");
		}
		finally
		{
			System.out.println("e");
		}
	}
}
/**
 * Notes Conclusion
 * 
 *
 */