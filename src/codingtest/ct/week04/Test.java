package codingtest.ct.week04;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		String plus = "1 + 2 = 3";
		String[] answer = plus.split(" ");
		System.out.println(answer[0]); // x
		System.out.println(answer[1]);
		System.out.println(answer[2]); // y
		System.out.println(answer[3]);
		System.out.println(answer[4]); // z
		System.out.println(answer[1].equals("+"));
		System.out.println(answer[0] + answer[2]);
		System.out.println(Integer.parseInt(answer[0]) + Integer.parseInt(answer[2]));
		
	}

}
