/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_2darray;

import java.util.Scanner;

public class ProgramMain6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int rsize = sc.nextInt();
		System.out.println("Enter the column size ");
		int csize = sc.nextInt();

		int matrix1[][] = new int[rsize][csize];
		int matrix2[][] = new int[rsize][csize];
		int matrix3[][] = new int[rsize][csize];

		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.println("Enter the data at pos " + i + "," + j);
				matrix1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.println("Enter the data at pos " + i + "," + j);
				matrix2[i][j] = sc.nextInt();
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		System.out.println("-------------Matrix 1-----------------");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t");// 111
			}
			System.out.println();
		}
		System.out.println("-------------Matrix 2-----------------");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				System.out.print(matrix2[i][j] + "\t");// 111
			}
			System.out.println();
		}

		System.out.println("-------------Matrix 3-----------------");
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				System.out.print(matrix3[i][j] + "\t");// 111
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