package StringPrgms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class duplicateWord {

    public static void main(String[] args) {

      /*- ArrayList<String> inputList = new ArrayList<String>(Arrays.asList("Shubham","Ruchika","Venkat","Shubham"));


        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        for( String eachString : inputList){

            hmap.put(eachString, hmap.getOrDefault(eachString,0)+1);

        }
        hmap.forEach((k,v)-> System.out.println(k +"  "+v));

        for(String eachKey : hmap.keySet()){
            if(hmap.get(eachKey)>1)
                System.out.println("Duplicate name : "+ eachKey);
        }


        */
            String[] namesArray = {"Shubham","Venkat","Ruchika","Shubham"};
            for(int i = 0; i<namesArray.length;i++) {
                for (int j = i + 1; j < namesArray.length ; j++)

                    if (namesArray[i].equals(namesArray[j]))
                        System.out.println("Duplicate found :" + namesArray[i]);


            }
    }
}
