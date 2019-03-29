package basicJavaPgms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayElementSearch {
	
	char[] arr = {'Q','R','U','F','D','S','K','L','T','G'};
	int arrint[] = {7,9,1,4,2,8,6,3,0};
	int i = 0;
	boolean found= false;
	
	public void searchElement() throws IOException{
		System.out.println("Enter the Number to be searched");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		int searchnum = Integer.parseInt(br.readLine());
		for(i=0;i<arrint.length;i++){
			if(arrint[i] == searchnum)
			{
				found =true;
				break;
			}	
		}
		
		if(found)
		{
			System.out.println("Number found at position "+(i+1));
		}
		else
		{
			System.out.println("Number not found in this array");
		}
	}
	
	public void searchElementChar() throws IOException{
		System.out.println("Enter the Character to be searched");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		char searchChar = (char)br.read();
		for(i=0;i<arr.length;i++){
			if(arr[i] == searchChar)
			{
				found =true;
				break;
			}	
		}
		
		if(found)
		{
			System.out.println("Character found at position "+(i+1));
		}
		else
		{
			System.out.println("Character not found in this array");
		}
	}
	
	public static void main (String args[]) throws IOException{
		ArrayElementSearch aes = new ArrayElementSearch();
		aes.searchElement();
		aes.searchElementChar();
	}

}
