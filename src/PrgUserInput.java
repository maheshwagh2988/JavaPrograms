import java.util.Scanner;


public class PrgUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scna = new  Scanner (System.in);
		System.out.println("Enter some number");
		int user_input_number=scna.nextInt();
		
		System.out.println("The Enter Value is :");
		System.out.print(user_input_number);
		
		System.out.println();
		
		//Working With String 
		Scanner Str = new  Scanner (System.in);
		System.out.println("Enter some String");
		String user_input_String=Str.nextLine();
		
		System.out.println("The Enter String is :");
		System.out.print(user_input_String);

	}

}
