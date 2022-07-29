package array_excercise;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList<Integer> values1 = new ArrayList<Integer>();
		Collections.addAll(values1, 13, 0, 45, 4, 6, 65, 71, 51, 51, 15, 17, 8, 6, 4, 655, 34, 45, 34);
		ArrayList<Integer> even1 = new ArrayList<Integer>();
		ArrayList<Integer> odd1 = new ArrayList<Integer>();
		System.out.println(values1.size());
		System.out.println(values1.get(5));

		for (int i = 0; i < values1.size(); i++) {
			if (values1.get(i) % 2 == 0) {
				even1.add(values1.get(i));
			} else {
				odd1.add(values1.get(i));
			}
		}

		System.out.print(even1);

		System.out.println();

		System.out.print(odd1);

	}

}
