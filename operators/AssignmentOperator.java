package operators;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a=12;
		int b=7;
		b+=a;//b=b+a
		System.out.println(b);//19
		b-=a;//b=b-a
		System.out.println(b);//7
		b*=a;//b=b*a
		System.out.println(b);//49
		b/=a;//b=b/a
		System.out.println(b);//
		b%=a;//b=b%a
		System.out.println(b);//
	}
}
