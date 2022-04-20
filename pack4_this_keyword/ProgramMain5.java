/**
 * In this lecture, we will learn
 *Calling default constructor from parameterized constructor:

 */
package pack4_this_keyword;
class Student4
{
	int id;
	String name;
	int age;
	public Student4() {
		System.out.println("object create done");
	}
	public Student4(int i,String n,int a) {
		this();
		 id=i;
		 name=n;
		 age=a;
	 //this();//Constructor call must be the first statement in a constructor
	}
	private void show() {
		System.out.println(id+", "+name+", "+age);
		//System.out.println(this);
	}
	void display()
	{ 
		//System.out.println(this);
		this.show();
	}
	
}




public class ProgramMain5 {
	public static void main(String[] args) {
		Student4 s1=new Student4(111, "vivek", 22);
		Student4 s2=new Student4(112, "gaurav", 21);
		Student4 s3=new Student4(113, "sumesh", 20);
		s1.display();
		//System.out.println(s1);
		s2.display();
		//System.out.println(s2);
		s3.display();
		//System.out.println(s3);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */