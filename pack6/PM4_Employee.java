/**
 * In this lecture, we will learn
 * 
 *
 */
package pack6;

public class PM4_Employee {

	int id;
	String name;
	Address address;
	public PM4_Employee(int id,String name,Address address ) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	public void display() {
		System.out.println(id+", "+name+", "+address.city + ", " + address.state + ", " + address.country);

	}

	public static void main(String[] args) {
		Address a = new Address("Mumbai", "Maharastra", "India");
		PM4_Employee anurag = new PM4_Employee(111,"anurag",a);
		PM4_Employee gaurav = new PM4_Employee(112,"gaurav",a);
		
		anurag.display();
		gaurav.display();
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */