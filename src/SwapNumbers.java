

import java.util.Scanner;

public class SwapNumbers {
	
	int x, y, temp;
	
	Scanner sc = new Scanner(System.in);
	
	public void swapNum(){
		
		System.out.println("Enter the number x :");
		int x = sc.nextInt();
		System.out.println("Enter the number y :");
		int y = sc.nextInt();
		
		System.out.println("Numbers before Swapping");
		System.out.println("x = "+x+"\ty = "+y);
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("Numbers after Swapping");
		System.out.println("x = "+x+"\ty = "+y);
	}
	
	public void swapNumWithoutTemp(){
		System.out.println("Enter the number x :");
		int x = sc.nextInt();
		System.out.println("Enter the number y :");
		int y = sc.nextInt();
		
		System.out.println("Numbers before Swapping");
		System.out.println("x = "+x+"\ty = "+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Numbers after Swapping");
		System.out.println("x = "+x+"\ty = "+y);		
	}
	
	
	public static void main (String args[]){
		SwapNumbers sn = new SwapNumbers();
		sn.swapNum();
		sn.swapNumWithoutTemp();
	}

}
