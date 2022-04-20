/**
 * In this lecture, we will learn
 * this: to refer current class instance variable
 *using this keyword
 */
package pack4_this_keyword;
class Student1
{
	int id;//instance variable
	String name;
	int age;
	public Student1(int id,String name,int age) {
		 this.id=id;
		 this.name=name;
		 this.age=age;
	}
	void display() {
		System.out.println(id+", "+name+", "+age);
	}
}




public class ProgramMain2 {
	public static void main(String[] args) {
		Student1 s1=new Student1(111, "vivek", 22);
		Student1 s2=new Student1(112, "gaurav", 21);
		Student1 s3=new Student1(113, "sumesh", 20);
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