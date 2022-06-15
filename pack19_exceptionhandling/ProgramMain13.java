/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;
//Let's see a simple example of java multi-catch block.
public class ProgramMain13 {
	public static void main(String[] args) {
		try
		{
		int[] arr=new int[] {0,445,4,5};
		//System.out.println(arr[8]);
		int ans=50/arr[2];
		System.out.println(ans);
		String a=null;
		//System.out.println(a.length());
		System.out.println(Integer.parseInt(a));
		}
		catch (Exception e) {
			System.out.println("all exception "+e);
		}
		/*
		 * catch (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("index not found "+e); } catch (ArithmeticException e) {
		 * System.out.println("arihmetic exception "+e); }
		 */		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */