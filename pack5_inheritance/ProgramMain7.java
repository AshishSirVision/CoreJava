/**
 * In this lecture, we will learn
 * single inheritance
 *
 */
package pack5_inheritance;

class Animals1 {
	public void eat() {
		System.out.println("Eating..............");
	}
}

class Dog1 extends Animals1 {
	public void bark() {
		System.out.println("Barking");
	}
}
class BabyDog1 extends Dog1 {
	public void weep() {
		System.out.println("Weep'''''''''''''");
	}
}



public class ProgramMain7 {
	public static void main(String[] args) {
		BabyDog1 obj = new BabyDog1();
		obj.bark();
		obj.eat();
		obj.weep();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */