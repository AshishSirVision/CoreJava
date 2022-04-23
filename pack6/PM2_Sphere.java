/**
 * In this lecture, we will learn
 * 
 *
 */
package pack6;

public class PM2_Sphere {
	float pi = 3.14f;
	Operation ob;// reference variable aggregation

	private void area(int r) {
		ob = new Operation();// binding object to reference variable
		System.out.println(pi * ob.cube(r));
	}

	public static void main(String[] args) {
		PM2_Sphere obj=new PM2_Sphere();
		obj.area(5);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */