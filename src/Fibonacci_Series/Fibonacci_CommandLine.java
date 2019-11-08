package Fibonacci_Series;

import java.util.Scanner;

public class Fibonacci_CommandLine {

	public static void main(String[] args) {
		int n,n1=0,n2=0,c=1;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the values n: ");
		n=sc.nextInt();
		System.out.print("Fibonacci series is :");
		for(int i=1;i<=n;i++){
			n1=n2;
			n2=c;
			c=n1+n2;
			System.out.print(n1+" ");
		}
		
		
	}

}
