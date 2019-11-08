package ProgramsforJava;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		int i, j, k, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines[height of diamond] : \t");
		n = sc.nextInt();
		//scan.close();
		for (i = 1; i <= n; i++) {
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		for (i = n - 1; i >= 1; i--) {
			for (j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}