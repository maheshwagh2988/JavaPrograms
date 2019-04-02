package Collection_Queue_Interface_Concept;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
//Null values not Allowed in PriorityQueue

public class PriorityQueueConcept {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq= new PriorityQueue<String>();
		pq.add("DGhost");
		pq.add("CRider");
		pq.add("BTim");
		pq.add("Atom");
		pq.add("Atom");
		//pq.add(null); //Null values not Allowed in PriorityQueue
		System.out.println(pq);
		
		System.out.println("****************************");
		
		PriorityQueue<String> pq1= new PriorityQueue<String>();
		pq1.add("Royal");
		pq1.add("DC");
		pq1.add("MumbaiInd");
		pq1.add("HydrabadSun");
		System.out.println(pq1);
		pq1.offer("Test"); //Inserts the specified element into this priority queue.
		System.out.println(pq1);
				
		System.out.println("****************************");
		
		System.out.println("This will Print HEAD Value of PriorityQueue: "+pq1.peek());
		System.out.println("This will Print HEAD Value of PriorityQueue: "+pq1.element());
		
		System.out.println("****************************");
		
		System.out.println("Before Delete PriorityQueue elements are "+pq1);
		pq1.poll();
		System.out.println("poll() method removes the HEAD element in the List "+pq1);
		pq1.remove();
		System.out.println("remove() method detele the HEAD element in the List "+pq1);
		
		System.out.println("****************************");
		
		System.out.println("After Perform Remove Operation Iterator elements list are: ");
	    Iterator<String>it=pq1.iterator();
	    while(it.hasNext()){
	    	System.out.println(it.next());
	    }
	    
	    System.out.println("****************************");
	    //Perform Operation on User define class for PriorityQueue List
	    //Create a Object of BookStore Class
	    //Creating Books  
	    BookStore b1=new BookStore(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	    BookStore b2=new BookStore(233,"Operating System","Galvin","Wiley",6);  
	    BookStore b3=new BookStore(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    
	    PriorityQueue<BookStore> pk= new PriorityQueue<BookStore>();
	    pk.add(b1);
	    pk.add(b2);
	    pk.add(b3);
	    
	    Iterator<BookStore>  it1=pk.iterator();
	    while(it1.hasNext()){
	    BookStore Book=it1.next();
	    System.out.println(Book.id+" "+Book.name+" "+Book.author+" "+Book.publisher+" "+Book.quantity);
	    }
	    System.out.println("*****Using Advance for Loop********");
	    for(BookStore bs:pk){
	    	System.out.println(bs.id+" "+bs.name+" "+bs.author+" "+bs.publisher+" "+bs.quantity);
	    }
	    
	    
		

	}

}
