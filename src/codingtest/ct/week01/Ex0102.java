package codingtest.ct.week01;

public class Ex0102 {

	public static void main(String[] args) {
		byte b = 0; 				// 1byte == 8bit
		char c = 'A', c1 = 65;		// 2byte == 16bit / 아스키 코드 0 -> 48 / A -> 65 / a -> 97
		short s = 1000;				// 2byte == 16bit
		int i = 65;					// 4byte == 32bit / 정수
		long l = 10000000000000l; 	// 8byte == 64bit / 정수 / 값 선언 시 마지막에 L or l
		
		float f = 3.141592f;		// 4byte = 32bit / 실수 / 값 선언 시 마지막에 f or F
		double d = 3.141592;		// 8byte = 32bit / 실수 
		
		boolean t = false;			// 
	}

}
