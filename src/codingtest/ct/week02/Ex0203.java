package codingtest.ct.week02;

import java.util.ArrayList;
import java.util.List;

public class Ex0203 {
	// List - AarrayList
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A"); // boolean add(E e)
		System.out.println(list.toString() + ", " + list.size());
		list.add("B"); // 순서대로 뒤에 저장됨
		list.add("D");
		System.out.println(list.toString() + ", " + list.size());
		list.add(2, "C"); // void add(int index, E element) / 해당 인덱스(2) 위치에 값("C")이 들어감 그리고 해당 위치를 기준으로 기존에 있던 데이터들은 뒤로 이동
		System.out.println(list.toString() + ", " + list.size());
		list.add("F");
		System.out.println(list.toString() + ", " + list.size());
		list.set(4, "E"); // E set(int index, E element) / 해당 인덱스(4) 위치에 값("E")이 수정되어 들어감
		System.out.println(list.toString() + ", " + list.size());
		
		System.out.println(list.get(3)); // E get(int index) / D
		
		System.out.println();
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d 번째 문자 : %s\n", i, list.get(i));
		}
		
		list.remove(1); // E remove(int index) / B 삭제 / 해당 인덱스 위치의 데이터를 삭제하고 그 뒤에 순서대로 데이터들이 있을 경우 해당 위치를 기준으로 있던 데이터들은 앞으로 이동
		list.remove("D"); // boolean remove(Object o) / 해당 List에서 "D" 문자열 데이터를 찾아서 삭제 /해당 인덱스 위치의 데이터를 삭제하고 그 뒤에 순서대로 데이터들이 있을 경우 해당 위치를 기준으로 있던 데이터들은 앞으로 이동
		for(String str : list) {
			System.out.printf("문자 : %s\n", str);
		}
		System.out.println(list.toString() + ", " + list.size());
	}

}
