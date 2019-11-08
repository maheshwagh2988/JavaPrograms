package Fibonacci_Series;

public class Fibonacci_3_WhileLoop {

	
	public static void main(String[] args) {
		int n1=0,n2=1,n3, count=10;
		int i=1;
		System.out.print(n1+" "+n2);
		while(i<=count){
			System.out.print(" "+n2);
			 n3=n1+n2;
			 n1=n2;
			 n2=n3;
			 i++;
			 
		}

	}

}
