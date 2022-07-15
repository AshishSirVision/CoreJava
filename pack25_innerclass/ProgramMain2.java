/**
 * In this lecture, we will learn
 * 
 *
 */
package pack25_innerclass;


class TestMemberOuter2
{
	private int data=301;
	class Inner
	{
		 void display() {
			System.out.println(data);
		}
	}
}

 public class ProgramMain2 {
	public static void main(String[] args) {

		TestMemberOuter2 objouter = new TestMemberOuter2();
		TestMemberOuter2.Inner objinner = objouter.new Inner();
		objinner.display();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */