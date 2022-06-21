/**
 * In this lecture, we will learn
 * 
 *
 */
package pack20_multithreading;
//without multithreading
public class ProgramMain1 {
	

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		
			
		}
	}
	
	public static void main(String[] args) {
		ProgramMain1 obj1=new ProgramMain1();
		obj1.run();
		ProgramMain1 obj2=new ProgramMain1();
		obj2.run();
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */