package basicJavaPgms;

import java.util.Scanner;

public class PrimeCompositeNum {
	
	int n, i, res;
	boolean flag=true;
	
	public void primeno(){
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter a No.");
		n=scan.nextInt();
		for(i=2;i<=n/2;i++)
		{
			res=n%i;
			if(res==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is not a Prime Number.It is a Composite Number");
	}
	
	public static void main (String args[]){
		PrimeCompositeNum pn = new PrimeCompositeNum();
		pn.primeno();		
	}
}
