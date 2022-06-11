package collection_demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiffrentWayToTraverse {
	public static void main(String[] args) {
		 List<String> topCompanies = new ArrayList<String>();

	        // Check if an ArrayList is empty
	        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

	        topCompanies.add("Google");
	        topCompanies.add("Apple");
	        topCompanies.add("Microsoft");
	        topCompanies.add("Amazon");
	       
	        topCompanies.add("Facebook");
	        
	        
	       // System.out.println(topCompanies);
	        
//	       Iterator it=topCompanies.iterator();
//	       while(it.hasNext())
//	       {
//	       System.out.println(it.next());
//	       }
//	       
	        
	        
	       
//	       ListIterator it=topCompanies.listIterator(topCompanies.size());
//	       System.out.println(it.previous());
//	        
	      
	        
	        
	        
	        //while loop
//	        int i = 0;
//	        while ( i < topCompanies.size()) {
//				System.out.println(topCompanies.get(i));
//				 i++;
//			}
	        
	        
	      //for loop
//	        for (int i = 0; i < topCompanies.size(); i++) {
//				System.out.println(topCompanies.get(i));
//			} 
	        
	        

//	        for (Iterator iterator = topCompanies.iterator(); iterator.hasNext();) {
//			
//				System.out.println(iterator.next());
//			}
	        
//	        Iterator it = topCompanies.iterator();
//	        while (it.hasNext()) {
//				String d = (String) it.next();	
//				System.out.println(d);
//			}
//	        
	        
//	        Iterator it1 = topCompanies.iterator();
//	        do {
//				String d = (String) it1.next();	
//				System.out.println(d);
//			}while (it1.hasNext());
//	        
	        
	        
//	        //FOR EACH LOOP
//	        for (String string : topCompanies) {
//				System.out.println(string);
//			}
//	        
//	        
//	        Iterator it = topCompanies.iterator();
//	        it.forEachRemaining((elem)->{
//	        	System.out.println(elem);
//	        });
	        
	        
	        topCompanies.forEach((elem)->{
	        	System.out.println(elem);
	        });
	        
	        for (String elem : topCompanies) {
				System.out.println(elem);
			}
	}
}
