package codingtest.ct.week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		Set<Integer> newSet = new HashSet<>();
		
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				newSet.add(numbers[i] + numbers[j]);
			}
		}
		
		List<Integer> newList = new ArrayList(newSet);
		System.out.println(newList);
		Collections.sort(newList);
		int[] result = new int[newList.size()];
		for(int i = 0; i < newList.size(); i++) {
			result[i] = newList.get(i);
		}
		System.out.println(result);
	
		
//		Set<Integer> newSet = new HashSet<>();
//		for(int num : numbers) {
//			newSet.add(num);
//		}
//		System.out.println(newSet);
//		List<Integer> newList = new ArrayList(newSet);
//		System.out.println(newList);
		
//		for(int i = 0; i < newList.size() - 1; i++) {
//			for(int j = i + 1; j < newList.size(); j++) {
//				
//			}
//		}
		
		
	}

}
