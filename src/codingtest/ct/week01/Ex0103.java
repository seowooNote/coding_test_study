package codingtest.ct.week01;

public class Ex0103 {

	public static void main(String[] args) {
		int i = 10, j = 20;		// 대입연산자
		int k = -8;				

		int a = i + j;			// 산술연산자 +
		int b = i - j;			// -
		int c = i * j;			// *
		int d = i / j;			// /
		int e = i % j;			// %
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println();
		
		// 증감연산자
//		System.out.println(i++);	// 후위연산자
//		System.out.println(++j);	// 전위연산자
		
		System.out.println(i | j); 	// 비트연산자
		
		System.out.println(k >> 3); // 시프트연산자
	}

}
