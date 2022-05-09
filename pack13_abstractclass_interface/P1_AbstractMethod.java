/**
 * In this lecture, we will learn
 * 
 *
 */
package pack13_abstractclass_interface;


abstract class Bike4 {
	public abstract void run();//abstract
	public void runsuperfast() {
		System.out.println("Bike4 Running.....");
	}
	public void runfast() {
		System.out.println("Bike4 Running......");
	}
}

class Apachee4 extends Bike4 {
	public void run() {
		System.out.println("Bike4 Running...... Apachee4");
	}
}

class BMW4 extends Bike4{
	public void run() {
		 
	}
	public void runsuperfast() {
		System.out.println("Bike4 Running......BMW");
	}
}

class Yama4 extends Bike4 {
	public void run() {
		 
	}
	public void runfast() {
		System.out.println("Bike4 Running......Yama");
	}
}


public class P1_AbstractMethod {
	public static void main(String[] args) {
		//create reference variable of parent class
		Bike4 refvar;
		//assign object to the super class reference variable
		refvar=new Apachee4();
		//call run method using refvar
		refvar.run();//it call  overriden method of child class
		refvar=new Yama4();
		//call run method using refvar
		refvar.runfast();//it call  overriden method of child class
		refvar=new BMW4();
		//call run method using refvar
		refvar.runsuperfast();//it call  overriden method of child class
	}
}
/**
 * Notes Conclusion
 * 
 *
 */