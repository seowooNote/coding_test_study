package condingtest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// https://www.acmicpc.net/problem/2161
public class Ex0305 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Queue<Integer> queue = new LinkedList<>(); 
		for(int i = 1; i <= n; i++) {
			queue.offer(i);
		}
		while(queue.size() > 1) {
			System.out.print(queue.poll().toString() + " ");
			queue.offer(queue.poll());
		}
		System.out.println(queue.poll());
		
	}

}
