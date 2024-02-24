package codingtest.ct.week04;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
// https://www.acmicpc.net/problem/10828
// 스택
public class Ex0404 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			String cmd = st.nextToken();
			switch(cmd) {
			case "push":
				int x = Integer.parseInt(st.nextToken());
				stack.push(x);
				break;
			case "pop":
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
				break;
			case "size":
				sb.append(stack.size()).append("\n");
				break;
			case "empty":
				if(stack.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
				break;
			case "top":
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.peek()).append("\n");
				}
				break;
			default :
				break;
			}
		}
		System.out.println(sb.toString());
	}

}
