/**
 * In this lecture, we will learn
 * 
 *
 */
package pack9_super_keyword;

class Person {
	int id;
	String name;

	public Person(int i, String n) {
		id = i;
		name = n;
	}
}
class Employee extends Person{
	float salary;

	public Employee(int a,String b,float s) {
		super(a,b);
		salary = s;
	}
	void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		
	}
}
public class ProgramMain4 {
	public static void main(String[] args) {

		Employee obj=new Employee(111, "tom", 56789);
		obj.display();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */