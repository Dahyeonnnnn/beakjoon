package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ex1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();

		double[] arr = new double[a];

		for (int i = 0; i < a; i++) {

			arr[i] = scanner.nextInt();

		}

		double sum = 0;

		Arrays.sort(arr);

		for (int i = 0; i < a; i++) {
			sum += (arr[i] / arr[arr.length - 1]) * 100;

		}
		
//		따로 max값 비교해서 넣는 방법
//		int max=0;
//		for(int i=0; i<a; i++) {
//            arr[i] = sc.nextInt();
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//            sum += arr[i];
//        }
		
		double result = sum / a;

		System.out.println(result);
	}

}
