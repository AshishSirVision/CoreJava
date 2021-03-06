/**
 * In this lecture, we will learn
 * extends the thread class
 *override the run method
 *create object of own class
 *using object start method
 */
package pack20_multithreading;
//using thread class
public class ProgramMain2 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+", "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("sleep exception");
			}
		}
	}
	
	public static void main(String[] args) {
		ProgramMain2 obj1=new ProgramMain2();
		obj1.setName("th1");
		obj1.start();
		ProgramMain2 obj2=new ProgramMain2();
		obj2.start();
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */