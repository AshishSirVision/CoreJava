/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain4 {
	public static void main(String[] args) {

		System.out.println("start");
		try
		{
		  String s=null;
		  System.out.println(s.length());
		}
		catch(NullPointerException e)
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