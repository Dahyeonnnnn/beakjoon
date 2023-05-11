package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class ex1920 {
	// 1.아이디어
	// n개의 숫자를 정렬
	// m개를 for문 돌면서 이진탐색
	// 이진탐색 안에서 마지막에 데이터 찾으면 1출력, 아니면 0출력

	// 2.시간복잡도
	// n개 입력값 정렬 = O(NlogN)
	// 총합:O((n+m)logn)=>가능

	// 3.자료구조
	// n개 숫자:int[]
	// m개 숫자:int[]

	
	static int[] nums;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		nums = new int[n];

		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		
		Arrays.sort(nums);

		int m = scanner.nextInt();
		int[] targetList = new int[m];

		for (int i = 0; i < m; i++) {
			targetList[i] = scanner.nextInt();
			
			search(0,n-1,targetList[i]);
			
		}
		
		
		
		

		
		
	}
	public static void search(int st,int en, int target) {
		if(st==en) {
			if(nums[st]==target) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
			return;
			
			
		}
		int mid=(st+en)/2;
		if(nums[mid]<target) {
			search(mid+1,en,target);
		}else {
			search(st,mid,target);
		}
	}

}
