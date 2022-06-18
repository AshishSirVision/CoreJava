package operators;

public class IncrementDecrementOperator {
	public static void main(String[] args) {
	int i=2;
		System.out.println(i++);//2//post increment
		System.out.println(i);//3
		i++;
		i++;
		i++;
		System.out.println(i);//6
		
		
		//-----------------------------
		System.out.println(i--);//6//post decrement
		System.out.println(i);//5
		i--;
		i--;
		i--;
		System.out.println(i);//2
		

		//-----------------------------
		System.out.println(--i);//1//pre decrement
		
	}
}
