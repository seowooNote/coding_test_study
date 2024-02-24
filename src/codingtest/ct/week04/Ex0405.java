package codingtest.ct.week04;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex0405 {
// https://www.acmicpc.net/problem/28278
// 스택 2
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(str);
			int cmd = Integer.parseInt(st.nextToken());
			
			switch(cmd) {
			case 1:
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
				break;
			case 3:
				sb.append(stack.size()).append("\n");
				break;
			case 4:
				if(stack.isEmpty()) {
					sb.append(1).append("\n");				
				} else {
					sb.append(0).append("\n");	
				}
				break;
			case 5:
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
