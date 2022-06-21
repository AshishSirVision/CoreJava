/**
 * In this lecture, we will learn
 * 
 *
 */
package pack20_multithreading;
//Understanding the problem without Synchronization
class Resourse			//TablePrint
{
	
	void printTable(int n)
	{
		for (int i = 1; i <=10; i++) {
			System.out.println(i+" * "+n+" = "+(i*n )); 	
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("sleep exception : "+e);
			}
		}
	}
}

class MyThread1 extends Thread   //Sumesh
{
	private Resourse obj;
	public MyThread1(Resourse obj) {
		this.obj=obj;
	}

	@Override
	public void run() {
		obj.printTable(5);
	}
}

class MyThread2 extends Thread   //Krishnandan
{
	private Resourse obj;
	public MyThread2(Resourse obj) {
		this.obj=obj;
	}

	@Override
	public void run() {
		obj.printTable(4);
	}
}


class MyThread3 extends Thread   //Raj
{
	private Resourse obj;
	public MyThread3(Resourse obj) {
		this.obj=obj;
	}

	@Override
	public void run() {
		obj.printTable(7);
	}
}








public class ProgramMain4 {
	public static void main(String[] args) {
		Resourse obj=new  Resourse();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		MyThread3 t3=new MyThread3(obj);
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