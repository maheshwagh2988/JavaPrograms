package String_Concept;

import java.util.Arrays;

public class ArraySort {
	
	int arr[] = {7,9,1,4,2,8,6,3,0};
	int temp;
	
	public void sortArray(){
		System.out.println("Unsorted Array is : ");		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		//Method-1:
		//Arrays.sort(arr);
		
		//Method-2:
		for(int i=0;i<arr.length-1;i++){
			for(int j=i;j<arr.length-1;j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("Sorted array is :");
		for(int a=0;a<arr.length;a++){
			System.out.println(arr[a]);
		}
	}
	
	public static void main (String args[]){
		ArraySort as = new ArraySort();
		as.sortArray();
	}

}
