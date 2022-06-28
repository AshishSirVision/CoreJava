/**
 * In this lecture, we will learn
 * 
 *
 */
package pack21;

import java.io.FileWriter;
import java.io.IOException;

public class ProgramMain5 {
	public static void main(String[] args) {
		try {
			FileWriter fwrite = new FileWriter("FileOperationExample.java");
			// writing the content into the FileOperationExample.txt file
			fwrite.write("/**\r\n"
					+ " * In this lecture, we will learn\r\n"
					+ " * \r\n"
					+ " *\r\n"
					+ " */\r\n"
					+ "package pack21;\r\n"
					+ "\r\n"
					+ "import java.io.File;\r\n"
					+ "import java.io.FileNotFoundException;\r\n"
					+ "import java.util.Scanner;\r\n"
					+ "\r\n"
					+ "public class ProgramMain4 {\r\n"
					+ "public static void main(String[] args) {\r\n"
					+ "    File f1 = new File(\"src/pack1_methods/Programmain1.java\");   \r\n"
					+ "    Scanner sc;\r\n"
					+ "	try {\r\n"
					+ "		sc = new Scanner(f1);\r\n"
					+ "		while (sc.hasNextLine()) {\r\n"
					+ "			String fileData = sc.nextLine();  \r\n"
					+ "            System.out.println(fileData);  \r\n"
					+ "	    }\r\n"
					+ "	} catch (FileNotFoundException e) {\r\n"
					+ "		  System.out.println(\"Unexcpected error occurred! \"+e);  \r\n"
					+ "	}\r\n"
					+ "    \r\n"
					+ "}\r\n"
					+ "}\r\n"
					+ "/**\r\n"
					+ " * Notes Conclusion\r\n"
					+ " * \r\n"
					+ " *\r\n"
					+ " */");

			// Closing the stream
			fwrite.close();
			System.out.println("Content is successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
		}
	}
}
/**
 * Notes Conclusion
 * 
 *
 */