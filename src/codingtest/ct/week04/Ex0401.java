package codingtest.ct.week04;

import java.util.Arrays;
import java.util.Stack;

public class Ex0401 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1); // 요소 넣기
		System.out.println(stack.toString());
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println(stack.toString());
		stack.pop(); // LIFO 마지막에 들어간 요소가 제거됨
		System.out.println(stack.toString());
		System.out.println(stack.peek()); // 맨 마지막 요소 보여주기 3
		System.out.println(stack.isEmpty()); // 비어있는가? false
		System.out.println(stack.search(4)); // 매개변수에 해당의 요소를 찾는다 / 못찾으면 -1 찾으면 순번(배열의 index 아님, LIFO 식 순서임)을 리턴
		System.out.println(stack.search(3)); // 1
		System.out.println(stack.search(2)); // 2
		System.out.println(stack.search(1)); // 3
		System.out.println(stack.contains(2)); // 해당 요소가 포함되어 있는가? true
		System.out.println(stack.containsAll(Arrays.asList(1, 2, 3))); // 해당 요소가 포함되어 있는가? 단 매개변수가 Collection 형태이어야 함 => Arrays.asList()변형 
		System.out.println(stack.containsAll(Arrays.asList(1, 2, 4))); // false
		System.out.println(stack.size());
	}

}
