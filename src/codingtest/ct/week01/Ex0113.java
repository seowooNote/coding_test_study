package codingtest.ct.week01;

public class Ex0113 {

	public static void main(String[] args) {
		// 별 찍기
		/*
		*
		**
		***
		****
		*****
		*/
		for(int i = 0; i < 5; i++ ) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		    *
		   **
		  ***
		 ****
		*****
		*/
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		*****
		****
		***
		**
		* 
		*/
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		*****
		 ****
		  ***
		   **
		    *
		*/
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		   	*
		   ***
		  *****
		 *******
		*********
		// 오른쪽 공백은 생각하지 말자 -> 왼쪽 공백만 고려
	   	*/
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		*********
		 *******
		  *****
		   ***
		    *
		// 오른쪽 공백은 생각하지 말자 -> 왼쪽 공백만 고려
		*/
		for(int i = 5; i >= 1; i--) {
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
