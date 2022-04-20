/**
 * In this lecture, we will learn
 * Hierarchical inheritance
 *
 */
package pack5_inheritance;

class Animals2 {
	public void eat() {
		System.out.println("Eating..............");
	}
}

class Dog2 extends Animals2 {
	public void bark() {
		System.out.println("Barking");
	}
}
class Cat extends Animals2 {
	public void meown() {
		System.out.println("Weep'''''''''''''");
	}
}

v

public class ProgramMain8 {
	public static void main(String[] args) {
		Cat obj = new Cat();
		//obj.bark();
		obj.eat();
		obj.meown();
		
		Dog2 obj1 = new Dog2();
		obj1.bark();
		obj1.eat();
		//obj1.meown();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */