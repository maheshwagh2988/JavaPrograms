package Abstraction_And_Interface_Concept;

public class HDFCBank extends Bank{
	//Constructor of HDFCBank Class
	public HDFCBank(){
		System.out.println("This is Constructor of HDFCBank Class");
	}
	
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("This is HDFCBank Class lone() method overridden by Bank class loan() method as this method is abstract ");
		
	}
	public void funds(){
		System.out.println("HDFC Class Funds() metod");
	}

}
