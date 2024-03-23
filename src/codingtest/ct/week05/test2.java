package codingtest.ct.week05;

public class test2 {

	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] answer = new String[n];
        String[] arr1ToString = new String[arr1.length];
        String[] arr2ToString = new String[arr2.length];
        for(int i = 0; i < arr1.length; i++) {
            String a = Integer.toBinaryString(arr1[i]);
            arr1ToString[i] = String.format("%0"+ n +"d", Integer.parseInt(a));
        }
        for(int i = 0; i < arr2.length; i++) {
            String b = Integer.toBinaryString(arr2[i]);
            arr2ToString[i] = String.format("%0"+ n +"d", Integer.parseInt(b));
        }
        
        for(int i = 0; i < n ; i++) {
        	System.out.println(arr1ToString[i]);
        }
        for(int i = 0; i < n ; i++) {
        	System.out.println(arr2ToString[i]);
        }
        
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = "";
            for(int j = 0; j < n ; j++) {
                if(arr1ToString[i].charAt(j) == '0' &&  arr2ToString[i].charAt(j) == '0') {
                    answer[i] += " ";
                }
                else answer[i] += "#";
            }
        }
        
        for(int i = 0; i< answer.length; i++) {
        	System.out.println(answer[i]);
        }
	}

}
