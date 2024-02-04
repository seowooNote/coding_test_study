package codingtest.ct.week02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex0207 {
	// List - Set (HashSet) 순서가 없고, 데이터 값의 중복을 허용하지 않음
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println(set.size()); // 3
		System.out.println(set.isEmpty()); // false
		
		// set 출력 -> Iterator 반복문
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		set.add("A");
		for(String str : set) {
			System.out.println(str);
		}
	}

}
