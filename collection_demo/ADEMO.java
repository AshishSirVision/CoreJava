package collection_demo;

import java.util.ArrayList;
import java.util.List;

import pack16_encapsulation.Student;

public class ADEMO {
	public static void main(String[] args) {
		//collections take raw type data
		List a = new ArrayList();
		a.add(111);
		a.add("tom");
		a.add(true);
		a.add(544.45f);
		a.add(new Integer(111));
		a.add(new String("abc"));
		a.add(new Student());

		// collections with generic
		List<Float> a1 = new ArrayList<Float>();
		//a1.add(111);
		//a1.add("tom");
		//a1.add(true);
		a1.add((float)544);
		a1.add(Float.parseFloat("23"));
		a1.add(new Float(133));
		

		System.out.println(a);
		System.out.println(a1);
	}
}
