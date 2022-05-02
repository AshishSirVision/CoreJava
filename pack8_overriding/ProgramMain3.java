/**
 * In this lecture, we will learn
 * 
 *
 */
package pack8_overriding;

class RBIBAnk {
	public  void getRateOfInterest() {
		System.out.println("getRateOfInterest");
	}
}

class SBI1 extends RBIBAnk {
	public  void getRateOfInterest() {
		System.out.println("getRateOfInterest SBI");
	}
}

class ICICI extends RBIBAnk {
	public  void getRateOfInterest() {
		System.out.println("getRateOfInterest ICICI");
	}
}

class HDFC extends RBIBAnk {
	public void getRateOfInterest() {
		System.out.println("getRateOfInterest HDFC");
	}
}

public class ProgramMain3 {
	public static void main(String[] args) {
		SBI1 os1 = new SBI1();
		os1.getRateOfInterest();
		ICICI oi1 = new ICICI();
		oi1.getRateOfInterest();

		HDFC oh1 = new HDFC();
		oh1.getRateOfInterest();

		
		//dynamic method dispatch
		//using parent class reference variable we can call overridden method of child class
		
		RBIBAnk refvar;
		refvar=os1;//reference variable of parent class hold the child class object
		refvar.getRateOfInterest();
		refvar=oi1;
		refvar.getRateOfInterest();
		
		refvar=oh1;
		refvar.getRateOfInterest();
		
		
		
		
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */