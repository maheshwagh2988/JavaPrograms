package CollectionConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortString_Using_Collections_sort_Method {
	
//The Collection is an interface whereas Collections is a class. 
//The Collection interface provides the standard functionality of data structure to List, Set, and Queue. 
//However, Collections class is to sort and synchronize the collection elements.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alist= new ArrayList<String>();
		alist.add("Rajesh");
		alist.add("Tushar");
		alist.add("Zoman");
		alist.add("Mahesh");
		alist.add("Adesh");
		//Sort these String using Collections.sort(alist) method
		System.out.println("Before Collections.sort() method ArrayList is : "+alist);
		Collections.sort(alist);
		System.out.println("After Collections.sort() method ArrayList is : "+alist);
		
		//sort string objects in reverse order
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("After Collections.reverseOrder() method ArrayList is: "+alist);
		
		//sort Wrapper class objects
		ArrayList<Integer> al=new ArrayList<Integer>();  
		al.add(Integer.valueOf(201));  
		al.add(Integer.valueOf(101));  
		al.add(230);
		//internally will be converted into objects as Integer.valueOf(230) 
		Collections.sort(al);  
		System.out.println(al);
		
		

		
		
	}
	
		

	
	
}
