package Collection_Map_Interface_Concept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class Map_HashMapExampleGeneric {
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Threee");
		map.put(4, "Four");
		
		//To check use of equal method in HashMap
	//----------------------------------------------------------------------------
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(4, "Four");
		
		HashMap<Integer, String> map3= new HashMap<Integer, String>();
		map3.put(4, "Mahesh");
		
		HashMap<Integer, String> map4= new HashMap<Integer, String>();
		map4.put(4, "Mahesh");
		
		System.out.println("Value of map2 given key is -->"+map2.get(4).hashCode());
		System.out.println("Value of map3 given key is -->"+map3.get(4).hashCode());
		System.out.println("Value of map4 given key is -->"+map4.get(4).hashCode());
		
		//peopleMap.put(me, me.toString());
        System.out.println("me and me2 same? " + map2.equals(map3));
        System.out.println("me and me2 same? " + map3.equals(map4));
        //----------------------------------------------------------------------------        
	        
	    System.out.println(map.entrySet());
	    
	    System.out.println("After invoking put() method ");  
	      for(Entry<Integer, String> m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	      
	      map.putIfAbsent(5, "Five");  
	      System.out.println("After invoking putIfAbsent() method ");  
	      for(Entry<Integer, String> m1:map.entrySet()){    
		       System.out.println(m1.getKey()+" "+m1.getValue());    
		      } 
	      
	      System.out.println("************************");
	      
	      HashMap<Integer,String> map1=new HashMap<Integer,String>();  
	      map1.put(7,"Seven");
	      
	      //Use of putAll() Method
	      map1.putAll(map);  
	      System.out.println("After invoking putAll() method "); 
	      for(Entry<Integer, String> m2:map1.entrySet()){    
		       System.out.println(m2.getKey()+" "+m2.getValue());    
		      } 
	      
	      //Use of Remove
	      System.out.println("Before list of elements: "+map1);
	      map1.remove(3, "Threee");  
	      System.out.println("Updated list of elements: "+map1);  
	      
	      //Use of Replace
	      map1.replace(2, "Eight");  
	      System.out.println(map1);
	      
		//Using Generic:
		System.out.println("*******Using Generic:******");
		Iterator<HashMap.Entry<Integer, String>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
			HashMap.Entry<Integer, String> entry = entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		System.out.println("*******Without Generic:******");
		//Without Generic:
		Iterator  entries1= map.entrySet().iterator();
		while (entries1.hasNext()) {
			HashMap.Entry entry = (HashMap.Entry) entries1.next();
		    Integer key = (Integer)entry.getKey();
		    String value = (String)entry.getValue();
		    System.out.println("Key = " + key + ", Value = " + value);
		}
		
		System.out.println("************Using For-Loop******************");
		//Elements can traverse in any order  
		  for(HashMap.Entry m:map.entrySet()){  
		   System.out.println("Key = " + m.getKey()+", Value = "+m.getValue());  
		  }  


	}

}
