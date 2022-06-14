/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain1 {
	public static void main(String[] args) {

		System.out.println("start");
		try
		{
		   System.out.println(100/0);
		}
		catch(ArithmeticException refobj)
		{
			System.out.println("divide by zero not possible");
		}
		
		System.out.println("stop");
	}
}
/**
 * Notes Conclusion
 * 
 *
 */