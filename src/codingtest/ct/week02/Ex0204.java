package codingtest.ct.week02;

import java.util.Arrays;
import java.util.List;

public class Ex0204 {
	// List - arrayList
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C"); // asList() 배열 형태가 List 형태로 바뀜(Arrays)
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
		
		for(String str : list1) {
			System.out.printf("문자 : %s\n", str);
		}
		
		System.out.println();
		
		for(int number : list2) {
			System.out.printf("정수 : %d\n", number);
		}
		
	}

}
