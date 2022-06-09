/**
 * In this lecture, we will learn
 * 
 *
 */
package pack17_objectclass;

import pack16_encapsulation.Student;

public class P1 {
	public static void main(String[] args) {
		Object obj=getObject();
		System.out.println("Hello");
	}

	private static Object getObject() {
		
		return new Student();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */