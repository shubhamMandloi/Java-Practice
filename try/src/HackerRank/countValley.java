package HackerRank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class countValley {

    static int countVal(int step, String path){
        int result=0 ;
        int counter =0;
        boolean isValleyStart = false;
        for(Character C : path.toCharArray()){
            if(C.equals('U')){
                counter++;

            }
            else{
                counter--;
            }
            if(counter==0 && isValleyStart)
                result++;
            if(counter< 0){
                isValleyStart = true;
            }else{
                isValleyStart=false;
            }



        }


        return result;
    }

    public static void main(String[] args) {

        String path = "UDDDUDUU";
        int resul = countVal(path.length(),path);

        System.out.println(resul);
    }
}
