/**
 * In this lecture, we will learn
 * Understanding the problem without this keyword
Let's understand the problem if we don't use this keyword by the example given below
 *
 */
package pack4;
class Student
{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		 id=id;
		 name=name;
		 age=age;
	}
	void display() {
		System.out.println(id+", "+name+", "+age);
	}
}




public class ProgramMain1 {
	public static void main(String[] args) {
		Student s1=new Student(111, "vivek", 22);
		Student s2=new Student(112, "gaurav", 21);
		Student s3=new Student(113, "sumesh", 20);
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