package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * sum = 총 합계 max = 최댓값 min = 최솟값 median = 중앙값 mode = 최빈값
		 */
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// median 과 mode 는 -4000~4000 을 제외한 수로 초기화하면 된다.
		int median = 10000;
		int mode = 10000;

		int count=0;
		boolean flag = false;
		int mode_max = 0;
		int jump = 0;	// 동일한 수가 나온만큼 i 값 jump 시킬 변수 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
			
			if(arr[i]==arr[i-1]) {
				count++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = arr[i];
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = arr[i];
				flag = false;
			}
			
			i += jump;
			
		}

		Arrays.sort(arr);
		

		System.out.println(sum / n);
		System.out.println(arr[n / 2]);
		System.out.println(mode);
		System.out.println(arr[n - 1] - arr[0]);

	}

}
