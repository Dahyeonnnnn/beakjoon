package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ex1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int[] arr= new int[a];
		
		for(int i=0;i<a;i++) {
			
			
			arr[i] = scanner.nextInt();
			
			
		}
		Arrays.sort(arr);
		
		
		double sum=0;
		
		for(int i=0;i<a;i++) {
			sum=arr[i]/arr[arr.length-1]*100;
		
		}
		double result=sum/a;
		
		System.out.println(result);
	}

}
