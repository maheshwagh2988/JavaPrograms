package Abstraction_And_Interface_Concept;
//A concrete method means, the method have complete definition.
//but it can be overridden in the inherited class, if we make this method "final" then it can not be override.
//declaring method or class "final" means it's implementation is complete. It is compulsory to override the abstract methods.

//In other words, we can say that any class which is not abstract is a concrete class.



 abstract class CanWeCreateObjectOfAbstractClass {
	 
	 //non abstract Method
	public CanWeCreateObjectOfAbstractClass(){
		System.out.println("Non Abstract Constructor of Abstract Class");
	}
	//non abstract Method
	public void myMethod() {
        System.out.println("Non Abstract Method of CanWeCreateObjectOfAbstract Class");
    }
	//Abstract Method 
	abstract void myAbstractTestMethod();
	

}
