/**
 * In this lecture, we will learn
 * 
 *
 */
package pack13_abstractclass_interface;

interface PrintTable1 {
	void print(int t);
	int a=34;
}

class InterfaceProgram1 implements PrintTable1 {

	public void print(int t) {
		for (int i = 1; i < 10; i++) {
			System.out.println(t * i);
		}
	}
}
class InterfaceProgram2 implements PrintTable1 {

	public void print(int t) {
		for (int i = 1; i < 10; i++) {
			System.out.println(t+" * "+i+" = "+(t * i));
		}
	}
}

public class TestProgram {
	public static void main(String[] args) {

		InterfaceProgram1 obj=new InterfaceProgram1();
		obj.print(7);
		
		
		PrintTable1 obj2=new InterfaceProgram2();
		obj2.print(6);
		
		//Anonymous
		PrintTable1 obj3=new PrintTable1() {
			public void print(int t) 
			{
				for (int i = 1; i < 10; i++) {
					System.out.println(t*i);
				}
			}
			
		};
		obj3.print(5);
		/////////////////////
}
}
/**
 * Notes Conclusion
 * 
 *
 */