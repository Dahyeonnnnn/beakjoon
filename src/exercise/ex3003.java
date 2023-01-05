package exercise;

import java.util.Scanner;

public class ex3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
//		int a1 = scanner.nextInt();
//		int a2 = scanner.nextInt();
//		int a3 = scanner.nextInt();
//		int a4 = scanner.nextInt();
//		int a5 = scanner.nextInt();
//		int a6 = scanner.nextInt();
//		
//		
//		int result=1-a1;
//		int result2=1-a2;
//		int result3=2-a3;
//		int result4=2-a4;
//		int result5=2-a5;
//		int result6=8-a6;
//		System.out.print(result+" "+result2+" "+result3+" "+result4+" "+result5+" "+result6);
//		
		
		int chess[]= {1,1,2,2,2,8};
		
		for(int i=0;i<chess.length;i++) {
			int a=scanner.nextInt();
			System.out.print(chess[i]-a+" ");
		}
		
		
	}

}
