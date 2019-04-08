package Collection_Map_Interface_Concept;

import java.util.EnumMap;
import java.util.Map.Entry;

public class EnumMapConcept {
	
	// Creating enum 	
public enum Keys{
	One, Two,Three
}
	public static void main(String[] args) {
		
		//Create User define EnumMap and Passed enum and BookStore Class as Generic 
		EnumMap<Keys, BookStore> EMap= new EnumMap<Keys, BookStore>(Keys.class);
		   // Creating Books Onject form BookStore Class   
	    BookStore b1=new BookStore(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	    BookStore b2=new BookStore(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    BookStore b3=new BookStore(103,"Operating System","Galvin","Wiley",6);
	 // Adding Books to Map   
	    EMap.put(Keys.One,b1 );
	    EMap.put(Keys.Two, b2);
	    EMap.put(Keys.Three, b3);
	    
	    for(  Entry<Keys,BookStore> emap:EMap.entrySet()){
	    	BookStore b=emap.getValue();
	    	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
	    }			
	    
		

	}

}
