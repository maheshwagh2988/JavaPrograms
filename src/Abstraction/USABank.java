package Abstraction;

public interface USABank {
	
//All variables are implicitly public static and final in interfaces.
//Prior to Java 8, you can't create static methods in interfaces. All methods are instance methods.
//since methods in interfaces can't have any implementation, making them final would make no sense:
//they would have no implementation, and could not be overridden.
	
//No method body {} only declaration /Only declaration Not Implementation
//Interface also called 100 Abstraction 
//Only declare method prototype its business logic write in another class
//Can't create Object of Interface
//No static method allowed
//but Interface variable are static in nature by default
//You can't create Object of Interface 
//Interface Variable by default static in Nature 
//Static variable called by Interface name if it is in the class then called by class name
//In Interface all method are abstract method without body on define/declare method no Implementation 
//we can’t change the value of an interface field. Because interface fields, by default, are final and static.
//They remain constant for whole execution of a program.
	
	int min_bal=100;
	public void debit(); 
	public void credit();
	public void transfer();

}
