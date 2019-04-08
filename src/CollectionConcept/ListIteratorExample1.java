package CollectionConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {
	
//ListIterator traverses the elements in backward and forward directions both.
//ListIterator can be used in List only.
//ListIterator can perform ?add,? ?remove,? and ?set? operation while traversing the collection.
	      //Difference in ListIterator & Iterator
//The Iterator traverses the elements in the forward direction only.	
//The Iterator can be used in List, Set, and Queue.	
//The Iterator can only perform remove operation while traversing the collection.	
//--------------------------------------------------------------------------
					//Enumeration
//Enumeration can traverse only legacy elements.
//Enumeration is not fail-fast.
//Enumeration is faster than Iterator.
//The Enumeration can perform only traverse operation on the collection.
			//Difference in Iterator & Enumeration
//The Iterator can traverse legacy and non-legacy elements.		
//The Iterator is fail-fast.	
//The Iterator is slower than Enumeration.
//The Iterator can perform remove operation while traversing the collection.		

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mak");
		al.add("jack");
		al.add("Rack");
		al.add("Tank");
		ListIterator<String> it=al.listIterator();
		while(it.hasNext()){
		System.out.println("Index of List is: "+it.nextIndex()+" and Value of List= " +it.next());
		}while (it.hasPrevious()){
			System.out.println(it.previous());
		}
	}

}
