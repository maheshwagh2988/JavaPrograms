package Java_Input_OutPut;
////Scanner is usually used to read user input and BufferedReader is commonly used to read a file line by line in Java.
//A scanner is a much more powerful utility than BufferedReader. It can parse the user input and read an int, short, byte, float, long and double apart from String. 
//On the other hand, BufferedReader can only read String in Java.
//If you are reading long String from a file, you should use BufferedReader large buffer (8KB)
//For short input and input other than String, you can use Scanner class.Scanner (1KB),
//BufferedReader  can only read and store String using readLine() method.

import java.util.Scanner;

public class Scanner_class {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		
		//// Getting String Integer
		System.out.print("Enter the Integer: ");
		int number=input.nextInt();
		System.out.println("You entered :"+number);
		
		// Getting String input
    	System.out.print("Enter text: ");
    	String myString = input.next();
    	System.out.println("Text entered = " + myString);
		
		
		// Getting float input
    	System.out.print("Enter float: ");
    	float myFloat = input.nextFloat();
    	System.out.println("Float entered = " + myFloat);
    	
    	
    	// Getting double input
    	System.out.print("Enter double: ");
    	double myDouble = input.nextDouble();
    	System.out.println("Double entered = " + myDouble);
	}

}
