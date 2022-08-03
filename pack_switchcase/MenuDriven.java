package pack_switchcase;

import java.util.Scanner;
class A
{
	static void southIndianFood()
	{
		System.out.println("You get:");
		System.out.println("Idli : 2 Pieces:");
		System.out.println("Butter Cheese Dosa : 1 Pieces:");
		System.out.println("Vada : 2 Pieces:");
	}
	static void northIndianFood()
	{	
		System.out.println("You get:");
	System.out.println("Chole Bhature : 2 Pieces:");
	System.out.println("Litti Chokha : 4 Pieces:");
	}
}


public class MenuDriven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("To order South Indian Dish, Enter 1");
		System.out.println("To order North Indian Dish, Enter 2");
		System.out.println("To order Rajasthani Dish, Enter 3");
		System.out.println("To order Gujrati Dish, Enter 4");
		System.out.println("To order Bengali Dish, Enter 5");
		System.out.println("To order Desserts, Enter 6");
		System.out.println("To Exit, Enter 9");
		System.out.println();

		while (true) {

			
			System.out.println("Enter your choice::");
			int kb = scan.nextInt();

			switch (kb) {
			case 1:
				System.out.println("Welcome to South Indian Food Court");
				A.southIndianFood();//method call
				break;
			case 2:
				System.out.println("Welcome to North Indian Food Court");
				A.northIndianFood();
				break;
				
			case 9:
				System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
			
		}
	}
}
