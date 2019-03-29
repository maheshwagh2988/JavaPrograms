package ArraryConecpt;

public class TwoDimArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[][]= new String[3][5];//[Row][Column] 3 rows and 5 column arrary
		System.out.println("Arrary Lenght of Row is: "+a.length);
		System.out.println("Arrary Lenght of column is: "+a[0].length);
		
		//1st Row
		a[0][0]="A";
		a[0][1]="B";
		a[0][2]="C";
		a[0][3]="D";
		a[0][4]="E";
		//2nd Row
		a[1][0]="A1";
		a[1][1]="B1";
		a[1][2]="C1";
		a[1][3]="D1";
		a[1][4]="E1";
		//3rd Row
		a[2][0]="A2";
		a[2][1]="B2";
		a[2][2]="C2";
		a[2][3]="D2";
		a[2][4]="E2";
		
		System.out.println("Value of Arrary a[2][0] is : "+a[2][0]);
		
		System.out.println("===================================== ");
		
		System.out.println("Below is the [3][5] Martix will display ");
		
		try{
		
		for (int i=0;i<5;i++){
			for(int j=0;j<5;j++)
				System.out.print(a[i][j] +" ");
				System.out.println();
			}
		}
			catch (Exception e) {
				// TODO: handle exception
			}
		System.out.println("==================================");
		System.out.println("Another way to Print Arrary using length function");

		try{
			
			for (int Row=0;Row<a.length;Row++){
				for(int Colmun=0;Colmun<a[0].length;Colmun++)
					System.out.print(a[Row][Colmun] +" ");
					System.out.println();
				
				}
			}
				catch (Exception e) {
					// TODO: handle exception
				}
	}

}
