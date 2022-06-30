/**
 * In this lecture, we will learn
 * 
 *
 */
package pack21_fh;

import java.io.File;
import java.io.IOException;

public class ProgramMain3 {
	public static void main(String[] args) {
		File ob1=new File("E://demofile22.txt");
		//File obj=new File("src/demofile22.java");
		File obj=new File("src/pack22/demofile22.java");
		try {
			if(obj.createNewFile())
			{
				System.out.println("File " + obj.getName() + " is created successfully.");
			}
			else
			{
				 System.out.println("File is already exist in the directory.");  
			}
		} catch (IOException e) {
			System.out.println("io exception "+e);
		}
		
		
//		System.out.println(obj.canRead());
//		System.out.println(obj.exists());
//		System.out.println(obj.isFile());
//		System.out.println(obj.canExecute());
		//System.out.println(obj.delete());
		
		System.out.println(ob1.isDirectory());
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */