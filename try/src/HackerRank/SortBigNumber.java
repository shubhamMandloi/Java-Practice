package HackerRank;

import java.util.*;

public class SortBigNumber {

    static List<String> sortStringList(List<String> ss) {

        Collections.sort(ss, new Comparator<String>() {

            @Override
            public int compare(String a,String b){
                return StringCompare(a,b);
            }
        });

        return ss;
    }
    public static int StringCompare(String s1, String s2){
        if(s1.length() > s2.length()) return 1;
        if(s1.length() < s2.length()) return -1;
        for(int i = 0; i < s1.length(); i++)
        {
            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
        }
        return 0;
    }

    public static void main(String[] args) {

        List<String> s = new ArrayList<String>(Arrays.asList("1", "31415926535897932384626433832795", "3", "2"));


        s = sortStringList(s);

        System.out.println(s);
    }
}
