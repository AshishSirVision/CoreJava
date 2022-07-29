package array_excercise;

import java.util.Iterator;

public class Array1DExcercise {
	public static void main(String[] args) {
		int values[]= {3,4,545,4,6,65,7,5,5,5,7,8,6,4,655,34,45,34 };
		int even[]=new int[20];
		int odd[]=new int[20];
		int bhavik=0;
		int rishabh=0;
		for (int i = 0; i < values.length; i++) {
			if(values[i]%2==0)
			{
//				System.out.println(values[i]);
				even[bhavik]=values[i];
				bhavik++;
			}
			else
			{
//				System.out.println(values[i]);
				odd[rishabh]=values[i];
				rishabh++;
			}
		}
		for (int i = 0; i < even.length; i++) {
			if(even[i]==0)
			{
				break;
			}
			System.out.print(even[i]+", ");
		}
		System.out.println();
		for (int i = 0; i < odd.length; i++) {
			if(odd[i]==0)
			{
				break;
			}
			System.out.print(odd[i]+", ");
		}
		
	}
}
