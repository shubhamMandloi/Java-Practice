package test;

public class test_rev {

    public static void main(String[] args) {

        String input = "1 37 643 3";

        char[] result = new char[input.length()];
        char[] inputArray = input.toCharArray();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
        int j = result.length - 1;
        for (int i = 0; i < result.length; i++) {
            if (inputArray[i] != ' ') {
                    if(result[j]==' ')
                        j--;
                result[j] = inputArray[i];
                j--;
            }

        }
        System.out.println(String.valueOf(result));
    }



}
