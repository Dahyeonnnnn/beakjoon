package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex10951 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner in=new Scanner(System.in);
//		
//		while(in.hasNextInt()){
//		
//			int a=in.nextInt();
//			int b=in.nextInt();
//			System.out.println(a+b);
//		
//		}	
//		in.close();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;
		while ((str = br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a + b + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
