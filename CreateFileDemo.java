import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
  
/**
 * In this lecture, we will learn
 * 
 *
 */


/**
 * Notes Conclusion
 * 
 *
 */
public class CreateFileDemo {  
    public static void main(String[] args) {  
  for(int i=1;i<=20;i++)
  {
        try {  
        	File f1 = new File("src/pack"+i);  
            //Creating a folder using mkdir() method  
            boolean bool = f1.mkdir();  
            if(bool){  
               System.out.println("Folder is created successfully");  
            }else{  
               System.out.println("Error Found!");  
            } 
            for(int j=1;j<=20;j++)
            {         
            File file = new File(f1+"/ProgramMain"+j+".java");  
            if (file.createNewFile()) {  
            	FileWriter fos=new FileWriter(file);
            	  fos.write("/**\r\n"
            	  		+ " * In this lecture, we will learn\r\n"
            	  		+ " * \r\n"
            	  		+ " *\r\n"
            	  		+ " */\r\n"
            	  		+ ""
            	+"package pack"+i+";\r\n"
            	  		+ "\r\n"
            	  		+ "public class ProgramMain"+j+" {\r\n"
            	  		+ "public static void main(String[] args) {\r\n"
            	  		+ "	\r\n"
            	  		+ "}\r\n"
            	  		+ "}\r\n"
            	  		+ ""
            	  		+"/**\r\n"
            	  		+ " * Notes Conclusion\r\n"
            	  		+ " * \r\n"
            	  		+ " *\r\n"
            	  		+ " */");
            	fos.close();
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists.");  
            }  
        }
        }
        
        catch (IOException e) {  
            e.printStackTrace();  
        }  
  }
    }  
}  