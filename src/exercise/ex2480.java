package exercise;

import java.util.Scanner;

public class ex2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();

		if (n1 == n2 && n2 == n3) {
			System.out.println(10000 + (n1 * 1000));
		} else if (n1 == n2 || n2 == n3 || n1 == n3) {
			if (n2 == n3) {
				System.out.println(1000 + (n2 * 100));
			} else {
				System.out.println(1000 + (n1 * 100));
			}
		} else {

			System.out.println((Math.max(n1, Math.max(n2, n3)) * 100));
		}

	}

}
