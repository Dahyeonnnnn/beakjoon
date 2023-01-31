package exercise;

import java.util.Scanner;

public class ex4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr;

		

		for (int i = 0; i < n; i++) {
			int N = scanner.nextInt(); // 학생 수
			arr = new int[N];
			
			double sum = 0;

			for (int j = 0; j < N; j++) { // 학생수만큼 반복
				arr[j] = scanner.nextInt();
				sum += arr[j];
			}

			double ave = (sum / N);
			double count = 0;
			
			for (int j = 0; j < N; j++) {
				if (ave < arr[j]) {

					count++;

				}
			}

			double per = (count / N);
			System.out.printf("%.3f%%\n",per*100);
		}

	}

}
