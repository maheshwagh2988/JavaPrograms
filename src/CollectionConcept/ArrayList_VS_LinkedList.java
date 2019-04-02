package CollectionConcept;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
//ArrayList and LinkedList both implements List interface and maintains insertion order. Both are non synchronized classes.
import java.util.LinkedList;

public class ArrayList_VS_LinkedList {

	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Tom");  // Index 0
		ar.add("BEN"); // Index 1
		ar.add("Ricky"); // Index 2
		//so maintains insertion order here "Gaurav" will add 1st Index
		ar.add(1, "Naveen");   
		System.out.println(ar);
		
	
		System.out.println("\n************************\n");
		
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Tom");
		ll.add("BEN");
		ll.add("Ricky");
		ll.add("Tom");
		//so maintains insertion order here "Gaurav" will add 1st Index
		 ll.add(1, "Gaurav");   
		System.out.println(ll);
		//Adding an element from first and Last Position in the list  
		//Removing an element from first and Last Position in the list  
		//Reverse a list of elements using descendingIterator() Method
		 ll.addFirst("Lokesh"); 
		 System.out.println(ll);
		 
		 //Difference here Traversing the list of elements in reverse order
		 
		 //Linked list we have descendingIterator method where in ArrayList we have hasPrevious() and previous() Method
		 
		 Iterator<String> it=ll.descendingIterator();
         while(it.hasNext()){
       	  System.out.println(it.next());
         }
         System.out.println("*********\nPrint in Before");
         ListIterator<String> it1=ar.listIterator();
 		 while(it1.hasNext()){
 	    	System.out.println(it1.next());
 		 }
 		 System.out.println("*********\nPrint in Reverser");
 		 while (it1.hasPrevious()){
 		 System.out.println(it1.previous());
 		}
 		 
 				
	}

}
