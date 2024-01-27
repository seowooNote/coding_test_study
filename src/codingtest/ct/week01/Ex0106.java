package codingtest.ct.week01;

public class Ex0106 {

	public static void main(String[] args) {
		// for 문
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		String[] arrays = {"a", "b", "c", "d", "e"};
		for(int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
		
		// 향상된 for 문
		for(String s : arrays) {
			System.out.println(s);
		}
		
		int[] numbers = {1, 2, 3, 4, 5};
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}

}
