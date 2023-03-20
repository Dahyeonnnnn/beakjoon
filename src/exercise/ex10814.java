package exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ex10814 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		String[][] arr = new String[n][2];
		
		for(int i=0;i<n;i++) {
			arr[i][0]=scanner.next();
			arr[i][1]=scanner.next();
		}
		
		Arrays.sort(arr,new Comparator<String[]>() {
		
		public int compare(String[] s1,String[] s2) {
			return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
		}
		});
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}

}
