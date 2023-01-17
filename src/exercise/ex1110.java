package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ex1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		int copy = N;
        
		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
		} while (copy != N);
		
		System.out.println(cnt);
	}

}
