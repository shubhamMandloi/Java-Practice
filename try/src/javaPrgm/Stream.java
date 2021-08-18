package javaPrgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

     static int  addsd(int a,int b){
        a=a+5;
        return a+b;
    }
    public static void main(String[] args) {

        int a=5,b=10;

        System.out.println(Stream.addsd(12,b));
        System.out.println("value of a = "+a+" ## "+b);
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(6,3,2,1,5,6));
        input.stream().filter(i->i%2==0).forEach(i-> System.out.println(i + " "));
        System.out.println(" ###");

        input = input.stream().distinct().collect(Collectors.toList());
        System.out.println(" ###");
        input.forEach(i-> System.out.println(i));

        Collections.sort(input);
        System.out.println(" ###");
        input.forEach(i-> System.out.println(i));

        input.stream().collect(Collectors.toSet());
        System.out.println(input);
    }
}
