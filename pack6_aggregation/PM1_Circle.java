/**
 * In this lecture, we will learn
 * 
 *
 */
package pack6_aggregation;



public class PM1_Circle {
	float pi = 3.14f;
	Operation ob;// reference variable aggregation

	private void area(int ra) {
		ob = new Operation();// binding object to reference variable
		System.out.println(pi * ob.square(ra));
	}

	public static void main(String[] args) {
		PM1_Circle obj = new PM1_Circle();
		obj.area(5);
	}
}
/**
 * Notes Conclusion
 * 
 *
 */