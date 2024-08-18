package javaPrgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class dupCheck {

    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,2,2,4,5,2,1,3,7,4));
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for (Integer i : input){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }

        freqMap.forEach((key,value)-> System.out.println("Key is "+key+" and its frequency is "+ value));

        //This will print only duplicate frequencies not the value
        List<Integer> resultList = freqMap.values().stream().filter(i->i>1).collect(Collectors.toList());

        resultList.forEach(i-> System.out.println(i));

    }
}
