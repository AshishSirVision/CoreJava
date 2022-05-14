/**
 * In this lecture, we will learn
 * 
 *
 */
package pack13_abstractclass_interface;
interface PrintTable
{
   void print(int t);
}


public class InterfaceProgram implements PrintTable {
	public static void main(String[] args) {

		InterfaceProgram obj=new InterfaceProgram();
		obj.print(8);
		
		
		PrintTable obj2=new InterfaceProgram();
		obj2.print(8);
		
		//Anonymous
		PrintTable obj3=new PrintTable() {
			public void print(int t) 
			{
				for (int i = 1; i < 10; i++) {
					System.out.println(t*i);
				}
			}
			
		};
		obj3.print(8);
		/////////////////////
		
	}

	
	public void print(int t) 
	{
		for (int i = 1; i < 10; i++) {
			System.out.println(t*i);
		}
	}
}
/**
 * Notes Conclusion
 * 
 *
 */