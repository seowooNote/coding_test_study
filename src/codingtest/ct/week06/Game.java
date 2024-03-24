package codingtest.ct.week06;

import java.util.HashMap;
import java.util.Map;

public class Game {

	public static void main(String[] args) {
		int[] bandage = {1, 1, 1};
		int health = 5;
		
		int[][] attacks = {{1, 2}, {3, 2}};
		Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < attacks.length; i++) {
            map.put(attacks[i][0], attacks[i][1]);
        }
		int answer = health;
        int state = 0;
        System.out.println(attacks[attacks.length - 1][0]);
        System.out.println(map);
        for(int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            	// 공격 있을때
            if(map.containsKey(i)) {
            	state = 0;
            	answer -= map.get(i);
            	if(answer < 0) {
            		answer = -1;
            		break;
            	}
            } else {
            	// 공격 없을때 1) 추가 체력 회복
            	if(state == bandage[0]) {
                    state = 0;
                    answer += bandage[2];
                    if(answer > health) {
                        answer = health;
                        state = 0;
                    }
                } else if(state != bandage[0]){
                    state++;
                    answer += bandage[1];
                    if(answer > health) {
                        answer = health;
                        state = 0;
                    }
                }
            }
            
            
            
            System.out.println(answer);
        }
        
        System.out.println(answer);
        
        
        
//		System.out.println(attacks.length);
//		System.out.println();
//		System.out.println(attacks[0][0]);
//		System.out.println(attacks[1][0]);
//		System.out.println(attacks[2][0]);
//		System.out.println(attacks[3][0]);
		

	}

}
