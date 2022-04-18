/**
 * In this lecture, we will learn
 * 
 *
 */
package pack4;

class B {
	
	public B(ProgramMain9 ob) {
		System.out.println(ob.data);
	}
}

public class ProgramMain9 {

	int data = 10;

	public ProgramMain9() {
		B obj = new B(this);
		//obj.display();
	}

	public static void main(String[] args) {
ProgramMain9 s1=new ProgramMain9();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */