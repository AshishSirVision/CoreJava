/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain2 {
	public static void main(String[] args) {

		System.out.println("start");
		try
		{
		   System.out.println(args[10]);
		}
		catch(ArrayIndexOutOfBoundsException refobj)
		{
			System.out.println("arrya index out of range");
		}
		
		System.out.println("stop");
	}
}
/**
 * Notes Conclusion
 * 
 *
 */