package test;

import java.util.ArrayList;
import java.util.Arrays;

public class test5 {

    public static void main(String[] args) {

        ArrayList<String> input = new ArrayList<>(Arrays.asList("hello", "world", "this", "is", "Python"));
        ArrayList<String> checkInput = new ArrayList<>(Arrays.asList("e", "i"));
        ArrayList<String> result = new ArrayList<>();

        for (String str : input) {
            boolean isCheck = false;
            for (String strCheck : checkInput) {

                if (str.contains(strCheck))
                    isCheck = true;
            }
            if (!isCheck) {
                result.add(str);
            }

        }
        result.forEach(s -> System.out.println(s));
    }
}
