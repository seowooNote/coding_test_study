package codingtest.ct.week05;

import java.util.Scanner;
import java.util.StringTokenizer;

// 백준 Tree 문제
// https://www.acmicpc.net/problem/1068
public class Ex0507 {
	private static int n;
	private static int parent[];
	private static boolean visited[];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt(); // 숫자 갯수
		parent = new int[n];
		visited = new boolean[n];
		scanner.nextLine();
		
		String str = scanner.nextLine(); // 입력할 노드
		StringTokenizer st = new StringTokenizer(str);
		for(int i = 0; i < n; i++) {
			parent[i] = Integer.parseInt(st.nextToken());
		}
		
		int rmIdx = scanner.nextInt(); // 삭제할 인덱스 번호
		remove(rmIdx);
		
		int count = leafCount();
		System.out.println(count);
	}
	
	/*
	 * 삭제 메소드
	 */
	static void remove(int idx) {
		visited[idx] = true;
		for(int i = 0; i < n; i++) {
			if(parent[i] == idx) remove(i);
		}
	}
	
	/*
	 * 리프 노드 갯수 메소드
	 */
	static int leafCount() {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			if(visited[i]) continue;
			if(isLeaf(i)) sum ++;
		}
		return sum;
	}
	
	/*
	 * 리프 노드 여부 메소드
	 */
	static boolean isLeaf(int idx) {
		visited[idx] = true;
		boolean isLeaf = true;
		for(int i = 0; i < n; i++) {
			if(parent[i] == idx) {
				isLeaf = false;
				break;
			}
		}
		return isLeaf;
	}

}
