package javaPrgm;

public class codility {


    public static int solution(int[] inputArray) {
        int negativeCount = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                return 0;
            }

            if (inputArray[i] < 0) {
                negativeCount++;
            }
        }
        if (negativeCount % 2 == 0) {
            return 1;
        } else return -1;
    }

    public static void main(String[] args) {


        int[] inputArray = new int[]{1, -2, -3, 5,0};
        System.out.println(solution(inputArray));


    }
}
