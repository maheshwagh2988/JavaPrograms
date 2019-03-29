package Edurekha;

public class Classvariable {
	//Class variable belongs to the class.
	//class variable is created by adding “static” keyword before the variable.
	//And most important class variable maintain a single shared value for all instance of a class, even if no instance object of the class exists.

	public static int tyre;
	public static void main(String[] args) {
		tyre=4;
		System.out.println("no of car tyre is "+tyre);
			

	}

}
