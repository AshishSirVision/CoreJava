/**
 * In this lecture, we will learn
 * 
 *
 */
package pack8_overriding;

class Vechile {
	public void run() {
		System.out.println("running Vechile............");

	}
}

 class Bike extends Vechile{
	 public void run() {
			System.out.println("running Bike............");

		}
}
 public class P2
{
	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.run();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */