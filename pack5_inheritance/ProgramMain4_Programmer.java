/**
 * In this lecture, we will learn
 * 
 *
 */
package pack5_inheritance;

class Employee {
	int salary = 57575;
}

public class ProgramMain4_Programmer extends Employee{
	int bonus = 6534;

	public static void main(String[] args) {
		ProgramMain4_Programmer p = new ProgramMain4_Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Programmer Bonus is:" + p.bonus);
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */