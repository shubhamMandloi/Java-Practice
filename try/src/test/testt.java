package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class testt {

    public static void main(String[] args) {

/*-
        the original list is : ['gfg','is','best','for','geeks']
        the character list is : ['g','o']
        The filtered srings are : ['is','best']

        Find duplicate characters in a string.
*/

        ArrayList<String> input = new ArrayList<>(Arrays.asList("gfg","is","best","for","geeks"));
        ArrayList<String> inputCheck = new ArrayList<>(Arrays.asList("g","o"));
        ArrayList<String> result = new ArrayList<>();

        for(String str : input){
            boolean isFound = false;

            for(String eachStrCheck : inputCheck )

                    if(str.contains(eachStrCheck))
                        isFound=true;

            if(!isFound)
                result.add(str);
        }

        result.forEach(s-> System.out.println(s));


        String s="GFGEE";
        HashMap<Character, Integer> hmap = new HashMap<>();

        for(Character ch : s.toCharArray()){
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);


        }

        System.out.println("Duplicate chars");
        for(Character ch : hmap.keySet()){
            if(hmap.get(ch)>1){
                System.out.println(ch);
            }

        }

    }
}
