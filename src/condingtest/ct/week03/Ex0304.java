package condingtest.ct.week03;

import java.util.LinkedList;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2164 백준 Queue 문제(회전하는 큐)
public class Ex0304 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<>();
		int n = scanner.nextInt();
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		int m = scanner.nextInt();
		int arr[] = new int[m];
		
		for(int i = 0; i < m; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int cnt = 0;
		for(int num : arr) {
			int index = queue.indexOf(num);
			int half = queue.size() / 2;
			if(index < half) {
				while(num != queue.getFirst()) {
					queue.addLast(queue.removeFirst());
					cnt++;
				}
			}else {
				while(num != queue.getFirst()) {
					queue.addFirst(queue.removeLast());
					cnt++;
				}
			}
			queue.pollFirst();
		}
		System.out.println(cnt);
	}
}
