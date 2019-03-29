package ConstructorExamples;

public class CopyConstructor {
	String web;
	CopyConstructor(String w) {
		web=w;
	}
	  /* This is the Copy Constructor, it 
	    * copies the values of one object
	    * to the another object (the object
	    * that invokes this constructor)
	    */
	CopyConstructor(CopyConstructor Copy) {
		web=Copy.web;
	}
	void Display(){
		System.out.println("Website "+web);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor cp= new CopyConstructor("This is Copy constructor  ");
		/* Passing the object as an argument to the constructor
		 * This will invoke the copy constructor
		 */
		CopyConstructor cp2= new CopyConstructor(cp);
		cp.Display();
		cp2.Display();

	}

}
