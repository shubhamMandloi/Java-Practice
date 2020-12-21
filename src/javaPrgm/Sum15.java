package javaPrgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum15 {


    public static void main(String[] args) {

        String a = "abc";
        String b = new String("abc");

        if (a == b) {
            System.out.println("True for string ref");
        }
        if (a.equals(b))
            System.out.println("True for equals");

        /*-List<Integer> input = new ArrayList<Integer>(Arrays.asList(1, 5, 2, 100, 20, 9, 10, 13, 17));
        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size() - 1; j++) {
                if (input.get(i) + input.get(j) == 15) {
                    System.out.println("Numbers are " + input.get(i) + " " + input.get(j));
                    break;
                }


            }

        }*/


    }

}

