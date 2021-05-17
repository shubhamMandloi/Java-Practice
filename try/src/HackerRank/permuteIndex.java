package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permuteIndex {
    // Complete the birthday function below.
    static List<Integer> calc(List<Integer> p) {

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 1;i<=p.size();i++){

            //System.out.println(" "+i+" : "+(p.indexOf(i)+1) + " : "+( p.indexOf(p.indexOf(i)+1)+1));
            result.add(p.indexOf(p.indexOf(i)+1)+1);

        }


        return result;

    }


    public static void main(String[] args) {
        List<Integer> input = new ArrayList<Integer>(Arrays.asList(5,2,1,3,4));

        List<Integer> result = calc(input);

        //System.out.println(result);
    }

}
