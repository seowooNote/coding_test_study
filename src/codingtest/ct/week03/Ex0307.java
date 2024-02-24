package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
// https://www.acmicpc.net/problem/1966
public class Ex0307 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트케이스 수
		
		for(int i = 0; i < t; i++) {
			sc.nextLine();
			String str1 = sc.nextLine();
			StringTokenizer token1 = new StringTokenizer(str1);
			int documentCount = Integer.parseInt(token1.nextToken()); // 문서 갯수
			int index = Integer.parseInt(token1.nextToken()); // index 번호
			
			// 문서의 중요도
			String str2 = sc.nextLine();
			String[] documentImportant = str2.split(" "); // ex [1, 2, 3, 4] 하지만 문자열인거 생각
			// queue에 문서의 중료도 담기
			LinkedList<Integer> queue = new LinkedList<>();
			for(int j = 0; j < documentImportant.length; j++) {
				queue.offer(Integer.parseInt(documentImportant[j]));
			}
			// 입력한 index 번호에 해당하는 출력수
			int indexCount = 0;
			
			while(!queue.isEmpty()){
				if(queue.peek() == Integer.parseInt(documentImportant[index])){
					indexCount++;
					break;
				} else {
					queue.offer(queue.poll());
					indexCount++;
				}
			}
			
			System.out.println(indexCount);
		}
		
		
		
	}

}
