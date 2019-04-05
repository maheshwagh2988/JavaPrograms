package Collection_Map_Interface_Concept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
//Java Hashtable class implements a hashtable,which maps keys to values.
//It inherits Dictionary class and implements the Map interface.
//A Hashtable is an array of a list. Each list is known as a bucket
//The position of the bucket is identified by calling the hashcode() method.
// A Hashtable contains values based on the key.
//Java Hashtable class contains unique elements.
//Java Hashtable class doesn't allow null key or value.
//Java Hashtable class is synchronized.
//HashTable is Fail-Safe iterators don’t throw any exceptions if the collection is modified while iterating over it.
//HashMap is Fast-Fail if we trying to modified while iterating it will throws ConcurrentModificatoinException

public class HashtableConcept {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> map= new Hashtable<Integer,String>();
		map.put(1, "Roy");
		map.put(1, "Roy");
		map.put(2, "Patric");
		map.put(3, "Jeson");
		map.put(4, "D'Costa");
		//map.put(5, null);//Values Can't be Null it throws NullPointerException
		//map.put(null,"Roger");// Key Can't be Null it throws NullPointerException
		System.out.println("Defalut Hashtable print in decending order like Bucket: "+map);
		for(Entry<Integer,String> m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
		 //Here, we specify the if and else statement as arguments of the method  
		System.out.println("***************************");
		System.out.println(map.getOrDefault(1,"Not Found"));
		System.out.println(map.getOrDefault(5, "Not Found"));  
		

	}

}
