/**
 * In this lecture, we will learn
 * 1st implements runnable interface
 * override run method
 * create object of own class
 * pass the object to thread class constructor during object creation
 * using thread object start method
 */
package pack20_multithreading;
//using thread class
public class ProgramMain3 implements Runnable {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			
		}
	}
	
	public static void main(String[] args) {
		//way 1
		ProgramMain3 obj1=new ProgramMain3();
		Thread t1=new Thread(obj1,"Th1");
		t1.start();
		ProgramMain3 obj2=new ProgramMain3();
		Thread t2=new Thread(obj2);
		t2.setName("th2");
		t2.start();
		
		//way 2
		Thread t3=new Thread(new ProgramMain3());
		t3.start();
		//way 3
		new Thread(new ProgramMain3()).start();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */