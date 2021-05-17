package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConsecutiveSquare {


    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int result = 0;
        if (m == 1 && s.get(0) == d)
            return 1;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum = sum + s.get(j + i);
            }
            if (sum == d)
                result++;

        }
        return result;

    }

    public static void main(String[] args) {



        List<Integer> s = new ArrayList<Integer>(Arrays.asList(4));

        int result = birthday(s, 4, 1);

        System.out.println(result);
    }
}
