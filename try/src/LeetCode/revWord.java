package LeetCode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class revWord {
    /*-Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:
Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.*/

    public static String reverse(String s) {


        String[] strArray = s.replaceAll("\\s+", " ").trim().split(" ");

        for (int i = 0, j = strArray.length - 1; j > i; i++, j--) {
            String temp = strArray[i];
            strArray[i] = strArray[j];
            strArray[j] = temp;
        }
        return Arrays.stream(strArray).collect(Collectors.joining(" "));

        /*-for(int i = strArray.length-1;i>=0;i--){
            result.append(strArray[i]);
            if(i!=0)
                result.append(" ");
        }
        return result.toString();*/
    }

    public static void main(String[] args) {
        System.out.println(reverse("the sky is blue"));
    }
}
