package Collection_Map_Interface_Concept;

public class BookStore {
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
	//This will use for Generic Iterator to Print Value 
	public String toString(){
		return "\nId= "+id+"\nname= "+name+"\nauthor= "+author+"\npublisher= "+publisher+"\nquantity= "+quantity;
	}

}
