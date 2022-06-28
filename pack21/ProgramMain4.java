/**
 * In this lecture, we will learn
 * 
 *
 */
package pack21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProgramMain4 {
public static void main(String[] args) {
    File f1 = new File("src/pack1_methods/Programmain1.java");   
    Scanner sc;
	try {
		sc = new Scanner(f1);
		while (sc.hasNextLine()) {
			String fileData = sc.nextLine();  
            System.out.println(fileData);  
	    }
	} catch (FileNotFoundException e) {
		  System.out.println("Unexcpected error occurred! "+e);  
	}
    
	System.out.println(f1.getAbsolutePath());
	System.out.println(f1.getPath());
	System.out.println(f1.getParent());
	try {
		System.out.println(f1.getCanonicalPath());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
/**
 * Notes Conclusion
 * 
 *
 */