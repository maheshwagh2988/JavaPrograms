package ArrayPrograms;

public class Find_Largest_Val_Given_Array {

	public static void main(String[] args) {
		int []arr={12,50,30,45,120};
		int val=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i] > val){
				val=arr[i];
			}
		}
		System.out.println("Gargesh value from Given arrary is: "+val);
	}

}
