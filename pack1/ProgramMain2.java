/**
 /**
 * In this lecture, we will learn
 * Object and Class Example: main method within the class
In this example, we have created a ProgramMain2(Student) class
 which has two data members id and name.
 We are creating the object of the Student
  class by new keyword and 
  assign the value to the object
  printing the object's value.
 *
 */
 
package pack1;

public class ProgramMain2 {
	int id;//data members 1
	String name;//data members 2
	
	public static void main(String[] args) {
		//Create object
		ProgramMain2 s1=new ProgramMain2();
		ProgramMain2 s2=new ProgramMain2();
		ProgramMain2 s3=new ProgramMain2();
		ProgramMain2 s4=new ProgramMain2();
		ProgramMain2 s5=new ProgramMain2();
		//assign the value to the object
		s1.id=111;
		s1.name="Anurag Singh";
		
		s2.id=112;
		s2.name="Gaurav Singh";
		
		
		s3.id=113;
		s3.name="Somesh Singh";
		
		s4.id=114;
		s4.name="Raj Singh";
		
		s5.id=115;
		s5.name="Devendra Singh";
		
		
		
		//printing objects value
		System.out.println("for Anurag :"+s1.id+" , "+s1.name);
		System.out.println("for Gaurav :"+s2.id+" , "+s2.name);
		System.out.println("for Gaurav :"+s3.id+" , "+s3.name);
		System.out.println("for Gaurav :"+s4.id+" , "+s4.name);
		System.out.println("for Gaurav :"+s5.id+" , "+s5.name);
		
		
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */