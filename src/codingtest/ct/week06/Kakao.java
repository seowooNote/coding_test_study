package codingtest.ct.week06;

import java.util.HashMap;
import java.util.Map;

public class Kakao {

	public static void main(String[] args) {
		String[] friends = {"a", "b", "c"};
		String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }
		int answer = 0;
		
		int[] index = new int[friends.length];
        int[][] exchange = new int[friends.length][friends.length];
		
        for(int i = 0; i < gifts.length; i++) {
            String[] arr = gifts[i].split(" ");
            index[map.get(arr[0])]++;
            index[map.get(arr[1])]--;
            exchange[map.get(arr[0])][map.get(arr[1])]++;
        }
        
        
		
        for(int i = 0; i < friends.length; i++) {
        	int cnt = 0;
            for(int j = 0; j < friends.length; j++) {
            	
                if(i == j) continue;
                if(exchange[i][j] > exchange[j][i]) {
                    cnt++;
                } else if(exchange[i][j] < exchange[j][i]) {
//                    cnt--;
                } else if(exchange[i][j] == exchange[j][i]) {
                    if(index[i] > index[j]) {
                    	cnt++;
                    }
                }
                
            }
            if(cnt > answer) {
            	answer = cnt;
            }
        }
		
        System.out.println(answer);
	}

}
