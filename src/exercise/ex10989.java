package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ex10989 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i=0;i<n;i++) {
			sb.append(arr[i]).append('\n');
		}
		
		System.out.println(sb);
	}

}
