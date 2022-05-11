/**
 * In this lecture, we will learn
 * 
 *
 */
package pack13_abstractclass_interface;
abstract class Company
{
	
	public Company() {
		System.out.println("daily timing");
	}
	abstract void hireEmployee();
	static void message()//non-abstract method and static also
	{
		System.out.println("Good thoughts daily");
	}
	public final void info() {
		System.out.println("credentials information");
	}
}
class HR extends Company
{
	@Override
	 void hireEmployee()
	 {
		 System.out.println("HR task");
	 }
	
}


public class ProgramMain3 {
	public static void main(String[] args) {
		Company obj=new HR();
		obj.hireEmployee();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */