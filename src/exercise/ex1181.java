package exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ex1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		String[] arr= new String[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scanner.next();
		}
		
		Arrays.sort(arr,new Comparator<String>() {
			public int compare(String s1,String s2) {
				if(s1.length()==s2.length()) {
					return s1.compareTo(s2); // 사전 순 정렬
				}
				else {
					return s1.length()-s2.length(); //양수면 위치 변환, 0이나 음수면 그대로
				}
			}
		});
		
		System.out.println(arr[0]);
		
		for(int i=1;i<n;i++) {
			// 중복되지 않는 단어만 출력
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
	}

}
