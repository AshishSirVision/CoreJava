/**
 * In this lecture, we will learn
 * 
 *
 */
package pack13_abstractclass_interface;
abstract class Company1
 {
	 abstract void attendence();
	 //abstract void hireDeveloper();
	 
 }
 class HR1 extends Company1
 {
	 void attendence()
	  {
		  System.out.println("attendence marked  HR");
	  } 
 }
 class Developer extends Company1
 {
	  void attendence()
	  {
		  System.out.println("attendence marked  Developer");
	  }
 }
 class Marketing extends Company1
 {
	 void attendence()
	  {
		 System.out.println("attendence marked  Marketing");
	  }
 }
public class ProgramMain4 {
	public static void main(String[] args) {
		Company1 refvar;
		refvar=new Developer();
		refvar.attendence();
		refvar=new HR1();
		refvar.attendence();
		refvar=new Marketing();
		refvar.attendence();
		
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */