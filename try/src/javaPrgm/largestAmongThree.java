package javaPrgm;

import java.sql.SQLOutput;

public class largestAmongThree {
    public static void main(String args[]){
        int a= 10000;
        int b = 200, c=3000;

        if(a>b){
            if(a>c)
                System.out.println("A is largest");
            else
                System.out.println("C is largest");
        }else{
            if (b>c)
                System.out.println("B is largest");
            else
                System.out.println("C is largest");
        }

    }
}
