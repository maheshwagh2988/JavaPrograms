package ProgramsforJava;

import java.util.Scanner;

public class LargestElementArray {

	public static void main(String[] args) {
		int i, n;
		System.out.print("How many numbers ?\t");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int array[] = new int[n];
		for (i = 0; i < n; i++) {
			System.out.print("\nEnter number " + (i + 1));
			array[i] = scan.nextInt();
		}
		scan.close();
		for (i = 0; i < n; i++) {
			if (array[0] < array[i])
				array[0] = array[i];
		}
		System.out.print("\nThe largest among the " + n + " numbers is "+ array[0]);
	}
}
