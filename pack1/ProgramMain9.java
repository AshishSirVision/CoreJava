/**
 * In this lecture, we will learn
 *    abstract method
 *
 */
package pack1;
abstract class Shape1
{
	abstract void draw();
}
class Rectangle1 extends Shape1
{
	void draw()
	{
		
		System.out.println("Rectangle draw");
	}
}





public class ProgramMain9 {
	public static void main(String[] args) {

		//Cannot instantiate the type Shape
//		Shape ob=new Shape();
//		ob.draw();
		Rectangle1 obj=new Rectangle1();
		obj.draw();
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */