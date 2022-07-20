/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_2darray;

public class ProgramMain2 {
	public static void main(String[] args) {
		int personid[][] = new int[][] { 
			{ 11,2, 115, 119, 141, 141 },
			{ 11,1, 112, 113, 114, 115 },
			{ 1,12, 115, 119, 141, 141 },
			{ 11,2, 115, 119, 141, 141 }
			};
		for (int i = 0; i <=3; i++) {
			System.out.print(personid[i][0] + "\t");// 111
			System.out.print(personid[i][1] + "\t");// 111
			System.out.print(personid[i][2] + "\t");// 111
			System.out.print(personid[i][3] + "\t");// 111
			System.out.print(personid[i][4] + "\t");// 111
			System.out.println(personid[i][5]);// 112

		}

	}
}
/**
 * Notes Conclusion
 * 
 *
 */