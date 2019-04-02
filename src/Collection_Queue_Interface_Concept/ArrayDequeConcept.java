package Collection_Queue_Interface_Concept;

import java.util.ArrayDeque;
//The ArrayDeque class provides the facility of using deque and resizable-array.
//Unlike Queue, we can add or remove elements from both sides.
//Null elements are not allowed in the ArrayDeque.
//ArrayDeque is not thread safe, in the absence of external synchronization.
//ArrayDeque has no capacity restrictions.
//ArrayDeque is faster than LinkedList and Stack.

public class ArrayDequeConcept {
	
	public static void main(String[] args) {
		ArrayDeque<String> arq= new ArrayDeque<String>();
		arq.add("Mark");
		arq.add("Shaun");
		arq.add("Steave");
		arq.add("Ngidi");
		System.out.println(arq);
		
		System.out.println("*********************");
		
		arq.addFirst("Ron"); //To add element in 1st Position 
		arq.addLast("Jhon"); //To add element in Last Position 
		System.out.println(arq);
		
		System.out.println("*********************");
		
		System.out.println(arq.getFirst());//To get/display element from 1st Position 
		System.out.println(arq.getLast());//To get/Display element from Last Position
		
		System.out.println("*********************");
		
		arq.offer("Test1");//To add the element in the List
		arq.offerFirst("Test2");//To add the element in the 1st Position in given  List
		arq.offerLast("Test3");//To add the element in the Last Position in given List
		System.out.println(arq);
		
		System.out.println("*********************");
		
		System.out.println(arq.peek());//To Display 1st element in given list
		System.out.println(arq.peekFirst());//To Display 1st element in given list
		System.out.println(arq.peekLast());//To Display Last element in given list
		
		System.out.println("*********************");
		
		System.out.println(arq.poll());//Bring the element form list and remove the element from same list 
		System.out.println(arq.pollFirst());//Display and remove 1st the element form given list
		System.out.println(arq.pollLast());//Display and remove Last the element form given list
		
		System.out.println("*********************");
		
		System.out.println(arq.pop());//Remove 1st the element form given list
		System.out.println(arq.removeFirst());//Remove 1st the element form given list
		System.out.println(arq.removeLast());//Remove Last the element form given list
		
		System.out.println("*********************");
		
		//Create a Object of BookStore Class and Passed to ArrayDeque 
	    BookStore b1=new BookStore(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    BookStore b2=new BookStore(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    BookStore b3=new BookStore(103,"Operating System","Galvin","Wiley",6);  
	    
	    ArrayDeque<BookStore> bs=new ArrayDeque<BookStore>();
	    bs.add(b1);
	    bs.add(b2);
	    bs.add(b3);

	    for(BookStore bk:bs){
	    	
	    	System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.quantity);    
	    	
	    }
		
	}

}
