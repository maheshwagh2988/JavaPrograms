package ArraryConecpt;

public class Passing_Arrays_to_Methods {
	
	public static void main(String[] args) {
		int arr[]={3,2,5,9,7,8};
		sum(arr);

	}

	private static void sum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.println("Sum of Arrary Values= :"+sum);
		
	}

}
