/**
 * In this lecture, we will learn
 * 
 *
 */
package pack21_fh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProgramMain1 {
	public static void main(String[] args) {
		try {
			FileOutputStream obj=new FileOutputStream("demofile.txt");
			for (int i = 65; i < 122; i++) {
				
			
			obj.write(i);
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