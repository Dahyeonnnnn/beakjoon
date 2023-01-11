package exercise;

import java.util.Scanner;

public class ex2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); //시간
		int b = scanner.nextInt(); //분
		int c = scanner.nextInt(); //오븐시간

		if ((b + c) >= 60) {
			int plus = (b + c) / 60;
			a += plus;
			if (a > 24) {

				a -= 24;
			} else if (a == 24) {
				a = 0;
			}
			int B = (b + c) - 60 * plus;
			System.out.println(a + " " + B);

		} else {
			System.out.println(a + " " + (b + c));
		}

		// 시간을 분으로 바꿀 생각을 못함
//		int min = 60 * a + b; // 시 -> 분
//		min += c;
//
//		int hour = (min / 60) % 24;
//		int minute = min % 60;
//
//		if (hour >= 24) {
//			hour = hour - 24;
//		}
//
//		System.out.println(hour + " " + minute);
	}

}
