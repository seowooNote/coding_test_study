package codingtest.ct.week05;

import java.util.Scanner;

public class Ex0505 {

	public static void main(String[] args) {
		// 이진검색은 반드시 정렬되어야 한다.
		int arr[] = {5, 7, 11, 15, 20, 28, 29, 31, 39, 58, 68, 70, 95}; // 이진검색
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾을 수 : ");
		int n = scanner.nextInt();
		int idx = BinSearch.binSearch(arr, n);
		if(idx == -1) {
			System.out.println(String.format("존재하지 않는 %d 수", n));
		} else {
			System.out.println(String.format("%d 수는 arr[%d]에 존재", n, idx));
		}
	}

}

class BinSearch {
	static int binSearch(int[] a, int key) {
		int pl = a[0];
		int pr = a[a.length - 1];
		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) return pc;
			else if(a[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc - 1;
			}
		} while(pl <= pr);
		return -1;
	}
}
