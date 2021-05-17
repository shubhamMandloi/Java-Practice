package javaPrgm;

import java.util.Scanner;

public class try23 {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        String a = sc.next();*/
        try{
            System.out.println(doStuff(args));
        }
        catch (Exception e){
            System.out.println("exc");
        }
        doStuff(args);
    }
    static int doStuff(String[] args){
        return Integer.parseInt(args[0]);
    }

}

