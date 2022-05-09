/**
 * In this lecture, we will learn
 * 
 *
 */
package pack13_abstractclass_interface;


abstract class Bike5 {
	public abstract void run();//abstract
	public abstract void runsuperfast();
	public abstract void runfast();
}
class BikeTypeProvider extends Bike5
{

	@Override
	public void run() {
	}

	@Override
	public void runsuperfast() {
	}

	@Override
	public void runfast() {
	}
	
}


class Apachee5 extends BikeTypeProvider {
	public void run() {
		System.out.println("Bike5 Running...... Apachee5");
	}
}

class BMW5 extends BikeTypeProvider{
	public void runsuperfast() {
		System.out.println("Bike4 Running......BMW");
	}
}

class Yama5 extends BikeTypeProvider {
	
	public void runfast() {
		System.out.println("Bike4 Running......Yama");
	}
}


public class P1_AbstractMethod2 {
	public static void main(String[] args) {
		//create reference variable of parent class
		Bike5 refvar;
		//assign object to the super class reference variable
		refvar=new Apachee5();
		//call run method using refvar
		refvar.run();//it call  overriden method of child class
		refvar=new Yama5();
		//call run method using refvar
		refvar.runfast();//it call  overriden method of child class
		refvar=new BMW5();
		//call run method using refvar
		refvar.runsuperfast();//it call  overriden method of child class
	}
}
/**
 * Notes Conclusion
 * 
 *
 */