/**
 * In this lecture, we will learn
 * 
 *
 */
package pack21_fh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class ProgramMain2 {
	public static void main(String[] args) {
		try {
			FileInputStream obj = new FileInputStream("demofile.txt");
			for (int i = 0; i < 50; i++) {

				System.out.print((char) obj.read() + ", ");
			}
			obj.close();

		} catch (FileNotFoundException e) {
			System.out.println("file not found ");
		} catch (IOException e) {
			System.out.println("Input output exception");
		}
	}
}
/**
 * Notes Conclusion
 * 
 *
 */