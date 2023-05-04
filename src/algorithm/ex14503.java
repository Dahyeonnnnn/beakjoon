package algorithm;

import java.util.Scanner;

public class ex14503 {

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

	static int[][] map;
	static int n, m, r, c, d, answer;

	// 0: 북, 1: 동, 2: 남, 3: 서
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][m];

		r = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		clean();

		System.out.println(answer);
	}

	static void clean() {
		// 청소 시작
		int nr, nc, nd;
		boolean flag = true;
		while (flag) {
			if (map[r][c] == 0) {
				map[r][c] = 2;
				answer++;
			}
			// 4방향 탐색
			flag = false;
			for (int i = 0; i < 4; i++) {
				nd = (d + 3) % 4; // 왼쪽 방향
				nr = r + dr[nd];
				nc = c + dc[nd];
				d = nd;
				if (map[nr][nc] == 0) {
					r = nr;
					c = nc;
					flag = true;
					break;
				}
			}
			// 4방향 모두 청소가 되어있거나 벽인 경우
			if (!flag) {
				nd = (d + 2) % 4; // 후진 방향
				nr = r + dr[nd];
				nc = c + dc[nd];
				if (map[nr][nc] != 1) {
					r = nr;
					c = nc;
				} else {
					break;
				}
				flag = true;
			}
		}
	}

}
