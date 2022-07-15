/**
 * In this lecture, we will learn
 * 
 *
 */
package pack25_innerclass;

class LocalInnerClass {
	private String data = "hello inner";

	public void display() {
		class Inner {
			private void msg() {
				System.out.println(data);
			}
		}
		Inner obj = new Inner();
		obj.msg();
	}
}


public class ProgramMain5 {
	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */