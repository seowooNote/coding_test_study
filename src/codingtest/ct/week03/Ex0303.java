package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2164 백준 Queue 문제(카드2)
public class Ex0303 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		while(queue.size() > 1) {
			queue.poll();
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
	}

}
