package CollectionConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample1 {

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
