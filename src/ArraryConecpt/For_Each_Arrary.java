package ArraryConecpt;

public class For_Each_Arrary {
	
	public static void main(String[] args) 
	{
		int marks[]={125,132,95,116,110};
		int highest_marks=maximum(marks);
		System.out.println("The highest score is " + highest_marks); 

	}

	private static int maximum(int[] Number) 
	{
		int maxSoFar=Number[0];
		for(int num:Number)
		{
			if(num>maxSoFar)
			{
				maxSoFar=num;
			}
		}
		
		return maxSoFar;
	}

}
