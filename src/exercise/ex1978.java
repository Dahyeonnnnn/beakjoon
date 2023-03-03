package exercise;

import java.util.Scanner;

public class ex1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		

		int count = 0;

		for (int i = 0; i < n; i++) {

			boolean isPrime = true;
			
			int k = scanner.nextInt();

			if (k == 1) {
				continue;
			}

			for (int j = 2; j <= Math.sqrt(k); j++) {
				if (k % j == 0) {
					isPrime = false;
					break;
				}

			}
			if (isPrime) {
				count++;
			}
		}
		System.out.println(count);

	}

}
