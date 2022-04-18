/**
 * In this lecture, we will learn
 * Using static variable
 *
 */
package pack3;

class Student1 {
	int rollno;
	String name;
	float fees;
	String address;
	static  String college = "Av College";
	static String university = "Mumbai";
	
	public Student1(int rollno,String name,float fees,String address)
	{
		this.rollno=rollno;
		this.name=name;
		this.fees=fees;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(fees);
		System.out.println(address);
		System.out.println(college);
		System.out.println(university);
		
	}
}

public class ProgramMain2 {
	public static void main(String[] args) {
		Student1 obj=new Student1(111	, "anurag", 54000.45f, "NSP");
		obj.display();
		Student1 obj2=new Student1(112	, "vivek", 54002.45f, "VR");
		obj2.display();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */