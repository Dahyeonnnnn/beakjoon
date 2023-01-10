package exercise;

import java.util.Scanner;

public class ex2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int h = scanner.nextInt();
		int m = scanner.nextInt();
		
		int M=60+(m-45);
		
		if(m<45) {
			h--;
			if(h<0) {
				h=23;
			}
			System.out.println(h+" "+M);
		}else {
			System.out.println(h+" "+(m-45));
		}
	}

}
