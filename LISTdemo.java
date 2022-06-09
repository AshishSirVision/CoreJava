import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LISTdemo {
	public static void main(String[] args) {
		List obj1=new ArrayList();
		List obj2=new LinkedList();
		List obj3=new Stack();
		List obj4=new Vector();
		
		ArrayList obj5=new ArrayList();
		LinkedList obj6=new LinkedList();
		Stack obj7=new Stack();
		Vector obj8=new Vector();
		
		obj1.add(111);
		obj1.add("tom");
		obj1.add(true);
		obj1.add(24345.65f);
		obj1.add(94894843834l);
		
		System.out.println(obj1);
		
		
		
	}
}
