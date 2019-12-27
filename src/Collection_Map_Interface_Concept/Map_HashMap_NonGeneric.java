package Collection_Map_Interface_Concept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_HashMap_NonGeneric {

	public static void main(String[] args) {
		  Map map= new HashMap();
		  map.put(1,"Amit");  
		  map.put(5,"Rahul");  
		  map.put(2,"Jai");  
		  map.put(6,"Amit");
		  //map.put(6,"Amit");
		  
		  //Traversing Map  
		  Set set=map.entrySet();////Converting to Set so that we can traverse  
		  Iterator it=set.iterator();
		  while(it.hasNext()){
			 
			  //Converting to Map.Entry so that we can get key and value separately
			  
 			  Map.Entry  ent =(Map.Entry) it.next();
 			  System.out.println(ent.getKey()+" "+ent.getValue());

		  }
		  
	}

}
