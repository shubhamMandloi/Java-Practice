package javaPrgm;

import java.util.*;

public class count {

    public static void main(String args[]) throws Exception {

       /*-int arr[] = new int[5];

        for(int i =5;i>0;i--){
            arr[5-i] = i;
            Arrays.fill(arr,1,4,8);
        }
        for(int i=0;i<5;i++){
            System.out.println(arr[i]);

        }


*/


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String : ");
        String input = sc.nextLine();
        //int[] charArray = new int[26];
        int[] charArray = new int[256];

        for (Character c : input.toCharArray()) {
            //System.out.println((int)c);
            //charArray[(int) c - 97]++;
            charArray[256 - (int) c]++;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != 0)
                //System.out.println("occurance of " + (char) (i + 97) + " " + charArray[i]);
                System.out.println("occurance of " + (char) (256-i) + " " + charArray[i]);

        }
        System.out.println("-----using hashmap");


        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Converting given string to char array

        char[] strArray = input.toCharArray();

        // checking each char of strArray
        for (char c : strArray) {

            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
           /* if (charCountMap.containsKey(c))
                // If char is present in charCountMap,incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c) + 1);
            else
                // If char is not present in charCountMap,putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);

*/

        // Printing the charCountMap
        charCountMap.forEach((k, v) -> System.out.println("key is " + k + " and value is " + v));
        /*for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());


        }*/
    }
}