/**
 * In this lecture, we will learn
 * Single Inheritance
 *
 */
package pack5_inheritance;
class Shape
{
	int length=12;
	int breath=67;
}
class Rectangle extends Shape
{
	void area()
	{
		System.out.println("area of rectangle : "+length*breath);   
	}
}


public class ProgramMain1 {
public static void main(String[] args) {
	Rectangle obj=new Rectangle();
	obj.area();
}
}
/**
 * Notes Conclusion
 * 
 *
 */