/**
 /**
 * In this lecture, we will learn
 * Object and Class Example: main method in separate class and data member another class
In this example, we have created a ProgramMain3(Student) class
 which has two data members id and name.
 We are creating the object of the Student
  class by new keyword and 
  assign the value to the object
  printing the object's value.
 *
 */
 
package pack1_methods;
class Student
{

	int id;//data members 1
	String name;//data members 2
	String qulification;//data members 2
	int fees;
}


public class ProgramMain3 {
	
	public static void main(String[] args) {
		//Create object
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		//assign the value to the object
		s1.id=111;
		s1.name="Anurag Singh";
		s1.qulification="HSC";
		
		s2.id=112;
		s2.name="Gaurav Singh";
		s2.qulification="HSC";
		
		s3.id=113;
		s3.name="Somesh Singh";
		
		s4.id=114;
		s4.name="Raj Singh";
		
		s5.id=115;
		s5.name="Devendra Singh";
		
		
		
		//printing objects value
		System.out.println("for Anurag :"+s1.id+" , "+s1.name+", "+s1.qulification);
		System.out.println("for Gaurav :"+s2.id+" , "+s2.name+", "+s2.qulification);
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