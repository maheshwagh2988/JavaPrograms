package ConstructorExamples;

public class ConstructorConcept {
//this keyword used to Initialize class/Global variable in the constructor with Local Variable
//this keyword used to Initialize Current Object
//super Keyword is used to call Parent class constructor if we don't write Super then it will called Default constructor of Parent class
//super Keyword Written in Child class 
//To Create multiple constructor in child class then create no of constructor in child class and call Super but one constructor has only one constructor	
//It it class entity to define some class feature while creating Object in the form of Global variable 
//The purpose of constructor is to initialize the object of a class
//while the purpose of a method is to perform a task by executing java code.
//Constructors cannot be abstract, final, static and synchronized while methods can be.
//Constructors do not have return types while methods do.
//Constructors name should be same as class name
//It look like a function but it not a function	
//Default Constructors mens Zero Parameter it called Automatically even if we are not define
//Constructors will call Immediately when we create a Object of this class
//if the method is static no need to create Object you can directly access it by given method name()	
	
	String name; //
	int age;    //these are Global variable will Initialize with current/Local variable of Constructor use this keyword
	
	public ConstructorConcept(){ //zero Parametres called as defalut constructor 
		System.out.println("Default Constructors");
	}
	public ConstructorConcept(String name,int age){ //This is also called constructor Overload with different Parameter 
		this.name=name; //this keyword used to Initialize Current Object  
		this.age=age;  //Global variable will Initialize with Local variable of Constructor
		System.out.println("Using this keyword name is: "+name);
		System.out.println("Using this keyword age  is: "+age);
	}
	public ConstructorConcept(int i){
		System.out.println("One Parametarized Constructors");
		System.out.println("Print Value of i"+i);
	}
	public ConstructorConcept(int i, int j){
		System.out.println("Two Parametarized Constructors");
		System.out.println("Print Value of i =: "+i);
		System.out.println("Print Value of j =: "+j);
	}
//Above Concept called Constructor OverLoading same name but different Parameter 
	
//Constructor Override Example Java. By rule in Java, a constructor cannot be overridden but a method can be overridden
//In method overriding,the super class method and subclass method should be of the same – same name, same return type and same parameter list	
//Example of Overriding is written in oops_convept_part2_naveen Parent and child class has same method name this is called method Overriding
	public static void main(String[] args) {
		
		ConstructorConcept c1=new ConstructorConcept();
		ConstructorConcept c2=new ConstructorConcept("Mahesh",30);
		ConstructorConcept c3=new ConstructorConcept(10);
		ConstructorConcept c4=new ConstructorConcept(10,20);
		
		
		

	}

}
