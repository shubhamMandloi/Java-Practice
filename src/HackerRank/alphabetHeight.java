package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class alphabetHeight {


    // Complete the birthday function below.
    static int calHeight(List<Integer> inputArray,String word) {

        int max = 0;

        for(Character C : word.toLowerCase().toCharArray()){
            if(inputArray.get((int)C-97) >max)
                max=inputArray.get((int)C-97);

        }

        return max * word.length();

    }

    public static void main(String[] args) {



        List<Integer> s = new ArrayList<Integer>(Arrays.asList(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7));

        String target = "zaba";
        int result = calHeight(s, target);

        System.out.println(result);
    }
}
