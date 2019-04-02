package CollectionConcept;

import java.util.ArrayList;
import java.util.Iterator;


class Book{
	int id;
	String name,author,publisher;
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity){
		this.id=id;
		this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	 }	
}

public class ArrayListExample_adding_books {

	public static void main(String[] args) {
		 //Creating Books class Object
		
		 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		 
		//Creating list of Books using ArrayList  
			ArrayList<Book> list = new ArrayList<Book>(); 
			
		list.add(b1); 
		list.add(b2); 
		list.add(b3); 
		//Using Iterator 
		 Iterator<Book> it=list.iterator();
		 while( it.hasNext()){
			 Book  bk=it.next();
			 System.out.println(bk.id+" "+bk.name+" "+bk.author+" "+bk.publisher+" "+bk.quantity);  
			 }
		 System.out.println("\n********* Below code is Using Advance For Loop*************\n");
		 //Using Advance For Loop
		 for(Book bk1:list){
			 System.out.println(bk1.id+" "+bk1.name+" "+bk1.author+" "+bk1.publisher+" "+bk1.quantity);
		 }

	}

}
