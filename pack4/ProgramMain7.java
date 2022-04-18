/**
 * In this lecture, we will learn
 * Real usage of this() constructor call
 *
 */

package pack4;
class Student6
{
	int id;
	String name;
	int age;
	float fees;
	String coursename;
	
	public Student6(int i,String n,int a) {
	
		 id=i;
		 name=n;
		 age=a;
	 
	}
	public Student6(int i,String n,int a,float fees,String coursename) {
		
		this(i,n,a);
		this.fees=fees;
		this.coursename=coursename;
		
	 
	}
	private void show() {
		System.out.println(id+", "+name+", "+age+", "+fees+" , "+coursename);
		//System.out.println(this);
	}
	void display()
	{ 
		//System.out.println(this);
		this.show();
	}
	
}




public class ProgramMain7 {
	public static void main(String[] args) {
		Student6 s1=new Student6(111, "vivek", 22,54.56f,"CSE");
		Student6 s2=new Student6(112, "Gaurav", 22,5454.6f,"JDP");
		Student6 s3=new Student6(113, "Arun", 21,6555.34f,"ADWD2");
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