package codingtest.ct.week02;

public class Ex0202 {

	// 최댓값, 최솟값 구하기
	public static void main(String[] args) {
		System.out.println(MaxMin.max(1, 2, 3));
		System.out.println(MaxMin.min(-10, -17, 18));
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 5, 4, 3, 2, 1};
		System.out.println(MaxMin.max(a));
		System.out.println(MaxMin.maxmin(a)[0]); // 최댓값
		System.out.println(MaxMin.maxmin(a)[1]); // 최솟값
	}

}

class MaxMin {
	static int max(int a, int b, int c) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		return max;
	}
	
	// 오버로딩
	static int max(int[] arr) {
		if(arr.length <= 0) return 0; // arr의 크키가 0일때(해당 배열의 데이터의 값이 아무것도 들어있지 않을때) 처리
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i]> max) max = arr[i];
		}
		return max;
	}
	
	static int min(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		return min;
	}
	
	// 최댓값 최소값 동시에 가져오기
	static int[] maxmin(int[] arr) {
		int mm[] = new int[2];
		int max = arr[0];
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		mm[0] = max;
		mm[1] = min;
		return mm;
	}
}
