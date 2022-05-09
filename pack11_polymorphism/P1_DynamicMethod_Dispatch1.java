/**
 * In this lecture, we will learn
 * 
 *
 */
package pack11_polymorphism;

class Bike1 {
	int speedlimit=90;
	public String run() {
		return "Bike Running......";
	}
}

class Apachee1 extends Bike1 {
	int speedlimit=901;//Rule: Runtime polymorphism can't be achieved by data members
	public String run() {
		return "Bike Running...... Apachee";
	}
}

class BMW1 extends Bike1{
	int speedlimit=190;
	public String run() {
		return "Bike Running......BMW";
	}
}

class Yama1 extends Bike1 {
	int speedlimit=909;
	public String run() {
		return "Bike Running......Yama";
	}
}


public class P1_DynamicMethod_Dispatch1
{
	public static void main(String[] args) {
		//create reference variable of parent class
		Bike1 refvar;
		//assign object to the super class reference variable
		refvar=new Apachee1();
		//call run method using refvar
		System.out.println(refvar.run());//it call  overriden method of child class
		System.out.println(refvar.speedlimit);
		
		refvar=new Yama1();
		//call run method using refvar
		System.out.println(refvar.run());//it call  overriden method of child class
		refvar=new BMW1();
		//call run method using refvar
		System.out.println(refvar.run());//it call  overriden method of child class
	}
}
/**
 * Notes Conclusion
 * 
 *
 */