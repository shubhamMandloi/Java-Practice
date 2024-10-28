package test;

public class test4 {

   /*- isOneAway("abcde", "abcd");  // should return true
    isOneAway("abde", "abcde");  // should return true
    isOneAway("a", "a");  // should return true
    isOneAway("a", "e");  // should return true
    isOneAway("abcdef", "abqdef");  // should return true
    isOneAway("abcdef", "abccef");  // should return true
    isOneAway("abcdef", "abcde");  // should return true
    isOneAway("aaa", "abc");  // should return false
    isOneAway("abcd", "abc");  // should return false
    isOneAway("abc", "abcde");  // should return false
    isOneAway("abc", "bcc");  // should return false
    isOneAway("abc", "b");  // should return false
    */

    public static boolean isOneAway(String str1, String str2) {
        int str1Len = str1.length();
        int str2Len = str2.length();

        if (Math.abs(str1Len - str2Len) > 1)
            return false;
        int editCount = 0;

        int index1 = 0, index2 = 0;
        while (index1 < str1Len && index2 < str2Len) {
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (editCount == 1)
                    return false;

                if (str1Len > str2Len) {
                    index1++;
                } else {
                    if (str2Len < str1Len)
                        index2++;

                }

            }else {
                index1++;
                index2++;
            }

        }

        if (index1 < str1Len || index2 < str2Len) {
            editCount++;
        }
        if (editCount == 1) {
            return true;

        } else return false;


    }

    public static void main(String[] args) {

        String str1 = "aaa";
        String str2 = "abc";
        if (isOneAway(str1, str2)) {
            System.out.println("Yes");

        } else
            System.out.println("No");


    }
}
