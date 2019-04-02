package Collection_Set_Interface_Concept;

 public class BookStore implements Comparable<BookStore> {

	int id;  
	String name,author,publisher;  
	int quantity; 
	
	public BookStore(int id, String name, String author, String publisher, int quantity){
	this.id=id;
	this.name=name;
	this.author=author;
	this.publisher=publisher;
	this.quantity=quantity;
				
	}

public int compareTo(BookStore b) {
	// TODO Auto-generated method stub
	if(id>b.id){
		return 1;
	}else if(id<b.id){
		return -1;
	}else{
		return 0;
	}
	
}

}
