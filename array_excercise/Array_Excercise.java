package array_excercise;

public class Array_Excercise {
	public static void main(String[] args) {
		int matrix1[][] = { { 1, 2, 3, 4 }, { 11, 21, 31, 14 }, { 111, 23, 33, 43 }, { 71, 27, 73, 74 } };
		int even[] = new int[16];
		int odd[] = new int[16];
		int e = 0, o = 0;
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1.length; j++) {

				if (matrix1[i][j] % 2 == 1) {

					even[e] = matrix1[i][j];
					e++;
					// System.out.println(matrix1[i][j]);
				}
				if (matrix1[i][j] % 2 == 0) {
					odd[o] = matrix1[i][j];
					o++;
					// System.out.println(matrix1[i][j]);
				}

			}
		}
		for (int i = 0; i < odd.length; i++) {
			System.out.print("  "+odd[i]);
		}
		System.out.println();
		for (int i = 0; i < odd.length; i++) {
			System.out.print("  "+even[i]);
		}

	}
}
