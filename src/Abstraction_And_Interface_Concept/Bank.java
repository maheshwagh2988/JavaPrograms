package Abstraction_And_Interface_Concept;

//To hide Implementation logic in that case use Abstraction like lone()method is is different for all bank but credit and debit is same
//Can't create a Object of Abstract Class
//Some feature you want to hide and some are not in such case Abstract class used where as in Interface all method is abstract all hide 
//The type Bank must be an abstract class to define abstract methods
//Abstraction means to hide some implementation logic 
//Abstract class is fast than Interface In Interface it has iterate child interface then it come to method 
//this is Partial Abstraction
//If we want 100 Abstraction use Interface 
//Interface by nature all method is Abstract method only define() not declare {} 
//Abstract class can have Abstract as well as non Abstract method
//If class having one abstract method then that class should be define as abstract class


//Abstract classes are a bit different from interfaces.
//These are also used to create blueprints for concrete classes but abstract classes may have implemented methods. 
//But to qualify as an abstract class, it must have at least one abstract method.
//Abstract classes can implement one or more interfaces and can extend one abstract class at most

//A class can be an abstract class without having any methods inside it
//But if it has any methods inside it, it must have at least one abstract method.
//This rule does not apply to static methods.
//As abstract classes can have both abstract and non abstract methods, hence the abstract modifier is necessary here 
//Static members are allowed.
//Abstract classes can extend other at most one abstract or concrete class and implement several interfaces.
//Any class that does not implement all the abstract methods of it’s super class has to be an abstract class itself.


public abstract class Bank {
	
	
	int amt=100;
	final int rate=50;
	static int loanrate=5;
	
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
