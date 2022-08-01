package pack_switchcase;

public class SwitchCase2 {
	public static void main(String[] args) {
		int num = 15;
		switch (num) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("odd");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("even");
		default:
			System.out.println("1 to 12 only ");

		}

	}
}
