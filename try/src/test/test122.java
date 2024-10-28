package test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class test122 {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5,1,1,1,1,5,5,2,2,6));


        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        Map<Integer,Long> hmap2 = new HashMap<Integer,Long>();

        /*-for(Integer i : input) {
         hmap.put(i, Collections.frequency(input, i);
        }*/
        //Collectors.toMap()
        hmap2= input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        hmap2.forEach((k,v)-> System.out.println("Key "+k + "  value "+v));

        TreeMap<Integer,Long> treeMap = new TreeMap<>(hmap2);

        int count = 0;
        for(Integer i : treeMap.keySet()){
            count++;
            if(count==2)
                System.out.println();
            if(count == treeMap.size()-2){

            }

        }

    }
}
