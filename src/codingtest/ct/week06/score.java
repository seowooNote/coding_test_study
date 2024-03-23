package codingtest.ct.week06;

import java.util.HashMap;
import java.util.Map;

public class score {

	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		int[] answer = new int[photo.length];
		Map<String, Integer> scoreMap = new HashMap<>();
        for(int i = 0; i < name.length; i++) {
            scoreMap.put(name[i], yearning[i]);
        }
        
        System.out.println(scoreMap.containsKey("may"));
        
        for(int i = 0; i < photo.length; i++) {
        	int score = 0;
            for(int j = 0; j < photo[i].length; j++) {
                if(scoreMap.containsKey(photo[i][j])) {
                	score += scoreMap.get(photo[i][j]);
                	
                	
                }
            }
            answer[i] = score;
        }
        for(int i = 0; i < answer.length; i++) {
        	System.out.println(answer[i]);
        }
        

	}

}
