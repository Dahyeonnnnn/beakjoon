package exercise;

import java.util.Scanner;

public class ex2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String a = scanner.next();

		int count = 0;

		for (int i = 0; i < a.length(); i++) {

			char ch = a.charAt(i);

			if (ch == 'c') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == '=') {
						i++;
					}
				}
			}
		}

	}

}
