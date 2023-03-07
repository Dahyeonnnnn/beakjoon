package exercise;

import java.util.Scanner;

public class ex2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int m = scanner.nextInt();
		int n = scanner.nextInt();

		int sum = 0;

		int min = n;

		for (int i = m; i <= n; i++) {
			boolean isPrime = true;
			if (i == 1) { // 1은 소수가 아님
				continue;
			}
			for (int j = 2; j <=  Math.sqrt(i); j++) { // 2~i-1까지의 수랑 i랑 나눠서 나머지가 0이면 소수가 아니므로 for문 스킵.
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				sum += i;
				if (min > i) {
					min = i;
				}
			}

		}
		if (sum == 0) {
			System.out.println(-1);
			
		}else {
			System.out.println(sum);
            System.out.println(min);

		}
	}

}
