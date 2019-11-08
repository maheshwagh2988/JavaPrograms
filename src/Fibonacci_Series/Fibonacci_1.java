package Fibonacci_Series;

public class Fibonacci_1 {

	public static void main(String[] args) {
		int n1=0,n2=1, n3; 
		int count=10;
		System.out.print(n1+" "+n2);
		for(int k=2;k<count;++k){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
