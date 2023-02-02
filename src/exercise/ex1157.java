package exercise;

import java.util.Scanner;

public class ex1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[26];
		String a = scanner.next();

		

		for (int i = 0; i < a.length(); i++) {
			if ('A' <= a.charAt(i) && a.charAt(i) < 'Z') { // 대문자 범위
				arr[a.charAt(i) - 'A']++;
			} else { // 소문자 범위
				arr[a.charAt(i) - 'a']++;
			}
		}
		
		char most = '?';
		int max=0;
		
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				most = (char) (i + 65); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				most = '?';
			}
		}
		 System.out.println(most);
	}

}
