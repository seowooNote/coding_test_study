package codingtest.ct.week01;

public class Ex0108 {

	public static void main(String[] args) {
		// break 문
//		int i = 0;
//		
//		for(i = 0; i < 100; i++) {
//			if(i == 50) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		// 2중 반복문의 무한 반복문 예시(위험함)
		while(true) {
			for(int i = 0; i < 100; i++) {
				if(i == 50) {
					break;
				}
				System.out.println(i);
			}
		}
		

	}

}
