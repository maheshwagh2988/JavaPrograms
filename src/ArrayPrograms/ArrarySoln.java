package ArrayPrograms;

import java.io.InputStream;
import java.util.Scanner;

public class ArrarySoln {
	 static int irnag=0;
	public static int soluation(int []A) {
		
		int[] A1 = {0};
		for(int iCount=1;iCount<irnag;iCount++)
		{
		
			for(int iCheck=0;iCheck<=A.length-1;iCheck++){
				System.out.println("Current Value "+A[iCheck]);
				
				if(A[iCheck]==iCount)
				{
					A1[iCheck]=0;
					//continue;
				}
				else
					A1[iCheck]=iCount;
				
			}
			for(iCount=0;iCount<A1.length-1;iCount++)
			{
				if(A1[iCount]==0)
					continue;
				return A[iCount];
						
			}
			return iCount;
			
		}
		
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		int A[]={1,2,5,3,8,7,9};
		
		System.out.println("please enter number int");
		Scanner sc= new Scanner(System.in);
		irnag=sc.nextInt();
		System.out.println("Returned "+soluation(A));
	}
	
	
}
