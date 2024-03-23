package codingtest.ct.week06;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * A 6개월
		 * B 1년
		 * C 3개월
		 * 
		 * 모든 달은 28일
		 */
		
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};	
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		
//		String day = "2021.05.02 A";
//		String newDay = day.replaceAll("[.]", "");
//		System.out.println(newDay);
//		String[] newDayArr = newDay.split(" ");
//		System.out.println(newDayArr[0]);
//		System.out.println(newDayArr[1]);
		
		
		Map<String, Integer> map = new HashMap<>();
		for(String str : terms) {
			String[] strArr = str.split(" ");
			map.put(strArr[0], Integer.parseInt(strArr[1]));
		}
		System.out.println("terms map");
		System.out.println(map);
		
		System.out.println("today 처리");
		String[] todayArr = today.split("[.]");
		System.out.println(todayArr[0]);
		System.out.println(todayArr[1]);
		System.out.println(todayArr[2]);
		System.out.println();
		
		System.out.println("today 일자로 처리");
		int todayParseInt = 
				((Integer.parseInt(todayArr[0]) - 2000) * 12 * 28)
				+ ((Integer.parseInt(todayArr[1]) * 28))
				+ (Integer.parseInt(todayArr[2]));
		
		System.out.println(todayParseInt);
		
		
		System.out.println();
		
		String[] privacySplit = privacies[0].split(" ");
		System.out.println(privacySplit[0]);
		System.out.println(privacySplit[1]);
		
		String[] privacyArr = privacySplit[0].split("[.]");
		int privacyParseInt = 
				((Integer.parseInt(privacyArr[0]) - 2000) * 12 * 28)
				+ ((Integer.parseInt(privacyArr[1]) * 28))
				+ (Integer.parseInt(privacyArr[2]));
		
		System.out.println(privacyParseInt);
		
		System.out.println(privacySplit[1]);
		
		boolean a = todayParseInt - privacyParseInt >= map.get(privacySplit[1]) * 28;
		System.out.println(a); // 파기
		
		int[] num = new int[2];
		
		
		
		
		
		
	}

}
