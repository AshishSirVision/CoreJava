/**
 * In this lecture, we will learn
 * 
 *
 */
package pack25_innerclass;

abstract class Person {
	abstract void eat();
}

public class TestAnonymousInner {
	public static void main(String[] args) {
		Person obj1 = new Person() {
			@Override
			void eat() {
				System.out.println("eating");
			}
		};
		obj1.eat();
		obj1.eat();
				

		new Person() {

			@Override
			void eat() {
				System.out.println("eating food");

			}
		}.eat();
		

	}
}
/**
 * Notes Conclusion
 * 
 *
 */