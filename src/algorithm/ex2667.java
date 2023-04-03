package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex2667 {

	static int n;
	static boolean[][] chk;
	static int[][] map;
	static ArrayList<Integer> result; // 결과값을 저장할 리스트
	static int each = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.아이디어
//		2중for문, 값 1 &&방문x=>DFS
//		
//		2.시간복잡도
//		DFS:O(V+E)
//		V,E:N^2,4N^2
//		V+E:5N^2=625
//		
//		3.자료구조
//		그래프저장:int[][]
//		방문여부:bool[][]
//		결과값:int[]

		Scanner scanner = new Scanner(System.in);

		n = scanner.nextInt();
		scanner.nextLine();
		
		result = new ArrayList<Integer>();

		map = new int[n][n];
		chk = new boolean[n][n];

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				map[i][j] = scanner.nextInt();
//			}
//		}
		
		 // 입력 받은 지도를 map 이차원 배열에 저장
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }
		
		// 입력 받은 지도를 map 이차원 배열에 저장
       
		

        // 모든 좌표에 대해서 DFS 수행
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && chk[i][j] == false) {

					// 방문체크 표시
					// DFS로 크기 구하기
					// 크기를 결과 리스트에 넣기
					chk[i][j] = true;
					each = 0;
					dfs(i, j);
					result.add(each);

				}
			}
		}
		Collections.sort(result);
		System.out.println(result.size());

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	static int[] dx = new int[] { 1, 0, -1, 0 };
	static int[] dy = new int[] { 0, 1, 0, -1 };

	public static void dfs(int x, int y) {
		each += 1;
		// 4방향확인
		for (int k = 0; k < 4; k++) {
			int nx = x + dx[k];
			int ny = y + dy[k];

			if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1 && chk[nx][ny] == false) {

				chk[nx][ny] = true;
				dfs(nx, ny);
			}
		}
		
	}
}
