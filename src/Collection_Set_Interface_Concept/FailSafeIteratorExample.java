package Collection_Set_Interface_Concept;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

//Fail-Safe iterators don’t throw any exceptions if the collection is modified while iterating over it.
//Because, they iterate on the clone of the collection not on the actual collection.
//So, any structural modifications done on the actual collection goes unnoticed by these iterators.
//some drawbacks. One of them is that it is not always guaranteed that you will get up-to-date data while iterating.
//Because any modifications to collection after the iterator has been created is not updated in the iterator.
//Iterator returned by ConcurrentHashMap is a fail-safe iterator.


public class FailSafeIteratorExample {

	public static void main(String[] args) {
		
		//Creating a ConcurrentHashMap
        
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
         
        //Adding elements to map
         
        map.put("ONE", 1);
         
        map.put("TWO", 2);
 
        map.put("THREE", 3);
         
        map.put("FOUR", 4);
         
        //Getting an Iterator from map
         
        Iterator<String> it = map.keySet().iterator();
         
        while (it.hasNext())
        {
            String key = (String) it.next();
             
            System.out.println(key+" : "+map.get(key));
             
            map.put("FIVE", 5);     //This will not be reflected in the Iterator
		
        }
	}

}
