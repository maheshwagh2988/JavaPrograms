package Collection_Map_Interface_Concept;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
//Java LinkedHashMap contains values based on the key.
//Java LinkedHashMap contains unique elements.
//Java LinkedHashMap may have one null key and multiple null values.
//Java LinkedHashMap is non synchronized.
//Java LinkedHashMap maintains insertion order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

public class LinkedHashMapConcept {
		public static void main(String[] args) {
			
			LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
			hm.put(1, "John");
			hm.put(2, "Ron");
			hm.put(1, "Tom"); //LinkedHashMap will not take Duplicate key element.
			hm.put(3, "Ron");
			hm.put(4, "Don");//
			//hm.put(null, "Decosta");//Only One null key allowed //This will give nullPointerExceptions
			System.out.println("Initital LinkedHashMap elements are : "+hm);
			System.out.println("****************Using Iterator Operation perfrom on LinkedHashMap*************");
			Iterator<Entry<Integer, String>>it=hm.entrySet().iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
			System.out.println("*****************************");	
			
			System.out.println("To get() the Key: "+hm.get(1));//It will pickup LastUpdated Value and Print the Key Value of 1 it Display Tom we have same key with name Jhon
			System.out.println("Keys: " +hm.keySet()); ////Fetching key  
			System.out.println("Values: " +hm.values());//Fetching Values
			System.out.println("Key-Value pairs: " +hm.entrySet());//Fetching key-Value Pair
			
			System.out.println("************Using For Loop****************");
			
			for(Entry<Integer, String> m:hm.entrySet()){
				//int key=m.getKey();
				//String value=m.getValue();  if we want to Print separate key value then use this
				//System.out.println(key);
				//System.out.println(value);
				System.out.println("Key = " + m.getKey()+", Value = "+m.getValue());
			 }
			
			System.out.println("*************Using for Loop ******************");
			LinkedHashMap<Integer,BookStore> Lhm= new LinkedHashMap<Integer,BookStore>();
			
			//Create Object of BookStore Class
			  BookStore b1=new BookStore(101,"Let us C","Yashwant Kanetkar","BPB",8);    
			  BookStore b2=new BookStore(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
			  BookStore b3=new BookStore(103,"Operating System","Galvin","Wiley",6);   
			  
			  //Pass BookStore Object to LinkedHashMap Object 
			  Lhm.put(1, b1);
			  Lhm.put(2, b2);
			  Lhm.put(3, b3);
			  
			  //Print Value using for Loop
			    for(Entry<Integer, BookStore>  m:Lhm.entrySet()){
			    	
			    	int key=m.getKey();
			    	BookStore Value=m.getValue();
			    	System.out.println(key + " Book Information: ");
			    	System.out.println(Value.id+" "+Value.name+" "+Value.author+" "+Value.publisher+" "+Value.quantity);
			    	
			    }
			    System.out.println("***********Using toString() methd in BookStore Class *******************");
			    for(Entry<Integer, BookStore>  m:Lhm.entrySet()){
			    System.out.println(m.getKey());
		    	System.out.println(m.getValue());
			    }
				  //Print Value using Iterator
			    System.out.println("***********Using Iterator() and toString() method in BookStore Class *******************");
			   Iterator<Entry<Integer, BookStore>>  it1=Lhm.entrySet().iterator();
			   	while(it1.hasNext()){
			   		Entry<Integer, BookStore>	ent=it1.next();
			   		System.out.println(ent.getKey()+" "+ent.getValue());
			   	}
	}			

}
