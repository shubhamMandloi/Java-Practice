package javaPrgm;

import java.util.Arrays;
import java.util.TreeSet;

public class test1 {


    //Arry = [34,33,53,1,5,44,65,99,38,74,90]


    public static void main(String args[]){

        TreeSet<Integer> sortedInput = new TreeSet<Integer>(Arrays.asList(34,33,53,1,5,44,65,99,38,74,90));
        System.out.println("Largest Number : " + sortedInput.last());
        sortedInput.remove(sortedInput.last());
        System.out.println("Second Last Number : " + sortedInput.last());








    }
}
