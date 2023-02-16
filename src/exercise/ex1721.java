package exercise;

import java.util.Scanner;

public class ex1721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if (c <= b) {
			System.out.println("-1");
		} 
		else {
			System.out.println((a/(c-b))+1);
		}
	}

}
