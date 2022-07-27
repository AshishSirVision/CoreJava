/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_2darray;

import java.util.Scanner;

public class ProgramMain8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String vivek[];// declare reference of array
		vivek = new String[5];// initialization
		
		System.out.println("ENter the elements :");
		
		vivek[0] = sc.next();
		System.out.println("ENter the elements :");
		
		vivek[1] =  sc.next();
		System.out.println("ENter the elements :");
		
		vivek[2] =  sc.next();
		System.out.println("ENter the elements :");
		
		vivek[3] = sc.next() ;
		System.out.println("ENter the elements :");
		
		vivek[4] =  sc.next();

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