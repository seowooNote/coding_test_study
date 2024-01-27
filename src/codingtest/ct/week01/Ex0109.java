package codingtest.ct.week01;

public class Ex0109 {

	public static void main(String[] args) {
		// label 로 2중 반복문 빠져 나오기 ep: / break 뒤에 ep / escape
		// 2중 반복문의 무한 반복문 예시(위험함)
		ep:
		while(true) {
			for(int i = 0; i < 100; i++) {
				if(i == 50) {
					break ep;
				}
				System.out.println(i);
			}
		}

	}

}
