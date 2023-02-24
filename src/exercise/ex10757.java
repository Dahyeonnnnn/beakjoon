package exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class ex10757 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		BigInteger A = new BigInteger(scanner.next());
		BigInteger B = new BigInteger(scanner.next());
		
		A = A.add(B);
		
		System.out.println(A.toString());
	}

}
