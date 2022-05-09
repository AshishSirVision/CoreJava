/**
 * In this lecture, we will learn
 * 
 *
 */
package pack11_polymorphism;

class Bike2 {
	int speedlimit=90;
	public String run() {
		return "Bike Running......";
	}
}

class Apachee2 extends Bike2 {
	int speedlimit=902;//Rule: Runtime polymorphism can't be achieved by data members
	public String run() {
		return "Bike Running...... Apachee";
	}
}
class Apachee160 extends Apachee2 {
	int speedlimit=902;//Rule: Runtime polymorphism can't be achieved by data members
	public String run() {
		return "Bike Running...... Apachee160 ";
	}
}


class BMW2 extends Bike2{
	int speedlimit=290;
	public String run() {
		return "Bike Running......BMW";
	}
}

class Yama2 extends Bike2 {
	int speedlimit=909;
	public String run() {
		return "Bike Running......Yama";
	}
}


public class P2_DynamicMethod_Dispatch2
{
	public static void main(String[] args) {
		//create reference variable of parent class
		Bike2 refvar;
		//assign object to the super class reference variable
		refvar=new Apachee160();
		//call run method using refvar
		System.out.println(refvar.run());//it call  overriden method of child class
		System.out.println(refvar.speedlimit);
		
		refvar=new Yama2();
		//call run method using refvar
		System.out.println(refvar.run());//it call  overriden method of child class
		refvar=new BMW2();
		//call run method using refvar
		System.out.println(refvar.run());//it call  overriden method of child class
	}
}
/**
 * Notes Conclusion
 * 
 *
 */