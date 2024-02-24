package codingtest.ct.week03;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex0306 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> queue = new LinkedList<>();
		int n = scanner.nextInt();
		
		scanner.nextLine();
		
		for(int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(str);
			String cmd = st.nextToken(); // 1번째 토큰 : 명령
			
			switch(cmd) {
				case "push" :
					queue.offer(Integer.parseInt(st.nextToken()));
					break;
				case "pop" :
					if(queue.isEmpty()) {
//						System.out.println(-1);
						sb.append(-1).append("\n");
					} else {
//						System.out.println(queue.poll());
						sb.append(queue.poll()).append("\n");
					}
					break;
				case "size" :
//					System.out.println(queue.size());
					sb.append(queue.poll()).append("\n");
					break;
				case "empty" :
					if(queue.isEmpty()) {
//						System.out.println(1);
						sb.append(1).append("\n");
					}else {
//						System.out.println(0);
						sb.append(0).append("\n");
					}
					break;
				case "front" :
					if(queue.isEmpty()) {
//						System.out.println(-1);
						sb.append(-1).append("\n");
					} else {
//						System.out.println(queue.getFirst());
						sb.append(queue.getFirst()).append("\n");
					}
					break;
				case "back" :
					if(queue.isEmpty()) {
//						System.out.println(-1);
						sb.append(-1).append("\n");
					} else {
//						System.out.println(queue.getLast());
						sb.append(queue.getLast()).append("\n");
					}
					break;
				default :
					break;
			}
			
			System.out.println(sb.toString());
			
		}

	}

}
