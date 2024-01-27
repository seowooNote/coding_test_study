package codingtest.ct.week01;

public class Ex0111 {

	public static void main(String[] args) {
		// 구구단 만들기(2중 for 문) 가로
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				// format
				// 오른쪽 정렬
				System.out.printf("%d * %d = %2d ", i, j, (i * j));
				// 왼쪽 정렬(-)
//				System.out.printf("%d * %d = %-2d ", i, j, (i * j));
//				System.out.printf("%d * %d = %2d\n", i, j, (i * j));
			}
			System.out.println();
		}
	}

}
