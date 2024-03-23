package codingtest.ct.week06;

public class Test5 {

	public static void main(String[] args) {
		int answer = 0;
//		String t = "3141592";
//		String p = "271";
//		String t = "500220839878";
//		String p = "7";
		String t = "10203";
		String p = "15";
//		System.out.println(t.substring(0, p.length()));
		for(int i = 0; i < t.length() - p.length() + 1; i++) {
			if(Integer.parseInt(t.substring(i, i + p.length())) <= Integer.parseInt(p)) {
				answer++;
			}
		}
		System.out.println(answer);
		
	}

}
