/**
 * In this lecture, we will learn
 * single inheritance
 *
 */
package pack5_inheritance;

class Animals {
	public void eat() {
		System.out.println("eating..............");
	}
}

class Dog extends Animals {
	public void bark() {
		System.out.println("barking");
	}
}

public class ProgramMain6 {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.bark();
		obj.eat();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */