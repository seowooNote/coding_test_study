package codingtest.ct.week01;

public class Ex0116 {

	public static void main(String[] args) {
		// 배열
		/* 
		 * 1차원 배열
		 * 데이터값을 주지 않는다면?
		 *  byte ~ int = 0
		 *	long = 0L
		 * 	float = 0.0F 
		 * 	double = 0.0
		 * 	boolean = false
		 * 	class, object = null
		 */
		// 1차원 배열 선언
		int[] a;
		int b[];
		
		// 1차원 배열값 초기화 (배열은 데이터 수정이 가능하나, 크기를 늘릴 수 없음)
		char[] c = {'A', 'B', 'C'}; // 초기화 안시켜 주면 0이 들어가 있음
		int d[] = new int[3];
		System.out.println(d[0]); // 초기화 안시켜 주면 int 배열에 0이 들어가 있음 // 0
		System.out.println(c[1]); // B // c[index] 배열의 index 번호 (0부터 시작)
		d[0] = 1;
		d[1] = 2;
		d[2] = 3;
		System.out.println(d[2]); // 3
		
		float f[] = new float[] {1.2F, 2.3F, 3.4F}; // float 자료형의 배열이라 정수값을 넣어주어도 실수 형태로 변환되어 들어가 있음
		System.out.println(f[0]);
		f[2] = 4.5F; // 1차원 배열은 데이터의 수정이 가능하나 크기를 늘리거나 삭제할 수 없음
		System.out.println(f[2]);
		
		System.out.println();
		
		int[] score = new int[10];
		for(int i = 0; i < score.length; i++) {
			score[i] = i + 1; // score[0] = 1; ... score[9] = 10;
		}
		
		// 공공기관 변수 선언 예시
		// int sum;
		// sum = 0;
		
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);
	}

}
