package codingtest.ct.week01;

public class Ex0110 {

	public static void main(String[] args) {
		// continue 문
		// 홀수만 출력하기
		for(int i = 1; i < 100; i++) {
			if(i % 2 == 0) continue;
			System.out.println(i);
		}
	}

}
