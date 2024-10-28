package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class test {
// 0 1 1 2 3 5 8 13 21 34

    public static void printFibSeries(int input){

        System.out.println(calFib(input));

        }


    public static int calFib(int input) {

        if (input == 0) {
            System.out.println(input);
            return 0;
        }
        else if (input == 1 || input == 2) {
            System.out.println(input);
            return 1;

        }
        return calFib(input - 1) + calFib(input - 2);
    }
    public static void main(String[] args) {
        int input = 10;
        printFibSeries(input);


        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1,"Alice");
        hmap.put(2,"Jon");
        hmap.put(3,"David");
        hmap.put(4,"Bob");
        hmap.put(5,"Freddy");
        hmap.put(6,"Bob");



       LinkedHashMap<Integer,String> sortedMap =  hmap.entrySet().stream()
                .sorted(HashMap.Entry.comparingByValue())
                .collect(Collectors.toMap(HashMap.Entry::getKey,Map.Entry::getValue,
                        (e1,e2)->e2,LinkedHashMap::new));

       sortedMap.forEach((k,v)-> System.out.println("Key : "+k + " and value is : "+ v));


    }
}
