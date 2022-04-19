/**
 * In this lecture, we will learn
 * MultiLevel Inheritance
 *
 */
package pack5_inheritance;
class Shape1
{
	int length;
	int breath;
}
class Rectangle1 extends Shape1
{
	void setData()
	{
		length=12;
		breath=89;
	}
}
class AnotherClass extends Rectangle1
{
	void area()
	{
		System.out.println("area of rectangle : "+length*breath);   
	}
}


public class ProgramMain2 {
public static void main(String[] args) {
	AnotherClass obj=new AnotherClass();
	obj.setData();
	obj.area();
}
}
/**
 * Notes Conclusion
 * 
 *
 */