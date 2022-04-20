/**
 * In this lecture, we will learn
 *Program where this keyword is not required
 */
package pack4_this_keyword;
class Student3
{
	int id;
	String name;
	int age;
	public Student3(int i,String n,int a) {
		 id=i;
		 name=n;
		 age=a;
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




public class ProgramMain4 {
	public static void main(String[] args) {
		Student3 s1=new Student3(111, "vivek", 22);
		Student3 s2=new Student3(112, "gaurav", 21);
		Student3 s3=new Student3(113, "sumesh", 20);
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