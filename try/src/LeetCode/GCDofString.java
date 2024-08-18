package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.regex.Pattern;

public class GCDofString {

    public static String meth(String str1, String str2){

       if(!((str1+str2).equals(str2+str1)))
           return "";
       else
       {
           int gcd = Math.min(str1.length(), str2.length());
           while(gcd>0){
               if(str1.length()%gcd==0 && str2.length()%gcd==0)
                   break;
               gcd--;
           }
           return str1.substring(0,gcd);

       }


    }
    public static void main(String[] args) {
        System.out.println(meth("ABABAB","ABAB"));

    }
}
