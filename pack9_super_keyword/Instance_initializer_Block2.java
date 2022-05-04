/**
 * In this lecture, we will learn
 * 
 *
 */
package pack9_super_keyword;

class Bike7 {
	int speed;

	Bike7() {
		
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
		speed++;
		speed=speed+89;
	}
}
	public class Instance_initializer_Block2
	{
	public static void main(String args[]) {
		Bike7 b1 = new Bike7();
		Bike7 b2 = new Bike7();
	}
}