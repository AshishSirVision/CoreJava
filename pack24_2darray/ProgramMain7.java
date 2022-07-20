/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_2darray;

import java.util.Scanner;

public class ProgramMain7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size ");
		int rsize = sc.nextInt();
		System.out.println("Enter the column size ");
		int csize = sc.nextInt();

		int matrix1[][] = new int[rsize][csize];
		int sum = 0;
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.println("Enter the data at pos " + i + "," + j);
				matrix1[i][j] = sc.nextInt();
				sum = sum + matrix1[i][j];
				System.out.println("sum="+sum);
			}
		}

		System.out.println("-------------Matrix 1-----------------");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t");// 111
			}
			System.out.println();
		}
		System.out.println("sum of matrix elements :"+sum);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */