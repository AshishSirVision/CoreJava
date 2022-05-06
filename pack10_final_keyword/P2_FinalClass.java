/**
 * In this lecture, we will learn
 * 
 *
 */
package pack10_final_keyword;
 class Shape1
{
	public  void displa() {
		System.out.println("Hello Shape");
	}
}
final class Triangle1 extends Shape1  //the type Triangle1 cannot subclass the final class Shape1
{
	@Override    //Cannot override the final method from Shape
	public final void displa() {
		System.out.println("Hello Triangle Shape");
	}
}
 


public class P2_FinalClass {
	public static void main(String[] args) {
		Triangle1 obj=new Triangle1();
		obj.displa();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */