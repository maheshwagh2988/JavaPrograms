

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {
	
	public void determineLeapYear() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Year : ");
		int year = Integer.parseInt(br.readLine());
		//If it is a Century year and divisible by 400
		if(year%100 == 0 && year%400==0)
			System.out.println(year+" is a Leap Year");
		else 
		//If it is not a Century year and divisible by 4
		if(year%100!=0 && year%4==0)
			System.out.println(year+" is a Leap Year");
	else
			System.out.println(year+" is not a Leap Year");
		
	}
	
	public static void main (String args[]) throws IOException{
		LeapYear ly = new LeapYear();
		ly.determineLeapYear();
	}
}


/*
 * If the year is the beginning of a new century like 1900,2000,2100,2200 etc, it should be divisible by 400.Then it is called a Leap Year
 * If the year is not a century year like 1998,2007,2010 etc,it should be divisible by 4.Then it is called leap year.
*/
