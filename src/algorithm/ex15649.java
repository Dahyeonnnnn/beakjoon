package algorithm;

import java.util.Scanner;

public class ex15649 {

	static int[] arr;
	static int n, m;
	static boolean[] chk;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.아이디어
//		백트래킹 재귀함수 안에서, for 돌면서 숫자 선택(이때 방문 여부 확인)
//		재귀함수에서 M개를 선택할 경우 프린트
//		
//		2.시간복잡도
//		
//		N!>가능
//		
//		3.자료구조
//		방문여부: bool[]
//		선택한 값 입력 배열:int[]

		Scanner scanner = new Scanner(System.in);

		n = scanner.nextInt();
		m = scanner.nextInt();

		arr = new int[m+1];
		chk = new boolean[n+1];

		recur(0);
	}

	public static void recur(int num) {
		if (num == m) {
			for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
			System.out.println();
			return;

		}
		for(int i=1;i<n+1;i++) {
			if (chk[i]=false) {
				chk[i]=true;
				arr[num]=i;
				recur(num+1);
				chk[i]=false;
			}
		}
	}

}
