/**
 * In this lecture, we will learn
 * 
 *
 */
package pack13_abstractclass_interface;
abstract class Company2
 {
	 abstract void attendence();
	 abstract void hireDeveloper();
	 
 }
abstract class CEO extends Company2
{

	

	@Override
	void hireDeveloper() {
		
		
	}
	
}
 class HR2 extends CEO
 {
	 @Override
	void hireDeveloper() {
		System.out.println("hireDeveloper rules");
	}
	 void attendence()
	  {
		  System.out.println("attendence marked  HR");
	  } 
 }
 class Developer2 extends CEO
 {
	  void attendence()
	  {
		  System.out.println("attendence marked  Developer");
	  }
 }
 class Marketing2 extends CEO
 {
	 void attendence()
	  {
		 System.out.println("attendence marked  Marketing");
	  }
 }
public class ProgramMain5 {
	public static void main(String[] args) {
		Company2 refvar;
		refvar=new Developer2();
		refvar.attendence();
		refvar=new HR2();
		refvar.hireDeveloper();
		refvar.attendence();
		refvar=new Marketing2();
		refvar.attendence();
		
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */