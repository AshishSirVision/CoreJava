/**
 * In this lecture, we will learn
 * 
 *
 */
package pack20_sync;

//Understanding the problem without Synchronization
class Resourse // TablePrint
{

	synchronized void printTable(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + n + " = " + (i * n));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("sleep exception : " + e);
			}
		}

	}
}

public class SyncAnnonymous {
	public static void main(String[] args) {
		final Resourse obj = new Resourse();
		Thread t1 = new Thread() {
			public void run() {
				obj.printTable(4);
			};
		};
		Thread t2 = new Thread()  {
			public void run() {
				obj.printTable(5);
			};
		};
		Thread t3 = new Thread() {
			public void run() {
				obj.printTable(6);
			};
		};

		t1.start();
		t2.start();
		t3.start();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */