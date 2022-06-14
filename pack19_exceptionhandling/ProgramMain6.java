/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain6 {
	public static void main(String[] args) {

		System.out.println("start");
		try
		{
		  String s="abc";
		 // System.out.println(Integer.parseInt(s));//finaly block cannot handled exception
		}
		finally
		{
			System.out.println("always executed");
		}
		
		System.out.println("stop");
	}
}
/**
 * Notes Conclusion
 * 
 *
 */