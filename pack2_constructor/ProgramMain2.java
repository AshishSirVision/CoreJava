/**
 * In this lecture, we will learn
 * 
 *
 */
package pack2_constructor;

class Student1 {
	int id;
	String name;
	float fees;
	public Student1(int a,String b) {
		id=a;
		name=b;
	}
	public Student1() {
	
	}
	
	public void disp() {
		System.out.println(id+", "+name+", "+fees);

	}
}

public class ProgramMain2 {
	public static void main(String[] args) {
		Student1 s1=new Student1(111, "tom");
		Student1 s2=new Student1();
		s2.id=s1.id;
		s2.name=s1.name;
		s1.disp();
		s2.disp();
		
		//when we create object then constructor call
		//constructor return an instance and it store in reference variable
		

	}
}
/**
 * Notes Conclusion
 * 
 *
 */