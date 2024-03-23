package codingtest.ct.week05;

public class test {
	public static void main(String[] args) {
		String dartResult = "1T2D3D#";
		int answer = 0;
        String[] splitDartResult = dartResult.split("[A-Z]");
        String bonus = dartResult
            .replaceAll("[^A-Z]", "")
            .replace("S", "1")
            .replace("D", "2")
            .replace("T", "3");
        System.out.println(bonus);
        System.out.print(splitDartResult[0]);
        System.out.print(splitDartResult[1]);
        System.out.println(splitDartResult[2]);
        System.out.println();
        
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) {
            arr[i] = (int) Math.pow(Integer.parseInt(splitDartResult[i].replace("*", "").replace("#", "")), Character.getNumericValue(bonus.charAt(i)));
        }
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println();
        
        for(int i = 0; i < splitDartResult.length; i++) {
            if(splitDartResult[i].contains("*") && i > 1) {
                arr[i - 2] *= 2;
                arr[i - 1] *= 2;
            } else if(splitDartResult[i].contains("#") && i > 1) {
                arr[i - 1] *= -1;
            } else if(splitDartResult[i].contains("*")) {
                arr[i - 2] *= 2;
            } else if(splitDartResult[i].contains("#")) {
                arr[i - 2] *= -1;
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[0] + arr[1] + arr[2]);
	}
}
