package algorithm;

import java.util.Scanner;

public class ex2559 {

	// 1.아이디어
	// 투포인터를 활용
	// for문으로 , 처음에는 k개값을 저장
	// 다음 인덱스 더해주고, 이전 인덱스 빼줌
	// 이때마다 최대값을 갱신

	// 2.시간복잡도
	// O(N)=1e5>가능

	// 3.자료구조
	// 각 숫자들 n개 저장 배열 :int[]
	// 숫자들 최대 100 > INT가능
	// K개의 값을 저장 변수 : int
	// 최대:k*100=1e5*100=1e7>int가능
	// 최대값:int

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int k = scanner.nextInt();

		int[] nums = new int[n];

		for (int i = 0; i < n; i++) {

			nums[i] = scanner.nextInt();

		}
		//k개를 더해주기
		int each=0;
		for(int i=0;i<k;i++) {
			
			each+=nums[i];
			
		}
		int max=each;
		//다음인덱스 더해주고, 이전 인덱스 빼주기
		for(int i=k;i<n;i++) {
			each+=nums[i];
			each-=nums[i-k];
			max=Math.max(max, each);
		}
		System.out.println(max);
	}

}
