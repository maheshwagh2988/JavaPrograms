package PatternPrograms;
/****
  *** 
   **
    */

public class Pattern3 {

	public static void main(String[] args) {
		
		//int iCount=0;
		for(int i=1;i<=4;i++){
			
			for(int j=0;j<i;j++)
				System.out.print(" ");
			
			for(int k=4;k>=i;k--){
				System.out.print("*");
			}
			//iCount++;
			System.out.println();
		}
	}

}
