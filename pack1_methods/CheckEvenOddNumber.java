package pack1_methods;

import java.util.Iterator;

public class CheckEvenOddNumber {
	
	public  void  dis(int y)
	{
		int year = y;
		if (year % 4 == 0) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");
		}
	}
	
	
	public static void main(String[] args) {
		CheckEvenOddNumber obj=new CheckEvenOddNumber();
		obj.dis(2019);
		obj.dis(2017);
		obj.dis(2087);
		obj.dis(2067);
		
	}
}
