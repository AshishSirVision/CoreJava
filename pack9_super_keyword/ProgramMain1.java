/**
 * In this lecture, we will learn
 * 
 *
 */
package pack9_super_keyword;

class Shape {
	String color = "blue";
	
}

class Circle extends Shape {
	String color="Yellow";
	public void displ() {
		System.out.println(color);
		System.out.println(super.color);
		
	}
}

public class ProgramMain1 {
	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.displ();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */