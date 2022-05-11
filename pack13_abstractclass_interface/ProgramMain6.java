/**
 * In this lecture, we will learn
 * 
 *
 */
package pack13_abstractclass_interface;
interface Company3
 {
	  void attendence();
	 public abstract void hireDeveloper();
	 
 }
abstract class CEO3 implements Company3
{

	
	@Override
	public void hireDeveloper() {
		
		
	}
	
}
 class HR3 extends CEO3
 {
	 @Override
	public void hireDeveloper() {
		System.out.println("hireDeveloper rules");
	}
	public void attendence()
	  {
		  System.out.println("attendence marked  HR");
	  } 
 }
 class Developer3 extends CEO3
 {
	 public void attendence()
	  {
		  System.out.println("attendence marked  Developer");
	  }
 }
 class Marketing3 extends CEO3
 {
	public void attendence()
	  {
		 System.out.println("attendence marked  Marketing");
	  }
 }
public class ProgramMain6 {
	public static void main(String[] args) {
		Company3 refvar;
		refvar=new Developer3();
		refvar.attendence();
		refvar=new HR3();
		refvar.hireDeveloper();
		refvar.attendence();
		refvar=new Marketing3();
		refvar.attendence();
		
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */