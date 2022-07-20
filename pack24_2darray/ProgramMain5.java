/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_2darray;

import java.util.Scanner;

public class ProgramMain5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int rsize = sc.nextInt();
		System.out.println("Enter the column size ");
		int csize = sc.nextInt();
		int personid[][] = new int[rsize][csize];
		for (int i = 0; i < personid.length; i++) {
			for (int j = 0; j < personid[i].length; j++) {
				System.out.println("Enter the data at pos " + i + "," + j);
				personid[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < personid.length; i++) {
			for (int j = 0; j < personid[i].length; j++) {
				System.out.print(personid[i][j] + "\t");// 111
			}
			System.out.println();
		}
	}
}
/**
 * Notes Conclusion
 * 
 *
 */