/**
 * In this lecture, we will learn
 * 
 *
 */
package pack18_2Darray;



public class ProgramMain3 {
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3, 4, 3, 4, 4, 5, 5 }, { 43, 3, 6, 7, 8, 11, 21, 31, 1 } };

		System.out.println(matrix.length);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
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