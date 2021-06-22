package javaPrgm;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Codility2 {

    public static int solution(int[] A) {

        Set<Integer> inputArray = new TreeSet<Integer>();

        for (Integer i : A) {
            inputArray.add(i);
        }
        int maximum = 0;

        while (! inputArray.isEmpty()) {
            maximum = Collections.max(inputArray);
            if (inputArray.contains(0 - maximum)) {
                System.out.println(maximum);
                break;
            } else {
                inputArray.remove(maximum);
                maximum=0;
            }

        }
        return maximum;


    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{1, -2, -3, 5,3};
        System.out.println(solution(inputArray));

    }
}
