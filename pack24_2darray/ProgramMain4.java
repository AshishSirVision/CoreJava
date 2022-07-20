/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_2darray;

public class ProgramMain4 {
	public static void main(String[] args) {
		int personid[][] = new int[][] { { 11, 2, 115, 119, 1, 41, 141 }, { 11, 1, 3, 114, 115 },
				{ 1, 1, 2, 11, 5, 1, 1, 9, 14, 1, 141 }, { 11, 2, 11, 5, 11, 9, 141, 1417 } };
		System.out.println(personid.length);
		System.out.println(personid[0].length);

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