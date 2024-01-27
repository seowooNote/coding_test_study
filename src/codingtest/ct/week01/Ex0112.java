package codingtest.ct.week01;

public class Ex0112 {

	public static void main(String[] args) {
		// 구구단 만들기(2중 for 문) 세로
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d * %d = %-2d ", j, i, (i * j));
			}
			System.out.println();
		}

	}

}
