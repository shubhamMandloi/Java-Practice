package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

public class testdb {

    //create func : input String : "Shubham Mandloi"
    //count vowel from input;
    //output : count of vowels
    //assuming input to be in lowercase

    //input : number , spaces, consecutive vowel, vowel at starting and at end. , all char value with vowel, no vowel

    static HashMap<Character, Integer> countVowel(String input) {
        HashMap<Character, Integer> resultMap = new HashMap<>();
        char[] vowelArray = new char[5];

        for (Character ch : input.toLowerCase().toCharArray()) {
            switch (ch) {
                case 'a':
                    vowelArray[0]++;
                    resultMap.put('a', resultMap.getOrDefault('a', 0) + 1);
                    break;
                case 'e':
                    resultMap.put('e', resultMap.getOrDefault('e', 0) + 1);
                    break;
                case 'i':
                    resultMap.put('i', resultMap.getOrDefault('i', 0) + 1);
                    break;
                case 'o':
                    resultMap.put('o', resultMap.getOrDefault('o', 0) + 1);
                    break;
                case 'u':
                    resultMap.put('u', resultMap.getOrDefault('u', 0) + 1);
                    break;
                default:
                    break;
            }
        }


        return resultMap;


    }

    public static void main(String[] args) {

        HashMap<Character, Integer> result = new HashMap<>();
        result = countVowel("11");
        if(!result.isEmpty())
            result.forEach((k, v) -> System.out.println("occurrence for " + k + ": " + v));
        else
            System.out.println("No Vowel present in input");

    }

}
