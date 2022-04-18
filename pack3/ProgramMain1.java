/**
 * In this lecture, we will learn
 * Understanding the problem without static variable
 *
 */
package pack3;

class Student {
	int rollno;
	String name;
	float fees;
	String address;
	 String college = "Av College";
	String university = "Mumbai";
	
	public Student(int rollno,String name,float fees,String address)
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

public class ProgramMain1 {
	public static void main(String[] args) {
		Student obj=new Student(111	, "anurag", 54000.45f, "NSP");
		obj.display();
		Student obj2=new Student(112	, "vivek", 54002.45f, "VR");
		obj2.display();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */