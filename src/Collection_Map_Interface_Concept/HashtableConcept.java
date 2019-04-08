package Collection_Map_Interface_Concept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
//Java Hashtable class implements a hashtable,which maps keys to values.
//It inherits Dictionary class and implements the Map interface.
//A Hashtable is an array of a list. Each list is known as a bucket
//The position of the bucket is identified by calling the hashcode() method.
// A Hashtable contains values based on the key.
//Java Hashtable class contains unique elements.
//Java Hashtable class doesn't allow null key or value.
//Java Hashtable class is synchronized.
//It is thread-safe and can be shared with many threads.
//HashTable is Fail-Safe iterators don’t throw any exceptions if the collection is modified while iterating over it.
//HashMap is Fast-Fail if we trying to modified while iterating it will throws ConcurrentModificatoinException
//HashMap and Hashtable both are used to store data in key and value form. Both are using hashing technique to store unique keys.
//Hashtable is a legacy class.
//Hashtable is slow.
//Hashtable is internally synchronized and can't be unsynchronized.
//Hashtable inherits Dictionary class.

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
		System.out.println(map.getOrDefault(1,"Key Value for given list is Not Found"));
		System.out.println(map.getOrDefault(5, "Key Value for given list is Not Found"));  
		
	    //Inserts, as the specified pair is unique  
		map.putIfAbsent(6,"Gaurav");  
		System.out.println("Updated Map: "+map);  
	    //Returns the current value, as the specified pair already exist 
		map.putIfAbsent(2,"Patric");  
	    System.out.println("Updated Map: "+map);
	    
		System.out.println("***************************");
	    
	    //Create LinkedHashMap Object and Passed to User define class
	    Hashtable<Integer,BookStore> map1= new Hashtable<Integer,BookStore>();
	    //Create Object Of BookStore Class
	    BookStore b1=new BookStore(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    BookStore b2=new BookStore(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    BookStore b3=new BookStore(103,"Operating System","Galvin","Wiley",6);
	    
	    map1.put(1, b1);
	    map1.put(2, b2);
	    map1.put(3, b3);

		//Traverse using Iterator 
	    	Iterator<Entry<Integer, BookStore>>	it =map1.entrySet().iterator();
	    	while(it.hasNext()){
	    		 Entry<Integer,BookStore> Book =it.next();
	    		 //Using public String toString() Method in BookStore class 
	    		 System.out.println(Book.getKey()+" "+Book.getValue());
	    		 
	    		 //Using public String toString() Method in BookStore class 
	    		 //System.out.println(Book.getKey()+" "+Book.getValue().id+Book.getValue().name+Book.getValue().author+Book.getValue().publisher+Book.getValue().quantity);
	    	}
	    System.out.println("*********For Loop*************");
	    for ( Entry<Integer, BookStore>     m:map1.entrySet()){
	    	System.out.println(m.getKey()+" " +m.getValue());
	    }
	}

}
