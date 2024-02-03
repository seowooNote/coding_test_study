package codingtest.ct.week02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex0206 {
	// List - LinkedList
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();	
		long startTime; // long startTime = 0L;
		long endTime;
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i)); // String.valueOf() String으로 형변환
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + "ns");
		
		long startTime2; // long startTime = 0L;
		long endTime2;
		startTime2 = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i)); // String.valueOf() String으로 형변환
		}
		endTime2 = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime2 - startTime2) + "ns");
	}

}
