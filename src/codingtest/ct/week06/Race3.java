package codingtest.ct.week06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Race3 {

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		
		String[] answer = new String[players.length];
        for(int i = 0; i < players.length; i++) {
        	answer[i] = players[i];
        }
        
        for(String str : answer) {
        	System.out.print(str + " ");
        }
        
        for(int i = 0; i < callings.length; i++) {
        	for(int j = 1; j < answer.length; j++) {
        		if(callings[i] == answer[j]) {
        			String temp = answer[j - 1];
        			answer[j - 1] = answer[j];
        			answer[j] = temp;
        		}
        	}
        }
        System.out.println();
        for(String str : answer) {
        	System.out.print(str+ " ");
        }
		
        

	}

}
