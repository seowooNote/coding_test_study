package codingtest.ct.week06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
//		int[] win_nums = {31, 10, 45, 1, 6, 19};
//		int[] lottos = {44, 1, 0, 0, 31, 25};
//		int[] win_nums = {38, 19, 20, 40, 15, 25};
//		int[] lottos = {0, 0, 0, 0, 0, 0};
		int[] win_nums = {45, 4, 35, 20, 3, 9};
		int[] lottos = {20, 9, 3, 45, 4, 35};
		int max = 7;
		int min = 7;
		int[] answer = new int[2];
		
		for(int i = 0; i < win_nums.length; i++) {
			for(int j = 0; j < lottos.length; j++) {
				if(lottos[j] == 0) {
					max--;
					lottos[j] = -1;
				}
				if(win_nums[i] == lottos[j]) {
					max--;
					min--;
				}
			}
		}
		
		answer[0] = max == 7 ? 6 : max;
		answer[1] = min == 7 ? 6 : min;
		
		System.out.println(answer[0]);
		System.out.println(answer[1]);

	}

}
