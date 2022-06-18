/**
 * In this lecture, we will learn
 * 
 *
 */
package pack19_exceptionhandling;

//Nested try Block
public class ProgramMain14 {
	public static void main(String[] args) {
		try {

			try {

				try {
					System.out.println("going to divide by 0" + args[0]);
					int b = 39 / 0;
				} catch (ArithmeticException e) {
					System.out.println("inner block first inner try" + e);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inner block first try"+e);
			}

			try {
				System.out.println("going to check array index");
				int b[] = { 12, 45, 65, 7 };
				b[8] = 89;
				System.out.println("b[8]= " + b[8]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("inner block second try " + e);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("outer block " + e);
		}
	}
}
/**
 * Notes Conclusion
 * 
 *
 */