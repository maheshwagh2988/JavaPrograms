import java.util.Scanner;


public class PrintAddition {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Addistion of two Number is "+(Integer.parseInt(args[0])+Integer.parseInt(args[1])-Integer.parseInt(args[2])));
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st numer ");
		int user_input_number=sc.nextInt();

		System.out.println("Enter the 2st numer ");
		user_input_number+=Integer.parseInt(sc.next());
		
			
		System.out.println("Addistion of two Number is "+user_input_number);
		
	}

}
