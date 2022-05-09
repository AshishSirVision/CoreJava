/**
 * In this lecture, we will learn
 * 
 *
 */
package pack11_polymorphism;

class Bike {
	public void run() {
		System.out.println("Bike Running......");
	}
}

class Apachee extends Bike {
	public void run() {
		System.out.println("Bike Running...... Apachee");
	}
}

class BMW extends Bike{
	public void run() {
		System.out.println("Bike Running......BMW");
	}
}

class Yama extends Bike {
	public void run() {
		System.out.println("Bike Running......Yama");
	}
}


public class P1_DynamicMethod_Dispatch {
	public static void main(String[] args) {
		//create reference variable of parent class
		Bike refvar;
		//assign object to the super class reference variable
		refvar=new Apachee();
		//call run method using refvar
		refvar.run();//it call  overriden method of child class
		refvar=new Yama();
		//call run method using refvar
		refvar.run();//it call  overriden method of child class
		refvar=new BMW();
		//call run method using refvar
		refvar.run();//it call  overriden method of child class
	}
}
/**
 * Notes Conclusion
 * 
 *
 */