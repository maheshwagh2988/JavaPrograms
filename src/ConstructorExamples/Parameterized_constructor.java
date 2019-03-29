package ConstructorExamples;

public class Parameterized_constructor {

	private int Var;
	public Parameterized_constructor(int num)
    {
		Var=num;
    }
	/*public Parameterized_constructor()
    {
		this.Var=12;
    }*/
	public int getValue()
    {
            return Var;
    }
	public static void main(String[] args) {
		
		//If we don't pass Value 10 then it will throws an complilation error 
			Parameterized_constructor myobj= new Parameterized_constructor(10);
			System.out.println("value of var is: "+myobj.getValue());
			

	}

}
