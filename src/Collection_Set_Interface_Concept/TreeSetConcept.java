package Collection_Set_Interface_Concept;

import java.util.Iterator;
import java.util.TreeSet;
//TreeSet uses TreeMap internally to store it’s elements.
//Java TreeSet class contains unique elements only like HashSet and LinkedHashSet 
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
//Java TreeSet class is non synchronized.
//Java TreeSet class maintains ascending order.
//TreeSet uses compare() or compareTo() methods to compare the elements and thus removing the possible duplicate elements.
//Use TreeSet if you want to sort the elements according to some Comparator.




public class TreeSetConcept {

	public static void main(String[] args) {
		
		TreeSet<String> tr=new TreeSet<String>();
		tr.add("MadKing");
		tr.add("Rob");
		tr.add("Arya");
		tr.add("Khalisee");//Duplicate Values does not Accept 
		tr.add("Khalisee");
		//tr.add(null);  //Does not allow to store null here you will get NullPointerException
		System.out.println("TreeList Display as per Ascending Order: "+tr);
		
		System.out.println("\n****Use of  toArray() method*******");
		
		//Using toArray Method Store Array element into 
		String arr[]= new String[5];
		arr=tr.toArray(arr);
		System.out.println("Using toArray() method  Store set Values in arr variable  and The arr[] is:"); 
	    for (int j = 0; j < arr.length; j++) 
	     System.out.println(arr[j]); 
	    
	    System.out.println("************");
		
		
		//TreeSet class maintains ascending order.
		TreeSet<String> tr1=new TreeSet<String>();
		tr1.add("D");
		tr1.add("C");
		tr1.add("B");
		tr1.add("A");
		System.out.println("\nBy default TreeSet traversing element in Ascending order. ");
		Iterator<String> it=tr1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("\nTo traversing element in descending order in TreeSet through Iterator we have descendingIterator() method for Iterator & descendingSet() method in TreeSet");
		//To traversing element in descending order in TreeSet through Iterator we have descendingIterator() method for Iterator & descendingSet() method in TreeSet

		Iterator<String> it1=tr1.descendingIterator();
		while(it1.hasNext()){
			System.out.println(it1.next());
		}
		System.out.println("Using descendingSet() method "+tr1.descendingSet());
		
		
		//example to retrieve and remove the highest and lowest Value.
		
		TreeSet<Integer> set=new TreeSet<Integer>();  
        set.add(25);  
        set.add(55);  
        set.add(65);  
        set.add(75);  
        System.out.println("To retrieve and remove the lowest Value we have pollFirst () method for Lowest Value: " + set.pollFirst());
        System.out.println("To retrieve and remove the highest Value we have pollFirst () method for Highest Value: " + set.pollLast());
        System.out.println("**********************\n");
       // example, we perform various NavigableSet operations.
        TreeSet<String> set1=new TreeSet<String>();  
        set1.add("A");  
        set1.add("B");  
        set1.add("C");  
        set1.add("D");  
        set1.add("E");  
        
        System.out.println("Print set using Reverser Order use descendingSet() Method"+set1.descendingSet());
        System.out.println("Head Set: "+set1.headSet("C", true));  //Print A to C it will take values till C if it is true
        System.out.println("Head Set: "+set1.headSet("C", false));  //Print till  A and B and Ignore C 
        System.out.println("SubSet: "+set1.subSet("A", false, "E", true)); //Print B to E it will set A False/Ignore
        System.out.println("SubSet: "+set1.subSet("A", true, "E", false));  //Print A to D it will set D False/Ignore
        System.out.println("TailSet: "+set1.tailSet("C", false));//Print D to E and Ignore till C it it False
        System.out.println("TailSet: "+set1.tailSet("C", true));//Print C to E and Ignore before C it it true
        
        
        System.out.println("\nWe perform various SortedSetSet operations.");
        
        System.out.println("Intial Set:"+set1);
        System.out.println("Head Set: "+set1.headSet("C"));  
        System.out.println("SubSet: "+set1.subSet("A", "E"));  
        System.out.println("TailSet: "+set1.tailSet("C"));
        
        System.out.println("\n*To add user-defined objects in TreeSet, you need to implement the Comparable interface in BookStore class for Integer Valuse as String and Wrapper classes are Comparable by default**");
        // The elements in TreeSet must be of a Comparable type. String and Wrapper classes are Comparable by default.
        //To add user-defined objects in TreeSet, you need to implement the Comparable interface in BookStore class
        //public class BookStore implements Comparable<BookStore>
        
      //Creating Books  
        BookStore b1=new BookStore(121,"Let us C","Yashwant Kanetkar","BPB",8);  
        BookStore b2=new BookStore(233,"Operating System","Galvin","Wiley",6);  
        BookStore b3=new BookStore(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        
      //Adding Books to TreeSet  
        TreeSet<BookStore> set2=new TreeSet<BookStore>();  

        set2.add(b1);  
        set2.add(b2);  
        set2.add(b3);  
        for(BookStore br: set2){
        	   System.out.println(br.id+" "+br.name+" "+br.author+" "+br.publisher+" "+br.quantity);  
        }

	}

}
