/**
 * In this lecture, we will learn
 * 
 *
 */
package pack17_objectclass;
class Emp implements Cloneable
{
	int id;
	String name;
	public Emp(int i, String string) {
		id=i;
		name=string;                                                 
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}                                                                                                                                                                              

public class CloneDemo {
	public static void main(String[] args) {
		Emp obj=new Emp(111,"tom");
		Emp obj1=null;
		try {
			 obj1=(Emp) obj.clone();
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