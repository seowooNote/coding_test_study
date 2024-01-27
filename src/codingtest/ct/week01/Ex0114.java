package codingtest.ct.week01;

public class Ex0114 {

	public static void main(String[] args) {
		// char charAt
		String str = "Good Morning";
		System.out.println("charAt : " + str.charAt(7)); // r
		
		// boolean startWith 대소문자를 구별함
		System.out.println("startWith : " + str.startsWith("good")); // false
		
		// boolean endsWith 대소문자를 구별함
		System.out.println("startEnd : " + str.endsWith("ng")); // true
		
		// boolean equals 대소문자를 구별함
		System.out.println("equals : " + str.equals("good morning")); // false
		
		// int indexOf 시작점의 해당 첫번째 인덱스 위치
		System.out.println("indexOf : " + str.indexOf("Mor")); // 5
		
		// int lastIndexOf	끝나는 지점의 해당 첫번째 인덱스 위치
		System.out.println("lastIndexOf : " + str.lastIndexOf("Mor")); // 5
		
		// int length 공백 포함 문자열의 길이
		System.out.println("length : " + str.length()); // 12
		
		// String replace 
		System.out.println("replace : " + str.replace("Good", "a"));
		// 요즘 Java 버전은 replaceAll 기능을 자동으로 수행해줌
		System.out.println("replace : " + str.replace("o", "a"));
		
		// String replaceAll
		System.out.println("replaceAll : " + str.replaceAll("Good", "a")); // 문자열 Good을 a로 바꿔라
		// 정규식 표현 []
		System.out.println("replaceAll : " + str.replaceAll("[Good]", "a")); // [] 내부의 G or o or d 인 것들을 모두 a로 바꿔라
		
		
	}

}
