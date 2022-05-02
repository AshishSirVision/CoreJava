/**
 * In this lecture, we will learn
 * 
 *
 */
package pack8_overriding;

class RBI {
	public void display(int a,int a1) {
		System.out.println("RBI method()"+(a*a1));
	}
}

class SBI extends RBI{
	@Override
	public void display(int a,int b) {
		System.out.println("SBI method()"+(a+b));
	}
}

public class P1_Overriding {
	public static void main(String[] args) {
		SBI obj=new SBI();
		obj.display(2,4 );
	}
}

/**
 * Notes Conclusion
 * 
 *
 */