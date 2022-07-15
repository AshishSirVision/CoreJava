/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_array;

import java.util.Scanner;

public class ProgramMain9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of array :");
		int size = sc.nextInt();
		
		
		String vivek[];// declare reference of array
		vivek = new String[size];// initialization

		for (int i = 0; i < vivek.length; i++) {

			System.out.println("ENter the elements :");
			vivek[i] = sc.next();
		}

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