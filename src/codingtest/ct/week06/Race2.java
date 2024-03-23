package codingtest.ct.week06;

public class Race2 {

	public static void main(String[] args) {
		String[] players = {"mumu", "soe", "poe", "kai", "mine"};
		String[] callings = {"kai", "kai", "mine", "mine"};
		String[] answer = players;
        for(int i = 0; i < callings.length; i++) {
            for(int j = 0; j < players.length; j++) {
                if(callings[i] == players[j]) {
                    String temp = players[j];
                    players[j] = players[j - 1];
                    players[j - 1] = temp;
                }
            }
        }
		
        for(String str : answer) {
        	System.out.println(str);
        }

	}

}
