

import java.util.Scanner;

public class FactorialOfNumber {
	int n,c,fact=1;
		
	public void calculateFactorial(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find Factorial : ");
		int n = sc.nextInt();
		if(n<0)
			System.out.println("Number entered should not be Negative");
		else
			for(int c=1;c<=n;c++){
				fact = fact*c;
			}
		System.out.println("Factorial of Number "+n+" is :"+fact);		
	}
	
	
	public static void main(String args[]){
		FactorialOfNumber fon = new FactorialOfNumber();
		fon.calculateFactorial();
	}

}

/*
 * 	FACTORIAL : In mathematics, the factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n. 
 	For example,
	5! = 5 * 4 * 3 * 2 * 1 = 120. 
 */
