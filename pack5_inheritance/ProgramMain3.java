/**
 * In this lecture, we will learn
 * Hierarchical Inheritance
 *
 */
package pack5_inheritance;
class Shape3
{
	int length=12;
	int breath=67;
	int height=4;
}
class Rectangle3 extends Shape3
{
	void area()
	{
		System.out.println("area of rectangle : "+(length*breath));   
	}
}
class Triangle extends Shape3
{
	void area()
	{
		System.out.println("area of Triangle : "+(0.5*length*height));   
	}
}

 
public class ProgramMain3 {
public static void main(String[] args) {
	Triangle obj=new Triangle();
	obj.area();
	Rectangle3 obj2=new Rectangle3();
	obj2.area();
}
}
/**
 * Notes Conclusion
 * 
 *
 */