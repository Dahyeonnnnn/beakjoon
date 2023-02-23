package exercise;

import java.util.Scanner;

public class ex2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		int count = 0;

		if (n % 5 == 0) {
			count = n / 5;
		} 
		else if(n==4||n==7) {
			count = -1;
		}
		
		else {

			int res = n % 5;// 4,3,2,1


			if (res == 4) {
				count = n / 5 - 1 + 3;
			} else if (res == 3) {
				count = n / 5 + res / 3;
			} else if (res == 2) {
				count = n / 5 - 2 + 4;
			} else if (res == 1) {
				count = n / 5 - 1 + 2;

			}
		}
		System.out.println(count);
	}

}
