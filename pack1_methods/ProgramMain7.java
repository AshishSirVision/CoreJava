/**
 * In this lecture, we will learn
 * 
 *
 */
package pack1_methods;
class Student5 {
	private int id;//data members 1
	private String name;//data members 2
	private String qulification;//data members 2
	float fees;
	char gender;
	public Student5(int id,String name,String qulification,float fees,char gender)
	{
		this.id=id;
		this.name=name;
		this.qulification=qulification;
		this.fees=fees;
		this.gender=gender;
		
	}
	@Override
	public String toString() {
		String data="id : "+id+" Name :"+name+" Qulification : "+qulification;
	    return data;
	}
}

public class ProgramMain7 {
	public static void main(String[] args) {
		Student5 obj=new Student5(111, "tom", "HSC", 234.45f, 'M');
		System.out.println(obj);
		Student5 obj2=new Student5(112, "tom", "HSC", 234.45f, 'M');
		System.out.println(obj2);
		Student5 obj3=new Student5(113, "tom", "HSC", 234.45f, 'M');
		System.out.println(obj3);
		Student5 obj4=new Student5(114, "tom", "HSC", 234.45f, 'M');
		System.out.println(obj4);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */