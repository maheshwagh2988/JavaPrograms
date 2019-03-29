

import java.util.Scanner;


public class NoOfOccurenceElementArray {
	
    int n, x, count = 0, i = 0;
	char arr[] = {'a','a','b','b','c','c','a','c','c','b','b','b','b','d','d','e','e','b','b','a','a','b','b','a','a','s','s','b','b','c','c','s','s'};
	
	public void findele(){
		
		char f = 'a';
		
		for(int i=0;i<arr.length;i++){
			if (arr[i] == f && arr[i+1]==f){
				if(arr[i+2]!=f){
					count++;
				
				}
			}
		}
		
		System.out.println(count);
	}
	
	
	public static void main (String args[]){
		NoOfOccurenceElementArray noea = new NoOfOccurenceElementArray();
		noea.findele();
		
	}
	

}
