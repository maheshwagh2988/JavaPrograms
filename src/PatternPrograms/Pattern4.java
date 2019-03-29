package PatternPrograms;
///   *   and     *
//   **          * *
//  ***         * * *   
// ****        * * * *
public class Pattern4 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++){
			
			for(int j=4;j>=i;j--)
				
				System.out.print(" ");
			
				for(int k=1;k<=i;k++){
				//If you gave space before star then alos you will get Trangle Program
				System.out.print("*");
				//if we uncommnet it you will get Trangle Patten Program
				//System.out.print(" "); 
				
			}
			System.out.println();
			
		}

	}

}
