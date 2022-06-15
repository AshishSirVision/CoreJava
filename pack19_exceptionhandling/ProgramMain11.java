/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;
//Let's see a simple example of java multi-catch block.
public class ProgramMain11 {
	public static void main(String[] args) {
		try
		{
		int[] arr=new int[] {0,445,4,5};
		//System.out.println(arr[8]);
		int ans=50/arr[8];
		System.out.println(ans);
		}
		catch (Exception e) {
			System.out.println("index not found "+e);
		}
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */