package codingtest.ct.week06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Race {

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		String[] answer = new String[players.length];
        
        Map<String, Integer> playersMap = new LinkedHashMap<>();
        for(int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
        }
        
        System.out.println(playersMap);
        
        for(int i = 0; i < callings.length; i++) {
        	
        }

	}

}
