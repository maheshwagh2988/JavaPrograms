

import java.util.Scanner;

public class SumOfElementInArray {
	public static void main(String[] args) {
		int i, n, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("How many elements do u want to add ?\t");
		n = scan.nextInt();
		int array[] = new int[n];
		for (i = 0; i < n; i++) {
			System.out.print("\nEnter number" + (i + 1));
			array[i] = scan.nextInt();
		}
		scan.close();
		for (i = 0; i < n; i++) {
			sum = sum + array[i];
		}
		System.out.print("\nThe sum of " + n + " numbers is " + sum);
	}
}
