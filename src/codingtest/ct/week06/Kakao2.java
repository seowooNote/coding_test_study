package codingtest.ct.week06;

import java.util.HashMap;
import java.util.Map;

public class Kakao2 {

	public static void main(String[] args) {
		String[] friends = {"muzi", "ryan", "frodo", "neo"};
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		Map<String, Integer> map = HashMap<>();
        for(int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }
        
        int[] index = new int[friends.length];
        int[][] exchange = new int[friends.length][friends.length];
        
        for(int i = 0; i < gifts.length; i++) {
            String[] arr = gifts[i].split(" ");
            index[map.get(arr[0])]++;
            index[map.get(arr[1])]--;
            exchange[map.get(arr[0])][map.get(arr[1])]++;
        }
        
        int[] cnt = new int[friends.length];
        
        for(int i = 0; i < friends.length; i++) {
            for(int j = 0; j < friends.length; i++) {
                if(i == j) continue;
                if(exchange[i][j] > exchange[j][i]) {
                    cnt[i]++;
                } else if(exchange[i][j] < exchange[j][i]) {
                    cnt[j]++;
                } else if(exchange[i][j] == exchange[j][i]) {
                    if(index[i] > index[j]) {
                    	cnt[i]++;
                    } else if(index[i] < index[j]) {
                    	cnt[j]++;
                    }
                }
            }
        }
        
        for(int a : cnt) {
        	System.out.println(a);
        }
        
	}

}
