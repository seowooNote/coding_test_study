package codingtest.ct.week06;

public class KeyPad3 {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		String[] answerArr = new String[numbers.length];
        String answer = "";
        
        int left = 10; // 왼손 초기 세팅 *
        int right = 12; // 오른손 초기 세팅 #
    
        for(int i = 0; i < numbers.length; i++) {
        	if(numbers[i] == 0) numbers[i] = 11;
            if(numbers[i] % 3 == 1) {
                left = numbers[i];
                answerArr[i] = "L";
            } else if(numbers[i] % 3 == 0) {
                right = numbers[i];
                answerArr[i] = "R";
            } else if((numbers[i] % 3 == 2)) {
                int leftDistance = (Math.abs(numbers[i] - left) / 3) + (Math.abs(numbers[i] - left) % 3);
                int rightDistance = (Math.abs(numbers[i] - right) / 3) + (Math.abs(numbers[i] - right) % 3);
                if(leftDistance < rightDistance) {
                	left = numbers[i];
                    answerArr[i] = "L";
                }else if(leftDistance > rightDistance) {
                	right = numbers[i];
                	answerArr[i] = "R";
                }else if(leftDistance == rightDistance && hand.equals("right")) {
                	right = numbers[i];
                	answerArr[i] = "R";
                }else if(leftDistance == rightDistance && hand.equals("left")) {
                	left = numbers[i];
                    answerArr[i] = "L";
                }
            }
        }
        
        for(int i = 0; i < answerArr.length; i++) {
        	System.out.print(answerArr[i]);
        }
        
        
        
	}
}
