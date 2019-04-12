package Abstraction_And_Interface_Concept;
////Can't create a Object of Interface
//If we have to achieve 100 % Abstraction then we have to use  Interface
//Or In Interface I can have only only Abstract method 
//It is Abstract in Nature
//No need to write Abstract Keyword 
//No need to define method body {}
//Only we can define/declaration ();the method in Interface
//We Not define any business logic into the Interface
//Only Prototype /Define BluePrint 
//Interface is a blueprint for your class that can be used to implement a class ( abstract or not)
//The point is interface cannot have any concrete methods.
//Concrete methods are those methods which have some code inside them; in one word - implemented.

//strict rules you need to follow:

//All methods that you declare in an interface can have ‘ static ’, ‘ default ’ or ‘ abstract ’ modifiers ( Since Java 8 ). 
//Implicitly they are ‘ public abstract ’.
//Since Java 8, methods can be implemented ( can have a code body ) in an interface if only if it is declared static or default.
//Abstract methods cannot have a body; all they can have is a method signature
//Variables are not allowed in interface. Hence any data declaration is ‘ public static final ’; hence only constants.	
//Interfaces can extend other interfaces ( one or more ) but not classes ( abstract or not ).
//Interfaces cannot be instantiated(Can't create Object) as they are not concrete classes.
//Methods and constants cannot be declared ‘ private ’, methods cannot be declared ‘ final ’.


//Only Final and Static variable we can define in Interface

public interface Car {
	
	int wheel=4; //By Default it will declare as Final or Static 
	public static final int Testnumber = 1;
	

	public void start();
	public void stop();
	public void refuel();
	public abstract void On();
	

	
	
	
	
	
	
	

}
