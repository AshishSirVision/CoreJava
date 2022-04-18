/**
 * In this lecture, we will learn
 *Program where this keyword is not required
 */
package pack4;
class Student2
{
	int id;
	String name;
	int age;
	public Student2(int i,String n,int a) {
		 id=i;
		 name=n;
		 age=a;
	}
	void display() {
		System.out.println(id+", "+name+", "+age);
	}
}




public class ProgramMain3 {
	public static void main(String[] args) {
		Student2 s1=new Student2(111, "vivek", 22);
		Student2 s2=new Student2(112, "gaurav", 21);
		Student2 s3=new Student2(113, "sumesh", 20);
		s1.display();
		s2.display();
		s3.display();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */