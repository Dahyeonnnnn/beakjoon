package exercise;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String a = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(a," ");
		
		System.out.println(st.countTokens());
	}

}
