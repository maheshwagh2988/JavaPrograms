package Collection_Set_Interface_Concept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetConcept {
	//HashSet uses HashMap internally to store it’s elements.
	//o	HashSet stores the elements by using a mechanism called hashing.
	//o	HashSet contains unique elements only.
	//o	HashSet allows null value.
	//o	HashSet class is non synchronized.
	//o	HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
	//o	HashSet is the best approach for search operations.
	//o	The initial default capacity of HashSet is 16, and the load factor is 0.75.
	//A List Interface can contain duplicate elements whereas Set Interface contains unique elements only.
	//Traverser Data using iterator HashSet doesn't maintain the insertion order please see the Iterator result it does not maintain order
	//HashSet allows maximum one null element.
	//HashSet uses equals() and hashCode() methods to compare the elements 
	//Use HashSet if you don’t want to maintain any order of elements.

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Arya");
		hs.add("Steave");
		hs.add("Roger");
		hs.add("Hulk");
		hs.add("Justin");
		hs.add("Justin"); //Duplicate Values does not Accept 
		System.out.println("HashSet Size is: "+hs.size()); //Size not display as Index Basis 
		System.out.println(hs);
		
		System.out.println("****Use of  toArray() method*******");
		String arr[]= new String[5];
		arr=hs.toArray(arr);
		System.out.println("Using toArray() method  Store set Values in arr variable  and The arr[] is:"); 
	    for (int j = 0; j < arr.length; j++) 
	     System.out.println(arr[j]); 
	    System.out.println("************");
	    
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Mariya");
		hs1.add("Hulk");
		hs1.add("Caption");
		hs1.add("Tony");
		hs1.add("Rohdes");
		System.out.println(hs1);
		System.out.println("HashSet Size is: "+hs1.size());
		
		System.out.println("\n******Please see Iterator result it does not mentain Insertaion order as per HashList Added**********\n");
		
		Iterator<String> it=hs1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		System.out.println("\n******Adding HastSet hs data into hs1 using addAll Method**********\n");
		hs1.addAll(hs);
		System.out.println(hs1); //Print Both HashSet List
	
		//Traverser Data using iterator HashSet doesn't maintain the insertion order please see the Iterator result it does not mentain order
		Iterator<String> its=hs1.iterator();
		while(its.hasNext()){
			System.out.println(its.next());
		}

		
		//Remove hs List from hs1 HashList
		hs1.removeAll(hs);
		System.out.println(hs1);//It will Print only hs1 HashSet List
		 
		hs1.remove("Tony");
		System.out.println(hs1);
		 
		//Passed HashSet from another ArrayList Collection
		 
		ArrayList<String> list=new ArrayList<String>(hs1);  
        list.add("MadKing");  
        System.out.println(list);
         
        //Passed ArryList from another HashSet Collection
        HashSet<String> hs2 = new HashSet<String>(list);
 		hs2.add("Dayna");
        System.out.println(hs2);
        
        System.out.println("\n*******BookStore Class Object Pass to HashSet Collection**************\n ");
        
        //Create a Object of BookStore Class
        BookStore b1= new BookStore(101, "Java", "R rao", "DreamTech", 5);
        BookStore b2= new BookStore(102, "php", "Shinde", "Vision", 2);
        BookStore b3= new BookStore(103, "Selenium", "Wagh", "Niramli", 10);
        
        //Create HashList to Pass Object of BookStore class
        HashSet<BookStore> hs3= new HashSet<BookStore>();
        hs3.add(b1);
        hs3.add(b2);
        hs3.add(b3);
        
        Iterator<BookStore> it1=hs3.iterator();
        while(it1.hasNext()){
        	BookStore Store =it1.next();
        	System.out.println(Store.id+" "+ Store.name+" "+Store.author+" "+Store.publisher+" "+Store.quantity);
        	      	
        }
        
        System.out.println("********Using advance For Loop*******");
        for(BookStore b:hs3){  
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
            }  
	

	}

}
