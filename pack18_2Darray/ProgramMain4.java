/**
 * In this lecture, we will learn
 * 
 *
 */
package pack18_2Darray;

public class ProgramMain4 {
	public static void main(String[] args) {
		int matrix[][] = { { 11, 2, 3, 4 }, { 11, 12, 13, 14, 5, 6, 7, 8 }, { 1, 2, 3, 4 } };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]%2==1) {
					System.out.print(0+" ");
				} else {
					System.out.print(matrix[i][j] + " ");
				}
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