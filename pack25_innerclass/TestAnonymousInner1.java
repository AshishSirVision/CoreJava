/**
 * In this lecture, we will learn
 * 
 *
 */
package pack25_innerclass;

interface Animal {
	void eat();
}

public class TestAnonymousInner1 {
	public static void main(String[] args) {
		Animal obj1 = new Animal() {
			@Override
			public void eat() {
				System.out.println("eating.....");
			}
		};
		obj1.eat();
		obj1.eat();
				

		new Animal() {

			@Override
			public void eat() {
				System.out.println("eating food..........");

			}
		}.eat();
		

	}
}
/**
 * Notes Conclusion
 * 
 *
 */