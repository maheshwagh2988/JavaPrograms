package Collection_Map_Interface_Concept;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
// It provides an efficient means of storing key-value pairs in sorted order.
//Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
//Java TreeMap contains only unique elements.
//Java TreeMap cannot have a null key but can have multiple null values.
//Java TreeMap is non synchronized.
//Java TreeMap maintains ascending order.

public class TreeMapConcept {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> mt= new TreeMap<Integer,String>();
		mt.put(1, "Rony");
		mt.put(2, "Troy");
		mt.put(3, "Troy"); //TreeMap can have have duplicate Value but not key
		mt.put(4, "Justin");//Java TreeMap contains only unique key elements
		mt.put(4, "Rob");
		//mt.put(null, "Lee");//Java TreeMap cannot have a null key it will give java.lang.NullPointerException
		System.out.println("Print Defalut  Lis :\n "+mt);
		
		System.out.println("********Using Iterator********");
		
		      Iterator<Entry<Integer, String>> it =mt.entrySet().iterator();
		      while(it.hasNext()){
		    	  System.out.println(it.next());
		      }
		System.out.println("******************************\n");     
		
		System.out.println("Print Using entrySet() Method: "+mt.entrySet());
		System.out.println("Using firstKey() method Print 1st Key of TreeMap: "+mt.firstKey());
		System.out.println("Using firstEntry() method Print 1st Key & it's Value: "+mt.firstEntry());
		System.out.println("Using floorEntry() method Print Passed Key & it's Value: "+mt.floorEntry(3));
		System.out.println("Using floorKey() method Print Passkey Key only  "+mt.floorKey(4));
		System.out.println("Using descendingKeySet() method Print Keys in Decending order: "+mt.descendingKeySet());
		System.out.println("Using descendingMap() method Print Keys & values in Decending order: "+mt.descendingMap());
		System.out.println("Using headMap() method Print Keys and Valuse Till 3 from TreeMap  : "+mt.headMap(4));
		System.out.println("Using higherEntry() method Print Keys & valuse GretterThan > Given value: "+mt.higherEntry(3));
		System.out.println("Using higherKey() method Print Keys GretterThan Given Value "+mt.higherKey(3));
		System.out.println("Using keySet() method Print All Key set: "+mt.keySet());
		System.out.println("Using lastEntry() method Print Last Value of with respective key: "+mt.lastEntry());
		System.out.println("Using lastKey() method Print Only Last Key "+mt.lastKey());
		System.out.println("Using lowerEntry() method Print Lowest Value with respective key from given value: "+mt.lowerEntry(5));
		System.out.println("Using lowerKey() method Print Lowest key from given value: "+mt.lowerKey(3));
		System.out.println("Using pollFirstEntry() method Remove 1st entry from TreeMap: "+mt.pollFirstEntry());
		System.out.println("Using pollLastEntry() method Remove Last entry from TreeMap:"+mt.pollLastEntry());
		System.out.println("Using tailMap() method Returns key-value pairs whose keys are greater than or equal to the specified key.  :"+mt.tailMap(1));
		System.out.println("Using values() method Print Duplicate Values "+mt.values());
		
		//Create a One More TreeMap
		TreeMap<Integer,String> Tm= new TreeMap<Integer,String>();
		Tm.put(1, "Michael");
		Tm.put(2, "Paul");
		Tm.put(3, "Tanya");
		Tm.put(4, "Mark");
		System.out.println("\n*****************Using For Loop********************");
		for(Entry<Integer, String> m:Tm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("\n******User define Object BookStore Class Pass to TreeMap Object  *************");
		//User define Object Pass to TreeMap 
		//1. Create a Object of Tree Map Here BookStore is user define class Passed to TreeMap
		TreeMap<Integer,BookStore> Tb= new TreeMap<Integer,BookStore>();
		//Create a Object Of BookStore class
		BookStore b1=new BookStore(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		BookStore b2=new BookStore(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
		BookStore b3=new BookStore(103,"Operating System","Galvin","Wiley",6);    
		//Bind with TreeMap Object with BookStore Object 
		Tb.put(1,b1);
		Tb.put(2,b2);
		Tb.put(3,b3);
		//Iterator these value using Iterator and for Loop
			Iterator<Entry<Integer, BookStore>>	it1=Tb.entrySet().iterator();
			while(it1.hasNext()){
					Entry<Integer, BookStore>entry1= it1.next();
					 //System.out.println(entry1.getKey()); //This will Print separate Key
					
					//Using toStirng() method you will print all the values in BookStore Class
					 System.out.println("\nKey =" + entry1.getKey() + ",\nValues Are=" + entry1.getValue().toString());
					 
					 //This will Print values using one by one 
					 // System.out.println(entry1.getValue().id+" "+entry1.getValue().name+" "+entry1.getValue().author+" "+entry1.getValue().publisher+" "+entry1.getValue().quantity);
					 
			}
	}

}
