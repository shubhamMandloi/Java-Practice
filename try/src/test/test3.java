package test;

import java.util.HashMap;


public class test3 {

    public static HashMap<String, Integer> countOccurence(String input) throws NullPointerException{
        HashMap<String, Integer> result = new HashMap<>();

        try {
            if(!input.isEmpty()) {
                for (String eachString : input.split(" ")) {


                    String str = eachString.replaceAll("[,.@#;:]", "");
                    result.put(str.toLowerCase(), result.getOrDefault(str.toLowerCase(), 0) + 1);

                }
            }

        }catch(NullPointerException e){
            System.out.println(" NUll Pointer Exception"+e.getMessage());
        }


        return result;
    }


    public static void main(String[] args) {
        //String input ="This is sample para is a This a ,  SSD,";
        String input ="";
        System.out.println(countOccurence(input));


    }
}
