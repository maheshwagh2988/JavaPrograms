package ProgramsforJava;

public class Star1 {
	public static void main(String args[]){
	String star = "";
	String space = "";
	for(int i=0;i<10;i++){
		for(int j=10;j>i;j--){
			star+="*";
		}
		System.out.println(star);
		star="";
		}
	}
}