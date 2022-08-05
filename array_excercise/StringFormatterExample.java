package array_excercise;

import java.util.Formatter;

public class StringFormatterExample {
	public static void main(String[] args) {
		Formatter fmt=new Formatter();
		String s="Number";
		//1D array create 
		int num[] = { 10, 21, 13, 4, 15, 6, 27, 8, 19 };
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+", ");
		}
		System.out.println("");
		
		fmt.format("%15s %15s %15s \n", s,"Square","Cube");
		//display using for each loop
		for (int n : num) {
			fmt.format("%14s %14s %14s \n", n,n*n,n*n*n);
			
		}
		System.out.println(fmt);
		System.out.printf("%5s %10s %10s %8s %20s %17s\n", "EMPLOYEE ID", "NAME", "GENDER", "AGE", "E-MAIL ID", "SALARY");
		System.out.format("%7s %14s %7s %10s %25s %13s\n", 111, "tom", "Male", 15, "tom@gmail.com", 343434.4f);  
		System.out.format("%7s %14s %7s %10s %25s %13s\n", 111, "tom", "Male", 15, "tom@gmail.com", 343434.4f);  
		System.out.format("%7s %14s %7s %10s %25s %13s\n", 111, "tom", "Male", 15, "tom@gmail.com", 343434.4f);  
		System.out.format("%7s %14s %7s %10s %25s %13s\n", 111, "tom", "Male", 15, "tom@gmail.com", 343434.4f);  
		System.out.format("%7s %14s %7s %10s %25s %13s\n", 111, "tom", "Male", 15, "tom@gmail.com", 343434.4f);  
		System.out.format("%7s %14s %7s %10s %25s %13s\n", 111, "tom", "Male", 15, "tom@gmail.com", 343434.4f);  
		System.out.format("%7s %14s %7s %10s %25s %13s\n", 111, "tom", "Male", 15, "tom@gmail.com", 343434.4f);  
		
		System.out.println();  
	}
}
