/**
 * In this lecture, we will learn
 * 
 *
 */
package pack25_innerclass;

class TestMemberOuter1
{
	private int data=301;
	class Inner
	{
		 void display() {
			System.out.println(data);
		}
	}
}

 public class ProgramMain1 {
	public static void main(String[] args) {

		TestMemberOuter1 objouter = new TestMemberOuter1();
		TestMemberOuter1.Inner objinner = objouter.new Inner();
		objinner.display();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */