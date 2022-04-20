/**
 * In this lecture, we will learn
 * Single
 *
 */
package pack1_methods;
abstract class Shape
{
	void draw()
	{
		System.out.println("shapes draw");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		super.draw();
		System.out.println("Rectangle draw");
	}
}





public class ProgramMain8 {
	public static void main(String[] args) {

		//Cannot instantiate the type Shape
//		Shape ob=new Shape();
//		ob.draw();
		Rectangle obj=new Rectangle();
		obj.draw();
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */