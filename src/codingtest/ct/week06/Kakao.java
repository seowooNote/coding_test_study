package codingtest.ct.week06;

import java.util.HashMap;
import java.util.Map;

public class Kakao {

	public static void main(String[] args) {
		String[] friends = {"muzi", "ryan", "frodo", "neo"};
		String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
		Map<String, Integer> map = new HashMap();
		for(String name : friends) {
            map.put(name, 0);
        }
		for(String gift : gifts) {
			String[] arr = gift.split(" ");
			map.put(arr[0], map.get(arr[0]) + 1);
			map.put(arr[1], map.get(arr[1]) - 1);
		}
		
		System.out.println(map.get("muzi"));
		System.out.println(map.get("ryan"));
		System.out.println(map.get("frodo"));
		System.out.println(map.get("neo"));
	}

}
