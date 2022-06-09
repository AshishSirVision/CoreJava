/**
 * In this lecture, we will learn
 * 
 *
 */
package pack17_objectclass;
class Emp1 implements Cloneable
{
	int id;
	String name;
	public Emp1(int i, String string) {
		id=i;
		name=string;                                                 
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "Emp1 [id=" + id + ", name=" + name + "]";
	}
	
	
}                                                                                                                                                                              

public class ToStringDemo {
	public static void main(String[] args) {
		Emp1 obj=new Emp1(111,"tom");
		Emp1 obj1=null;
		try {
			 obj1=(Emp1) obj.clone();
		} catch (CloneNotSupportedException e) {
		
		}
		System.out.println(obj);
		System.out.println(obj1);
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */