/**
 * In this lecture, we will learn
 * 
 *
 */
package pack24_2darray;

public class ProgramMain1 {
	public static void main(String[] args) {
		int personid[][] = new int[][] 
		{ 
			{ 111, 112, 113,114,115},
			{112,115,119,141,141}
			};
		System.out.print(personid[0][0]+"\t");//111
		System.out.print(personid[0][1]+"\t");//111
		System.out.print(personid[0][2]+"\t");//111
		System.out.print(personid[0][3]+"\t");//111
		System.out.println(personid[0][4]);//112
		
		System.out.print(personid[1][0]+"\t");//112
		System.out.print(personid[1][1]+"\t");//112
		System.out.print(personid[1][2]+"\t");//119
		System.out.print(personid[1][3]+"\t");//112
		System.out.println(personid[1][4]);//112
	}
}
/**
 * Notes Conclusion
 * 
 *
 */