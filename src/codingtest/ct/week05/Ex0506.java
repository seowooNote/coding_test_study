package codingtest.ct.week05;

import java.util.Arrays;
import java.util.Scanner;

public class Ex0506 {

	public static void main(String[] args) {
		int arr[] = {5, 7, 11, 15, 20, 28, 29, 31, 39, 58, 68, 70, 95};
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾을 수 : ");
		int n = scanner.nextInt();
		
		int idx = Arrays.binarySearch(arr, n); // 해당 수를 찾지 못하면 -1 리턴이 아니라 음수가 랜덤으로 리턴될 수 있는 것을 생각
		if(idx < 0) {
			System.out.println(String.format("존재하지 않는 %d 수(%d)", n, idx));
		} else {
			System.out.println(String.format("%d 수는 arr[%d]에 존재", n, idx));
		}
		
	}

}
