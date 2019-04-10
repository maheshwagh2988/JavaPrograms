package Abstraction_And_Interface_Concept;

//The type Bank must be an abstract class to define abstract methods
//Abstraction means to hide some implementation logic 
//this is Partial Abstraction
//If we want 100 Abstraction use Interface 
//Interface by nature all method is Abstract method only define() not declare {} 
//Abstract class can have Abstract as well as non Abstract method
//If class having one abstract method then that class should be define as abstract class

public abstract class Bank {
	//Constructor of HDFCBank Class
	protected Bank(){
		System.out.println("This is Constructor of Bank Class");
	}
	
	//Abstract method no method Body { }
	public abstract void loan(); //Only method declaration() not Body{}
	
	
	public void credit(){
		System.out.println("Bank --Creadit-- Non-Abstract Method");
	}
	public void debit(){
		System.out.println("Bank --Debit-- Non-Abstract Method");
	}

}
