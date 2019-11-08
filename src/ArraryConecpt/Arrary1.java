package ArraryConecpt;

public class Arrary1 {

	
	public static void main(String[] args) {
	      
		//Declares an Array of integers. 
		int [] arr1;
		arr1=new int[2];
		arr1[1]=10;
		
       //Allocating memory for 5 integers. 
		int [] arr=new int[5];
	   
		//Initialize the elements of the array 
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
	   // accessing the elements of the specified array
		for (int i=0;i<arr.length;i++){
			System.out.println("Element at Index " +i+ " : "+arr[i]);
		}


	}

}
