/**
 * In this lecture, we will learn
 * this: to pass as an argument in the method
 */
package pack4_this_keyword;
class Student7
{
	int id;
	String name;
	int age;
	public Student7(int i,String n,int a) {
		 id=i;
		 name=n;
		 age=a;
	}
	public void show() {
		
		A.display(this);
	}
	
}

class A
{
	static void  display(Student7 obj)
	{ 
		System.out.println(obj.id+", "+obj.name+", "+obj.age);
	
		
	}
}



public class ProgramMain8 {
	public static void main(String[] args) {
		Student7 s1=new Student7(111, "vivek", 22);
		Student7 s2=new Student7(112, "gaurav", 21);
		Student7 s3=new Student7(113, "sumesh", 20);
		s1.show();
		//System.out.println(s1);
		s2.show();
		//System.out.println(s2);
		s3.show();
		//System.out.println(s3);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */