package exercise;

import java.util.Scanner;

public class ex10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		for(int i=0;i<t;i++) {
			int h=scanner.nextInt();
			int w=scanner.nextInt();
			int n=scanner.nextInt();
			
//			내가 풀려고한 방식
//			int fl=0;
//			int room=0;
//			if(n>h) {
//				fl = n%h;
//				room=n/h+1;
//			}else {
//				fl=h;
//				room=1;
//			}
//			
//			if(room<10) {
//			System.out.print(fl+"0"+room);
//			}else {
//				System.out.print(fl+room);
//			}
//			
			
			if(n % h == 0) {
				System.out.println((h * 100) + (n / h)); // 최소 100의 자릿수부터 시작하므로, Y 에 100을 곱해주면 된다.
 
			} else {
				System.out.println(((n % h) * 100) + ((n / h) + 1));
			}
			
		}
		
		
		
		
		//버퍼 사용 시
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		StringBuilder sb = new StringBuilder();
//		int T = Integer.parseInt(br.readLine());	// 테스트 케이스
// 
//		for (int i = 0; i < T; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
// 
//			int H = Integer.parseInt(st.nextToken());
//			st.nextToken();			// W 는 그냥 버린다.
//			int N = Integer.parseInt(st.nextToken());
// 
//			if (N % H == 0) {
//				sb.append((H * 100) + (N / H)).append('\n');
// 
//			} else {
//				sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
//			}
//		}
//		System.out.print(sb);
	}

}
