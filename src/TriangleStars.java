

import java.util.Scanner;

public class TriangleStars {
	
	public static void main(String[] args) {
		int i, j, k, n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines[height of Pyramid] : \t");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
