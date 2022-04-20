/**
 * In this lecture, we will learn
 * 
 *
 */
package pack2_constructor;

class Student {
	int id;
	String name;
	float fees;
	public Student(int a,String b) {
		id=a;
		name=b;
	}
	public Student(int a,String b,float f) {
		id=a;
		name=b;
		fees=f;
	}
	public Student(Student obj) {
		id=obj.id;
		name=obj.name;
		fees=obj.fees;
	}
	public void disp() {
		System.out.println(id+", "+name+", "+fees);

	}
}

public class ProgramMain1 {
	public static void main(String[] args) {
		Student gaurav=new Student(111,"Gaurav",43434.45f);;
		gaurav.disp();
		Student vivek=new Student(112,"vivek");;
		vivek.disp();
		
		Student arun=new Student(gaurav);;
		Student sumesh=new Student(vivek);;
		arun.disp();
		sumesh.disp();
		//when we create object then constructor call
		//constructor return an instance and it store in reference variable
		

	}
}
/**
 * Notes Conclusion
 * 
 *
 */