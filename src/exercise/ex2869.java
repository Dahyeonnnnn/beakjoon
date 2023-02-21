package exercise;

import java.util.Scanner;

public class ex2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int v = scanner.nextInt();
		
//		int total=0;
//		int days=0;
//		
//		for(int i=0;i<v;i++) {
//			if(v>total) {
//				total+= a;
//				total-=b;
//				days++;
//			}
//			 
//		}
//		System.out.println(days);
		
//		int result = (v - a) / (a - b);
//
//		if ((v - a) % (a - b) == 0) {
//			System.out.println(result + 1);
//		} else {
//			System.out.println(result + 2);
//		}
		
		int days = (v - b) / (a - b);

		if ((v - b) % (a - b) != 0) {
			days++;
		} 
			System.out.println(days);
		
		
	}

}
