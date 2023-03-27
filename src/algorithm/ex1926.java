package algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import org.w3c.dom.Node;

public class ex1926 {
	
	static int[][] arr;
	
	static int count=0;
	static int max=0;
	static boolean[][] chk;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1.아이디어 : 
//		-2중 for=>값1&&방문x
//		-BFS 돌면서 그림 개수 +1, 최댓값을 갱신
		
//		2.시간복잡도:
//		BFS : O(V+E)
//		V : 500*500
//		E : 4*500*500
//		V*E : 5*250000=100만 <2억 >> 가능!
		
//		3.자료구조
//		그래프 전체 지도 : int[][]
//		방문 : bool[][]
//		Queue(BFS)
		
		Scanner scanner=new Scanner(System.in);
		
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		
		arr = new int[n][m];
        chk = new boolean[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==1 &&chk[i][j]==false) {
					chk[i][j]=true;
					//전체그림갯수+1
					count++;
					//BFS>그림 크기를 구해주고
					//최댓값 갱신
					max=bfs(i,j);
				}
			}
		}
		System.out.println(count);
		System.out.println(max);
		
	}
	
	static int[] dx = new int[]{1, 0, -1, 0};
	static int[] dy = new int[]{0, 1, 0, -1};
	
	public static int bfs(int i, int j) {
		int rs=1;
		
//		Queue<Node> q = new LinkedList<>();
//		q.add(new Node(i,j));
		
        for(int k=0;k<4;k++) {
        	int nx= i+dx[k];
        	int ny= j+dx[k];
        	
        	if(nx<0&&ny<0&&nx>=i&&ny>=j) {
        		if(chk[nx][ny]==false&&arr[nx][ny]==1) {
        			rs++;
        			chk[nx][ny]=true;
        		}
        		
        	}
        }
        
		return rs;
	}

}
