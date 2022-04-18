/**
 * In this lecture, we will learn
 * Program of the counter without static variable

 *
 */
package pack3;

class Facebook {
	static int noofuser = 0;
	 int userlogincount;

	public Facebook() {
		noofuser++;
		System.out.println(noofuser);
	}

	public void login() {
		userlogincount++;
		System.out.println("user login status : "+userlogincount);
	}
}

public class ProgramMain4 {
	public static void main(String[] args) {
Facebook obj1=new Facebook();//person 1 create account in facebook
obj1.login();
obj1.login();
obj1.login();
obj1.login();
obj1.login();
Facebook obj2=new Facebook();
obj2.login();
Facebook obj3=new Facebook();
Facebook obj4=new Facebook();
Facebook obj5=new Facebook();
	}
}
/**
 * Notes Conclusion
 * 
 *
 */