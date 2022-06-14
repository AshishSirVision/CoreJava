/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

public class ProgramMain8 {
	
	void check(int age) throws InvalidAgeException
	{
		if(age>=18)
		{
			System.out.println("You are Eligible for Vote");
		}
		else
		{
			throw new InvalidAgeException("eligibility criteria not match");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		ProgramMain8 obj=new ProgramMain8();
		try {
			obj.check(28);
		} catch (InvalidAgeException e) {
			System.out.println(""+e);
		}
	}
}
/**
 * Notes Conclusion
 * 
 *
 */