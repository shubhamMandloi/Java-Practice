package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class test6 {
    public static void main(String[] args) {
        //{'hello': [1,2,3,4], 'world':[ 3,4,99]}

        HashMap<String, ArrayList<String>> hmap = new HashMap<String, ArrayList<String>>();

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        hmap.put("hello", new ArrayList<>(Arrays.asList("1","2","3","4")));
        hmap.put("world", new ArrayList<>(Arrays.asList("3","4","99")));

        for(String key : hmap.keySet()){


            ArrayList<String> innerList = new ArrayList<>();
            ArrayList<String> innerList2 = new ArrayList<>();

            for(String str : hmap.get(key)){
                innerList.add(str);

            }
            innerList2.add(key);
            innerList2.add(innerList.toString());
            result.add(innerList2);
        }

        System.out.println(result);
    }
}
