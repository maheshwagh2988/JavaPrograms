package CollectionConcept;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.add("Rob");
		v.addElement("Stark");
		v.addElement("Arya");
		v.addElement("Branden");
		v.addElement("Thor");
		v.add(null);
		System.out.println(v);
		//Accessing First and Last element using firstElement() and  firstElement() method
		String S=v.firstElement();
		System.out.println(S);
		
		System.out.println("\n**** Traverse Using Iterator  ***\n");
		//Traverse Using Iterator
		Iterator<String> it=v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("\n**** Traverse Using Enumeration  ***\n");
		//Traverse Using Enumeration  
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	
		
	}

}
