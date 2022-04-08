/**
 /**
 * In this lecture, we will learn
 * Object and Class Example: main method within the class
In this example, we have created a ProgramMain1(Student) class
 which has two data members id and name.
 We are creating the object of the Student
  class by new keyword and printing the object's value.
 *
 */
 
package pack1;

public class ProgramMain1 {
	int id;//data members 1
	String name;//data members 2
	
	public static void main(String[] args) {
		//Create object
		ProgramMain1 s1=new ProgramMain1();
		ProgramMain1 s2=new ProgramMain1();
		ProgramMain1 s3=new ProgramMain1();
		ProgramMain1 s4=new ProgramMain1();
		ProgramMain1 s5=new ProgramMain1();
		
		//printing objects value
		System.out.println("for Anurag :"+s1.id+" , "+s1.name);
		System.out.println("for Gaurav :"+s2.id+" , "+s2.name);
		
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */