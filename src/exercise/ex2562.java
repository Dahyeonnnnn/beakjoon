package exercise;

import java.util.Scanner;

public class ex2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {

			arr[i] = scanner.nextInt();

		}

		int index = 0;
		int max = 0;
		for (int i = 0; i < 9; i++) {

			if(arr[i]>max) {
				max=arr[i];
				index=i+1;
				
			}
			

		}
		System.out.println(max);
		System.out.println(index);

//		int count = 0;
//		int max = 0;
//		int index = 0;
//
//		for (int value : arr) {
//			count++;
//
//			if (value > max) {
//				max = value;
//				index = count;
//			}
//		}
//		System.out.print(max + "\n" + index);

	}

}
