package Collection_Set_Interface_Concept;

import java.util.Iterator;
import java.util.LinkedHashSet;
//LinkedHashSet uses  LinkedHashMap internally to store it’s elements.
//Java LinkedHashSet class contains unique elements only like HashSet.
//Java LinkedHashSet class provides all optional set operation and permits null elements.
//Java LinkedHashSet class is non synchronized.
//Java LinkedHashSet class maintains insertion order.
//LinkedHashSet also allows maximum one null element.
//LinkedHashSet also uses equals() and hashCode() methods to compare the elements.
//Use LinkedHashSet if you want to maintain insertion order of elements.


public class LinkedHashSetConcept {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set= new LinkedHashSet<String>(); 
		set.add("Rob");
		set.add("Sansa");
		set.add("Snow");
		set.add("Lee");
		System.out.println(set);
		//used to return a string representation of the elements of the Collection.
		System.out.println(set.toString());
		
		System.out.println("***************************");
		
		// Creating the Array and using toArray() method of LinkedHashSeMethod 
		 String[] arr = new String[5];
		//Using toArray() method  Store set Values in arr variable
	     arr = set.toArray(arr);  
	    // Displaying Array
	      System.out.println("Using toArray() method  Store set Values in arr variable  and The arr[] is:"); 
	        for (int j = 0; j < arr.length; j++) 
	         System.out.println(arr[j]); 
				
		System.out.println("***************************");
		//Java LinkedHashSet class maintains insertion order Where as HashSet Does not Provide Insertion Order  i.e elements are placed as they are inserted.
		Iterator<String> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		set.add("Lee"); //Added Lee but it Ignore duplicate Elements
		System.out.println(set);
		
        //Create a Object of BookStore Class and Passed to LinkedHashSet
		BookStore bs= new BookStore(101, "Java", "R rao", "DreamTech", 5);
        BookStore bs1= new BookStore(102, "php", "Shinde", "Vision", 2);
        BookStore bs2= new BookStore(103, "Selenium", "Wagh", "Niramli", 10);
        
        LinkedHashSet<BookStore> set1= new LinkedHashSet <BookStore>();
        set1.add(bs);
        set1.add(bs1);
        set1.add(bs2);
        
        System.out.println("****** Using Iterator Print the BookStore Details");
        Iterator<BookStore> it1=set1.iterator();
        while(it1.hasNext()){
         BookStore	Store=it1.next();
         System.out.println(Store.id+" "+Store.name+" "+Store.author+" "+Store.publisher+" "+Store.quantity);
        }
        
        System.out.println("\n******Using Advance For Loop****");
        for(BookStore book:set1){
        	System.out.println(book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
        }
        
		

	}

}
