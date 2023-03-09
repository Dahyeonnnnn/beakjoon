package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		StringBuilder sb = new StringBuilder();	// Scanner 로 입력받아 sort 를 쓸 경우 출력은 BufferedWriter 을 쓰던가, StringBuilder를 써서 한 번에 출력해주어야 한다. 
												//아니면 시간 초과가 나기 때문이다.
		
		int n =scanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			list.add(scanner.nextInt());
			
			
		}
		Collections.sort(list);	//Arrays.sort 로 풀면 시간초과가 난다. ArrayList 에 모든 원소를 입력받아 저장하고 Collections 패키지에 있는 sort() 를 사용하여 정렬을 한다.
		
		for(int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}

}
