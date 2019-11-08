package PalindromePrograms;

public class PalendromInteger {

	public static void main(String[] args) {
		int rev,temp;
		int sum=0;
		int number=121; //It is the number variable to be checked for palindrom
		temp=number;
		while(number>0){
			rev=number%10; //Getting Remainder
			sum=(sum*10)+rev;
			number=number/10;
			}
		
		if(temp==sum)
			System.out.println("Number is Paledrom");
		else
			System.out.println("Not Palendrom");
		
		

	}

}
