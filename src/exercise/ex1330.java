package exercise;

import java.util.Scanner;

public class ex1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if (a==b) {
			System.out.println("==");
		}else{
			System.out.println("<");
		}
	}

}
