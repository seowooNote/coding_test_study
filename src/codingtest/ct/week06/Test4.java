package codingtest.ct.week06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};	
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		Map<String, Integer> map = new HashMap<>();
        for(String str : terms) {
			String[] strArr = str.split(" ");
			map.put(strArr[0], Integer.parseInt(strArr[1]));
		}
        
        String[] todayArr = today.split("[.]");
        int todayParseInt = 
				((Integer.parseInt(todayArr[0]) - 2000) * 12 * 28)
				+ ((Integer.parseInt(todayArr[1]) * 28))
				+ (Integer.parseInt(todayArr[2]));
        
        for(int i = 0; i < privacies.length; i++) {
            String[] privacySplit = privacies[i].split(" ");
            String[] privacyArr = privacySplit[0].split("[.]");
            int privacyParseInt = 
				((Integer.parseInt(privacyArr[0]) - 2000) * 12 * 28)
				+ ((Integer.parseInt(privacyArr[1]) * 28))
				+ (Integer.parseInt(privacyArr[2]));
            if(todayParseInt - privacyParseInt >= map.get(privacySplit[1]) * 28) {
            	list.add(i + 1);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        for(int num : answer) {
        	System.out.println(num);
        }

	}

}
