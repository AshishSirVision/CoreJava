/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_array;

public class ProgramMain7 {
	public static void main(String[] args) {
		String vivek[];// declare reference of array
		vivek = new String[5];// initialization
		vivek[0]="tom";
		vivek[1]="jerry";
		vivek[2]="bhavik";
		vivek[3]="rishabh";
		vivek[4]="preena";
		
		int i = 0;
		do {
			System.out.println(vivek[i]);
			i++;
		} while (i < vivek.length);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */