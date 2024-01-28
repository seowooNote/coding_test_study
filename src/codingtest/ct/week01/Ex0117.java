package codingtest.ct.week01;

public class Ex0117 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열
		*/
		// 2차원 배열 선언
		int[][] a;
		int b[][];
		int[] c[]; // 지양하자
		
		// 2차원 배열 초기화
		int d[][] = {{1, 2}, {3, 4}}; // 2행 2열로 이루어진 2차원 배열
		int e[][] = new int[][] {{5, 6}, {7, 8}}; // 2행 2열로 이루어진 2차원 배열
		int f[][] = new int[3][2]; // 3행 2열로 이루어지 2차원 배열
		int g[][] = new int[3][]; // 3행 열은 아직 정해지 있지 않은 2차원 배열(열은 유동적으로 바뀐다는 의미)
		g[0] = new int[5]; // 1번 행은 5개의 공간을 가짐(2차원 배열을 재선언(수정)) -> 1번 행의 열은 5개
		g[1] = new int[3]; // 2번 행은 3개의 공간을 가짐 -> 2번 행의 열은 3개
		g[2] = new int[1]; // 3번 행은 1개의 공간을 가짐 -> 3번 행의 열은 1개
		g[0][0] = 0; // 2번 행은 3개의 공간을 가짐
		// [2][3] = 4; 오류 공간을 넘어섬 
	}

}