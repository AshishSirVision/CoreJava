/**
 * In this lecture, we will learn
 * 1) Method Overloading: changing no. of arguments
In this example, we have created two methods, first add() method performs addition 
of two numbers and second add method performs addition of three numbers.
In this example, we are creating static methods
so that we don't need to create instance for calling method
 *
 */
package pack7_overloading;
class Adder
{
	static int add()
	{
		return 0;
	}
	static int add(int a)
	{
		return a;
	}
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
	static int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	static int product()
	{
		return 0;
	}
	static int product(int a)
	{
		return a;
	}
	static int product(int a,int b)
	{
		return a*b;
	}
	static int product(int a,int b,int c)
	{
		return a*b*c;
	}
	static int product(int a,int b,int c,int d)
	{
		return a*b*c*d;
	}
	
	
}

public class PM1_TestOverloading1 {
	public static void main(String[] args) {
		System.out.println(Adder.add());
		System.out.println(Adder.add(67));
		System.out.println(Adder.add(78,67));
		System.out.println(Adder.add(78,6,7));
		System.out.println(Adder.add());
	
		System.out.println(Adder.product());
		System.out.println(Adder.product(67));
		System.out.println(Adder.product(78,67));
		System.out.println(Adder.product(78,6,7));
		System.out.println(Adder.product());
	}
}
/**
 * Notes Conclusion
 * 
 *
 */