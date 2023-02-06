package exercise;

import java.util.Scanner;

public class ex1152 {

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
		
		int sum=0;
		
		for(int i=0;i<a.length();i++) {
			if(arr[i]>0) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
