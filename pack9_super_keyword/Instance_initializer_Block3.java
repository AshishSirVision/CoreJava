/**
 * In this lecture, we will learn
 * 
 *
 */
package pack9_super_keyword;
class Vechile
{
	{
		System.out.println("Block Vechile");
	}
	public Vechile() {
	  System.out.println("Vehcile constructor ");
	}
}
class Bike8 extends Vechile {
	int speed;

	Bike8() {

		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
		speed++;
		speed = speed + 89;
	}
}

public class Instance_initializer_Block3 {
	public static void main(String args[]) {
		Bike8 b1 = new Bike8();
		Bike8 b2 = new Bike8();
	}
}