package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex2108 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int sum = 0;

		int mode = 10000;

		int count = 1;

		boolean flag = false;
		int mode_max = 0;
		int jump = 0; // 동일한 수가 나온만큼 i 값 jump 시킬 변수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];

		}
		Arrays.sort(arr);

		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] != arr[j]) {
					break;
				}
				count++;
				jump++;
			}

			if (count > mode_max) {
				mode_max = count;
				mode = arr[i];
				flag = true;
			} else if (count == mode_max && flag == true) {
				mode = arr[i];
				flag = false;
			}

			i += jump;

		}

		System.out.println((int)Math.round((double)sum / n));
		System.out.println(arr[n / 2]);
		System.out.println(mode);
		System.out.println(arr[n - 1] - arr[0]);

	}

}
