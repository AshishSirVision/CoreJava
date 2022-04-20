/**
 /**
 * In this lecture, we will learn
 * Object and Class Example: accessor method--get
 *
 */
 
package pack1_methods;
class Student1
{

	private int id;//data members 1
	private String name;//data members 2
	private String qulification;//data members 2
	int fees;
	char gender;
	
   void setId(int id)
   {
	   this.id=id;
   }
   int getId()
   {
	   return id;
   }
	
   void setName(String name)
   {
	   this.name=name;
   }
   String getName()
   {
	   return name;
   }
   void setQulification(String qulification)
   {
	   this.qulification=qulification;
   }
   String getQulification()
   {
	   return qulification;
   }
	
}


public class ProgramMain4 {
	
	public static void main(String[] args) {
		//Create object
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		Student1 s3=new Student1();
		Student1 s4=new Student1();
		Student1 s5=new Student1();
		//assign the value to the object
		s1.setId(111);
		s1.setName("Anurag Singh");
		s1.setQulification("HSC");
		
		s2.setId(112);
		s2.setName("Gaurav Singh");
		s2.setQulification("SSC");
		
		s3.setId(113);
		s3.setName("Somesh Singh");
		s3.setQulification("BSC");
		
		s4.setId(114);
		s4.setName("Raj Singh");
		s4.setQulification("Fyjc");
		
		s5.setId(115);
		s5.setName("Devendra Singh");
		s5.setQulification("BE");
		
		
		//printing objects value
		System.out.println("for Anurag :"+s1.getId()+" , "+s1.getName()+", "+s1.getQulification());
		System.out.println("for Gaurav :"+s2.getId()+" , "+s2.getName()+", "+s2.getQulification());
		System.out.println("for Gaurav :"+s3.getId()+" , "+s3.getName()+", "+s3.getQulification());
		System.out.println("for Gaurav :"+s4.getId()+" , "+s4.getName()+", "+s4.getQulification());
		System.out.println("for Gaurav :"+s5.getId()+" , "+s5.getName()+", "+s5.getQulification());
		
		
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */