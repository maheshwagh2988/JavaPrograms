package ProgramsforJava;
public class Print1to50 {

	public static void main(String[] args) {
				
		int j=50;
		for(int i=1;i<=j;i++){
			//System.out.println(i);
			if((i % 3==0) && (i % 5==0)){
				System.out.println("CloudRedux");
			}
				else
			if(i % 3==0){
				System.out.println("Cloud");
			}else if(i % 5==0 ){
				System.out.println("Redux");
			}else
				System.out.println(i);
		}

	}

}
