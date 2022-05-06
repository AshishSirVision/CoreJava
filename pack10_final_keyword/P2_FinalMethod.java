/**
 * In this lecture, we will learn
 * 
 *
 */
package pack10_final_keyword;
class Shape
{
	public   Shape() {
		// TODO Auto-generated constructor stub
	}
	public  void displa() {
		System.out.println("Hello Shape");
	}
	private void set(final int n) {
		int a;
		
	//	n=n*2;

	}
}
class Triangle extends Shape
{
	@Override    //Cannot override the final method from Shape
	public final void displa() {
		System.out.println("Hello Triangle Shape");
	}
}


public class P2_FinalMethod {
	public static void main(String[] args) {
		Triangle obj=new Triangle();
		obj.displa();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */