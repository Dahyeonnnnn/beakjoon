package algorithm;

import java.util.Scanner;

public class ex14503 {
	public static int cnt = 0;
	static int[] dx = new int[] { 1, 0, -1, 0 };
	static int[] dy = new int[] { 0, 1, 0, -1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.아이디어
//		-특정한 조건을 만족하는 한 계속 이동>while
//		-4방향 탐색 먼저 수행 > 빈칸이 있을 경우 이동
//		-4방향 for무 탐색, 더이상 탐색 불가 시 뒤로 한칸 가서 반복
		
//		2.시간복잡도
//		while문 최대:n*m
//		각 칸에서 4방향 연산 수행
//		O(NM):50^2=2500
//		
//		3.자료구조
//		전체지도:int[][]
//		내 위치, 방향:int,int,int
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int map[][] = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for(int j=0;j<m;j++) {
				map[i][j]=scanner.nextInt();
			}
		}
	}

}
