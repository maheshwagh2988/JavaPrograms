package ProgramsforJava;

import java.util.Scanner;

public class UserInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Some number");
		int user_input_number =scan.nextInt();
		System.out.println("The Entered value is");
		System.out.println(user_input_number);
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Some String");
		String user_input_String =scan1.nextLine();
		
		System.out.println("The Entered Text is");
		System.out.print(user_input_String);
		
		

	}

}
