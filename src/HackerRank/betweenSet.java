package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class betweenSet {


    // Complete the birthday function below.
    static int calc(int[] keyboards, int[] drives, int b) {

//        int result = -1 ;
        int max=-1;
        for(int key : keyboards){
            for(int drive: drives){

                if(key+drive <b && key+drive >max){
                    max = key+drive;
                }
            }


        }

        return max;
    }


    public static void main(String[] args) {

       int [] keyboards = new int[]{1,2,3};
        int [] drives = new int[]{2,3,4};
        int max =2 ;



        int result = calc(keyboards,drives,max);

        System.out.println(result);
    }
}
