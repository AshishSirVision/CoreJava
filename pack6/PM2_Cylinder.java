/**
 * In this lecture, we will learn
 * 
 *
 */
package pack6;

public class PM2_Cylinder extends Operation {
	float pi = 3.14f;
	double h=4.56;
	Operation ob;// reference variable aggregation

	private void area(int r) {
		ob = new Operation();// binding object to reference variable
		System.out.println(pi * ob.square(r)*h);
	}

	public static void main(String[] args) {
		PM2_Cylinder obj=new PM2_Cylinder();
		obj.area(5);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */