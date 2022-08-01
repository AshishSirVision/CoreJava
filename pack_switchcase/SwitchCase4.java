package pack_switchcase;

import java.util.Scanner;

public class SwitchCase4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
//		System.out.println(num%2);
		switch (num%2) {
		case 1:
			System.out.println("odd");
			break;
	
		case 0:
			System.out.println("even");
		
		}

	}
}
