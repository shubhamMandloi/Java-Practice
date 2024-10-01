package test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class EvenOddSortingArray {

    /*-Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

     */
    public static void main(String[] args) {
        int[] input = new int[]{3,1,2,4};

        Deque<Integer> result = new ArrayDeque<>();
        for(int i : input){
            if(i%2==0)
                result.addFirst(i);
            else
                result.addLast(i);
        }
        result.forEach(i-> System.out.print(i+" "));

    }
}
