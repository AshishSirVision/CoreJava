/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;
class A
{
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
	
	void meth1() throws InvalidAgeException
	{
		check(8);
	}
	void meth2() throws InvalidAgeException 
	{
		meth1();
	}
	
}
public class ProgramMain9 {
	
	public static void main(String[] args) {
		A obj=new A();
		try {
			obj.meth1();
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