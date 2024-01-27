package codingtest.ct.week01;

public class Ex0115 {

	public static void main(String[] args) {
		// str1, str2 가 스택 메모리에 저장(변수)
		String str1 = "aaa";
		String str2 = "aaa";
		
		// equals 값만 같은지 비교
		System.out.println(str1.equals(str2)); // true
		// == 값과 주소가 같은지 비교
		System.out.println(str1 == str2); // true
		
		// str3, str4 가 heap 메모리에 저장(객체)
		// 스택 메모리에 str3, str4의 변수는 있으나 해당 값을 가지고 있는 것이 아니라 해당 주소 값을 가지고 있음
		String str3 = new String("aaa");
		String str4 = new String("aaa");
		System.out.println(str3 == str4); // false
		System.out.println(str1 == str4); // false
		System.out.println(str1.equals(str3)); // true
		

	}

}
