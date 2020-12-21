package HackerRank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class productSort {

    public static int StringCompare(String s1, String s2){


        return 0 ;
    }


    public static void main(String[] args) {


        List<String> input = new ArrayList<>(Arrays.asList("a", "b", "a", "b", "a", "d", "c", "b", "b", "b", "c"));
        HashMap<String, Integer> map1 = new HashMap<>();

        TreeMap<Integer,String> map2 = new TreeMap<>();
        for (String str : input) {
            if (!map1.keySet().contains(str))
                map1.put(str, Collections.frequency(input,str));
        }

        map1.forEach((k, v) -> System.out.println("The key is " + k + " and the value is " + v));
        input.forEach(s -> System.out.println(Collections.frequency(input, s)));


        System.out.println(input);
    }
}
