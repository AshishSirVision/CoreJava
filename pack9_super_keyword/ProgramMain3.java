/**
 * In this lecture, we will learn
 * 
 *
 */
package pack9_super_keyword;

class Shape3 {
	String color = "blue";
	Shape3() {
		System.out.println(color);
		
	}
}

class Circle3 extends Shape3 {
	String color="Yellow";
	public Circle3() {
		super();
		System.out.println(color);
		
		
	}
}

public class ProgramMain3 {
	public static void main(String[] args) {
		//Circle3 obj=
				new Circle3();
	
	}
}
/**
 * Notes Conclusion
 * 
 *
 */