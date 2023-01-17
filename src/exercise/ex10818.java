package exercise;


import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class ex10818 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
		
		
		//2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		int N = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		int index = 0;
//		int[] arr = new int[N];
//		while(st.hasMoreTokens()) {
//			arr[index] = Integer.parseInt(st.nextToken());
//			index++;
//		}
//		
//		Arrays.sort(arr);
//		System.out.print(arr[0] + " " + arr[N - 1]);
		
		
		//3
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		 
//		Integer.parseInt(br.readLine());	//첫 줄 N 은 안쓰이므로 입력만 받는다.
//		StringTokenizer st = new StringTokenizer(br.readLine()," ");
//		
//		int max = -1000001;
//		int min = 1000001;
//		
//		while(st.hasMoreTokens()) {
//			int val = Integer.parseInt(st.nextToken());
//			if(val>max) {
//				max = val;
//			}
//			if(val<min) {
//				min = val;
//			}
//		}
//		System.out.println(min + " " + max);
	}

}
