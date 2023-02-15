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
					} else if (a.charAt(i + 1) == '-') {
						i++;
					}
				}
			}

			else if (ch == 'd') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == 'z') {
						if (i < a.length() - 2) {
							if (a.charAt(i + 2) == '=') { // dz= 일 경우
								i += 2;
							}
						}
					}

					else if (a.charAt(i + 1) == '-') { // d- 일 경우
						i++;
					}
				}
			}

			else if (ch == 'l') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == 'j') { // lj 일 경우
						i++;
					}
				}
			}

			else if (ch == 'n') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == 'j') { // nj 일 경우
						i++;
					}
				}
			}

			else if (ch == 's') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == '=') { // s= 일 경우
						i++;
					}
				}
			}

			else if (ch == 'z') {
				if (i < a.length() - 1) {
					if (a.charAt(i + 1) == '=') { // z= 일 경우
						i++;
					}
				}
			}

			count++;
		}

		System.out.println(count);

	}

}
