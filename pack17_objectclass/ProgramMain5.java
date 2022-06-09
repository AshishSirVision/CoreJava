/**
 * In this lecture, we will learn
 * 
 *
 */
package pack17_objectclass;

import java.util.Objects;

class Student implements Cloneable
{
	int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	public boolean isiSMarried() {
		return iSMarried;
	}
	public void setiSMarried(boolean iSMarried) {
		this.iSMarried = iSMarried;
	}
	public Student(int id, String name, int age, float fees, long mbno, boolean iSMarried) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.fees = fees;
		this.mbno = mbno;
		this.iSMarried = iSMarried;
	}
	String name;
	@Override
	public int hashCode() {
		return Objects.hash(age, fees, iSMarried, id, mbno, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Float.floatToIntBits(fees) == Float.floatToIntBits(other.fees)
				&& iSMarried == other.iSMarried && id == other.id && mbno == other.mbno
				&& Objects.equals(name, other.name);
	}
	int age;
	float fees;
	long mbno;
	boolean iSMarried;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class ProgramMain5 {
public static void main(String[] args) {
	Student obj=new Student(111, "tom", 12, 4433.4f, 545874534, false);
	Student refvar=null;
	try {
		refvar=(Student)obj.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(obj.equals(refvar));
	System.out.println(obj.hashCode());
	System.out.println(refvar.hashCode());
	
}
}
/**
 * Notes Conclusion
 * 
 *
 */