/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain5 {
	public static void main(String[] args) {

		System.out.println("start");
		try
		{
		  String s="abc";
		  System.out.println(Integer.parseInt(s));
		}
		catch(NumberFormatException e)
		{
			System.out.println("string cannot convert into integer"+e);
		}
		
		System.out.println("stop");
	}
}
/**
 * Notes Conclusion
 * 
 *
 */