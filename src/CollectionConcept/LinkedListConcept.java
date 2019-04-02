package CollectionConcept;

import java.util.Iterator;
import java.util.LinkedList;
//Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure.
//Java LinkedList class can contain duplicate elements.
//Java LinkedList class maintains insertion order.
//Java LinkedList class is non synchronized.
//In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//Java LinkedList class can be used as a list, stack or queue.

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Tom");
		ll.add("BEN");
		ll.add("Ricky");
		ll.add("Tom");
		ll.add(null);
		
	
		System.out.println(ll); //Print the LinkedList
		//Traverse Data one by one using Iterator
		 Iterator<String> itr=ll.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  //Print or get Values using Index
		   System.out.println(ll.get(2));
		  
		   //Print or set Values using Index
		   ll.set(0, "Mahesh");
		   System.out.println(ll);

		   //so maintains insertion order here "Gaurav" will add 1st Index
		  ll.add(1, "Gaurav");   
		  System.out.println(ll);
		  		  
		 //Adding an element at the first position  
		  ll.addFirst("Lokesh"); 
		  System.out.println(ll); 
		  
		  //Adding an element at the last position
		  ll.addLast("Harsh"); 
		  System.out.println(ll);   
		  
	      //Removing specific element from ArrayList  
		  ll.remove("Gaurav"); 
		  System.out.println(ll);  
		  
	       //Removing element on the basis of specific position 
	      ll.remove(0);  
	      System.out.println(ll);  
	      
	     //Removing first element from the list  
          ll.removeFirst();  
          System.out.println(ll);  
          
         //Removing Last element from the list  
          ll.removeLast();  
          System.out.println(ll); 
          
          System.out.println("\n*********Reverse a list of elements using descendingIterator() Method *********");
                    
          // Reverse a list of elements
           LinkedList<String> ll1=new LinkedList<String>();  
          ll1.add("Ravi");  
          ll1.add("Vijay");  
          ll1.add("Ajay");  
          System.out.println("Before Revers List Actual List is: "+ll1);
          //Traversing the list of elements in reverse order  
          Iterator<String> i=ll1.descendingIterator();
          while(i.hasNext()){
        	  System.out.println(i.next());
          }
          System.out.println("\n*********Print Values using While loop *********");
          int num=0;
          while(ll1.size()>num ){
        	  System.out.println(ll1.get(num));
        	  num++;
          }

	}

}
