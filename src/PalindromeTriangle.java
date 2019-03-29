

import java.util.Scanner;

public class PalindromeTriangle {

	public static void main(String[] args) {
		int i, j, n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of lines[height of triangle] : \t");
		n = scan.nextInt();
		scan.close();
		for (i = 1; i <= n; i++) {
			for (j = i; j < n; j++)
				System.out.print(" ");
			for (j = 1; j <= i; j++)
				System.out.print(j);
			for (j = i - 1; j >= 1; j--)
				System.out.print(j);
			System.out.print("\n");
		}
	}
}