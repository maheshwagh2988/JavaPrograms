package Collection_Map_Interface_Concept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapConcept {
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
		
		HashMap<Integer,String> hashmap= new HashMap<Integer,String>();
		hashmap.put(1, "Selenium");
		hashmap.put(2, "Java");
		hashmap.put(3, "PHP");
		System.out.println(hashmap);//Print all the values in map
		System.out.println(hashmap.get(1));//Print the Value on the basis of Key
		System.out.println(hashmap.get(4));//Print null because 4 key is not preset in the given HashMap

		HashMap<Integer,String> hmap= new HashMap<Integer,String>();
		hmap.put(1, "QTP");
		hmap.put(2, "Python");
		hmap.put(3, "DotNet");
		hmap.put(4, "RFT");
		System.out.println(hmap);
		
		//To Iterate Map we have to use entrySet() method 
		for(Entry<Integer, String> m:hmap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("Before remove elements are: "+hmap);
		hmap.remove(3); //it will removes the DotNet form the list and it does not maintain order so it will print like {1=QTP, 2=Python, 4=RFT} here 3 is not display in the list.
		System.out.println("After remove elements are: "+hmap+"\n");
		
		//HashMap with BookStore User define Object
		
		HashMap<Integer,BookStore> HashEmp= new HashMap<Integer,BookStore>();
		
		BookStore b1=new BookStore(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		BookStore b2=new BookStore(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		BookStore b3=new BookStore(103,"Operating System","Galvin","Wiley",6);   
		
		HashEmp.put(1, b1);
		HashEmp.put(2, b2);
		HashEmp.put(3, b3);
		
		//Traverser HashMap Using for Loop
		
		for(Entry<Integer, BookStore> m : HashEmp.entrySet()){
			int key=m.getKey();
			BookStore value=m.getValue();
			System.out.println(key + " Book Information: ");
			System.out.println(value.id+" "+value.name+" "+value.author+" "+value.publisher+" "+value.quantity);
			//fail-fast in nature.
			//HashEmp.put(4, b3);//This will give Exception in thread "main" java.util.ConcurrentModificationException 
		 }
			System.out.println("*******//Using Generic:***********");
		      Iterator<Entry<Integer, BookStore>>  it=HashEmp.entrySet().iterator();
		      while(it.hasNext()){
		    	HashMap.Entry<Integer, BookStore> en=it.next();
		    	 System.out.println(en.getKey()+""+en.getValue());
		      }
		
		}

	}


