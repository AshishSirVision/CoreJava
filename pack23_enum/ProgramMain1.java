/**
 * In this lecture, we will learn
 * 
 *
 */
package pack23_enum;

import java.util.Iterator;

public class ProgramMain1 {
	public static void main(String[] args) {
		System.out.println(CountryCode.SL);
		System.out.println(CountryCode.AUS);
		System.out.println(CountryCode.IND);

		System.out.println(CountryCode.values());
		
		//for each loop
		for (CountryCode c : CountryCode.values()) {
			System.out.println(c);
		}
		
		
	}
}
/**
 * Notes Conclusion
 * 
 *
 */