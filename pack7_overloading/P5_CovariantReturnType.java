/**
 * In this lecture, we will learn
 * 
 *
 */
package pack7_overloading;
class Animal
{
	public Animal display() {
		System.out.println("this is single line of the method ");
		return this;
	}
	void meth1()
	{
	
		System.out.println("dummy method animal");
	}
}
class Dog extends Animal
{
	@Override
	public Animal display() {
		System.out.println("this is single line of the method ");
		return this;
	}
	void meth1()
	{
	
		System.out.println("dummy method  dog");
	}
}
class BabyDog extends Dog
{
	@Override
	public Animal display() {
		System.out.println("this is single line of the method BabyDog");
		return this;
	}
	void meth1()
	{
	
		System.out.println("dummy method baby dog");
	}
}

public class P5_CovariantReturnType {
	public static void main(String[] args) {
		BabyDog obj1= new BabyDog();
		obj1.display().meth1();;
	}
}
/**
 * Notes Conclusion
 * 
 *
 */