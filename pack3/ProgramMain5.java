/**
 * In this lecture, we will learn
 * Example of static method

 *
 */
package pack3;

class Facebook1 {
	static int noofuser = 0;
	 int userlogincount;
	 static String name="Tom";
	public Facebook1() {
		noofuser++;
		System.out.println(noofuser);
		
	}

	public static void login() {
		//userlogincount++;
		name="Jerry";
		//System.out.println(name+"user login status : "+userlogincount);
		
	}
}

public class ProgramMain5 {
	public static void main(String[] args) {
Facebook1 obj1=new Facebook1();//person 1 create account in Facebook1
Facebook1.login();
obj1.login();
obj1.login();
obj1.login();
obj1.login();
Facebook1 obj2=new Facebook1();
obj2.login();
Facebook1 obj3=new Facebook1();
Facebook1 obj4=new Facebook1();
Facebook1 obj5=new Facebook1();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */