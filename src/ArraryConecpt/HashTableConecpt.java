package ArraryConecpt;

import java.util.Hashtable;
import java.util.Set;

public class HashTableConecpt {

	public static void main(String[] args) {
		// This is also called an dynamic array but different from ArrayList
		//Hashtable we have keys here we don't have index
		//here we can allow any value like int,double,decimal,char,string
		//put method contain "key" and "value" 
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "TESTHASHTABLE");
		
		
		System.out.println(h);//print all element key and value its a collection 
		
		//Using Set will print all the key element 
		Set<String> keys = h.keySet();
        for(String key: keys){
            System.out.println(key);
        }
        
        
        h.put(1, "tom");
		System.out.println(h.size());
		System.out.println(h.get(1));//print the value of key 1 & its value is tom
		//if we want to restrict Hashtable as only Interger then we have to pass it 
		Hashtable<Integer,Integer> h1= new Hashtable<Integer,Integer>();
		h.put(10,20);
		Hashtable<Integer,String> h2= new Hashtable<Integer,String>();
		h2.put(1, "Here is String");
		
		

	}

}
