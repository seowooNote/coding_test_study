package codingtest.ct.week02;

import java.util.Scanner;

public class Ex0201 {

	public static void main(String[] args) {
		System.out.println("세 정수의 최대값을 구하세요!");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("A 값 : ");
		int a = scanner.nextInt();
		System.out.print("B 값 : ");
		int b = scanner.nextInt();
		System.out.print("C 값 : ");
		int c = scanner.nextInt();
		
		int max = a; // 최댓값 먼저 들어오는 a가 최대값이면서 최솟값인 세팅
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.printf("최대값 : %d", max);
	}

}
