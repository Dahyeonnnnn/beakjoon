package exercise;

import java.util.Scanner;

public class ex8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			String[] ox = new String[n];
			ox[i] = scanner.next();
			
			int sum = 0;
			int num = 0;

			for (int j = 0; j < ox[i].length(); j++) {	//내부 순환
				if (ox[i].charAt(j) == 'O') {	//charAt으로 내부 값 검사
					num++;
					sum += num;
				} else {
					num = 0;

				}
				
			}
			System.out.println(sum);
		}
	}

}
