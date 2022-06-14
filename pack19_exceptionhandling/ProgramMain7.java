/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain7 {
	public static void main(String[] args) {

		System.out.println("start");
		try
		{
		 throw new TrainNotFoundException("train not available in this time interval");
		}
		catch(TrainNotFoundException e)
		{
			System.out.println(""+e);
		}
		
		System.out.println("stop");
	}
}
/**
 * Notes Conclusion
 * 
 *
 */