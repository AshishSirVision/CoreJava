/**
 * In this lecture, we will learn
 * 
 *
 */
package pack9_super_keyword;

class Shape1 {
	String color = "blue";
	public void displ() {
		System.out.println(color);
		
	}
}

class Circle1 extends Shape1 {
	String color="Yellow";
	public void displ() {
		super.displ();
		System.out.println(color);
		
		
	}
}

public class ProgramMain2 {
	public static void main(String[] args) {
		Circle1 obj=new Circle1();
		obj.displ();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */