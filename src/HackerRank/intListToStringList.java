package HackerRank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class intListToStringList {
    static List<String> sortStringList(List<String> ss) {
        List<Double> unsorted =
                ss.stream()
                        .map(s -> Double.parseDouble(s))
                        .collect(Collectors.toList());

        System.out.println(unsorted);
        Collections.sort(unsorted);

        System.out.println(unsorted);
ss = unsorted.stream().map(s->BigDecimal.valueOf(s).toPlainString()).collect(Collectors.toList());

        System.out.println(ss);

        return ss;
    }
    public static void main(String[] args) {

        List<String> s = new ArrayList<String>(Arrays.asList("1","31415926535897932384626433832795","3","2"));



        s = sortStringList(s);

        System.out.println(s);
    }
}
