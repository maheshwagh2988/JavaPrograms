package Collection_Map_Interface_Concept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//Java HashMap class implements the map interface by using a hash table.
//It implements Map interface.
//It extends AbstractMap	
//Java HashMap class Store values based on the key and Value.
//Java HashMap class contains only unique keys.
//Java HashMap class may have one null key and multiple null values.
//Java HashMap class is non synchronized. it is not thread-Safe it occur Fast-Fail and throws ConcurrentModificatoinException
//Java HashMap class maintains no order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
//It Does not store value on the basis of Index
//To overcome problem of Fast-Fail and throws ConcurrentModificatoinException we use HashTable and it is Fail-Safe iterators don’t throw any exceptions if the collection is modified while iterating over it.	

public class HashMapMethods {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		System.out.println("Initial list of elements: "+hm);
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");
	      
	      hm.remove(100);  
	      System.out.println("After use remove() method Updated list of elements: "+hm);
	      
	      System.out.println("After invoking put() method: ");
	      for(Entry<Integer, String> m:hm.entrySet()){
	    	  System.out.println(m.getKey()+" "+m.getValue());
	      }
	      
	            
	      hm.putIfAbsent(103, "Gaurav");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Entry<Integer,String> g:hm.entrySet()){    
	           System.out.println(g.getKey()+" "+g.getValue());    
	      }
	      //Create a Another HashMap
	      HashMap<Integer,String> hm1=new HashMap<Integer,String>();    
			System.out.println("Before putAll() method Initial list of elements: "+hm);
		      hm1.put(104,"Mark");    
		      hm1.put(105,"Arya");    
		      hm1.put(106,"Sansa");
		   hm1.putAll(hm);
		   for(Entry<Integer,String> k:hm1.entrySet()){
			   System.out.println(k.getKey()+" "+k.getValue());
		   	   }
		   
		   //Use of Replace 
		   System.out.println(hm1);
		   hm1.replace(101, "Vijay", "Ravi");  
		   System.out.println(hm1);
		   
	      //Passing User define class Object to HashMap Collection
		   HashMap<Integer,BookStore> map=new HashMap<Integer,BookStore>(); 
		   
		   //Create Object of BookStore Class
		   
		   BookStore b1=new BookStore(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		   BookStore b2=new BookStore(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		   BookStore b3=new BookStore(103,"Operating System","Galvin","Wiley",6);    
		   
		   //Add BookStore Object in map
		   map.put(1, b1);
		   map.put(2, b2);
		   map.put(3, b3);
		   //Traverse using for Loop
		    for(Entry<Integer,BookStore>m:map.entrySet()){
		    	 int key=m.getKey();
		    	 BookStore Value=m.getValue();
		    	 System.out.println(key + " Book Information: ");
		    	 System.out.println(Value.id+" "+Value.name+" "+Value.author+" "+Value.publisher+" "+Value.quantity);
		    }
		    
		  //Using Generic:
			System.out.println("*******Using Generic:******");
			Iterator<Entry<Integer, BookStore>> entries = map.entrySet().iterator();
			while (entries.hasNext()) {
				Entry<Integer, BookStore> entry = entries.next();
			    System.out.println("Key = " + entry.getKey() + ", \nValue = " + entry.getValue().toString());
			   // BookStore b=entry.getValue();
			    //System.out.println(b.getAuthor());//java SERLIZATION TO STORE VAULE ON LOCAL SYSTEM Use GEt SET method
			    
			}
		   

	}

}
