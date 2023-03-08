package exercise;

import java.util.Scanner;

public class ex9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int T = scanner.nextInt();

		for (int i = 0; i < T; i++) {


			int n = scanner.nextInt();
			
			int div,rem;
			div=n/2;
			rem=n-div;
			
			while(true) {
				if(isPrime(div)&&isPrime(rem)) {
					break;
				}else {
					div--;
					rem++;
				}
			}
			System.out.println(div+" "+rem);


			
		}
	}

	//소수확인
	public static boolean isPrime(int n) {
		boolean check=true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				check=false;
				break;
			}
		}
		
		return check;
	}
	
}
