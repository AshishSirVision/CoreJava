/**
 * In this lecture, we will learn
 *Calling parameterized constructor from default constructor:

 */
package pack4;
class Student5
{
	int id;
	String name;
	int age;
	public Student5() {
		this(111, "vivek", 22);
		System.out.println("object create done");
	}
	private Student5(int i,String n,int a) {
	
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




public class ProgramMain6 {
	public static void main(String[] args) {
		Student5 s1=new Student5();
		Student5 s2=new Student5();
		Student5 s3=new Student5();
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