package array_excercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;                                                                

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<Integer> values1 = new ArrayList<Integer>();
		Collections.addAll(values1, 13, 0, 45, 4, 6, 65, 71, 51, 51, 15, 17, 8, 6, 4, 655, 34, 45, 34);
		List<Integer> even1 = new LinkedList<Integer>();
		List<Integer> odd1 = new Vector<Integer>();
//for each loop
		for (Integer val : values1) {
			if (val % 2 == 0) {
				even1.add(val);
			} else {
				odd1.add(val);
			}
		}

		System.out.print(even1);

		System.out.println();

		System.out.print(odd1);

	}

}
