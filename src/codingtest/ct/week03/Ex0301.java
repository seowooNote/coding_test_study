package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Queue;

public class Ex0301 {
	// QUEUE - FIFO(선입선출) 자료구조
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1); // 1추가
		System.out.println(queue.toString()); // [1]
		queue.offer(2); // 2추가
		queue.offer(3); // 3추가
		queue.offer(4); // 4추가
		queue.offer(5); // 5추가
		System.out.println(queue.toString()); // [1, 2, 3, 4, 5]
		
		System.out.println(queue.peek()); // peek 맨 앞에 있는 것을 가져옴 -> 1
		System.out.println(queue.toString());
		System.out.println(queue.poll()); // poll 맨 앞에 있는 것을 가져오고 그 대상은 해당 queue 에서 제거됨(peek랑 차이점)
		System.out.println(queue.toString());
		System.out.println(queue.isEmpty()); // queue 가 비었는지? true or false -> false
		queue.clear(); // queue 의 값들 다 제거
		System.out.println(queue.toString()); // [ ]
		System.out.println(queue.isEmpty()); // true
	}

}
