package LeetCode;

public class reverseVowel {
    /*-Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "hello"
Output: "holle"
Example 2:
Input: s = "leetcode"
Output: "leotcede"     */

    public static boolean isVowel(Character checkChar){
        return switch (Character.toUpperCase(checkChar)) {
            case 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
    }
    public static String reverseVowel(String str){
        StringBuilder rev = new StringBuilder("");
        StringBuilder strin = new StringBuilder(str);
        for(Character ch : str.toCharArray()){
            if(isVowel(ch))
                rev.append(ch);
        }
        rev.reverse();
        for(int i = 0;i<str.length();i++){
            if(isVowel(str.charAt(i))){
                strin.setCharAt(i,rev.charAt(0));
                rev.deleteCharAt(0);
            }

        }

        return  strin.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverseVowel("leetcode"));

    }

}
