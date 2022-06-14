/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain3 {
	public static void main(String[] args) {

		System.out.println("start");
		try
		{
		   throw new ArithmeticException("divide");
		}
		catch(ArithmeticException e)
		{
			System.out.println("arrya index out of range"+e);
		}
		
		System.out.println("stop");
	}
}
/**
 * Notes Conclusion
 * 
 *
 */