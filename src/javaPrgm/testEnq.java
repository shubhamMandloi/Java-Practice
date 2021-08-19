package javaPrgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class testEnq {

    final ArrayList<Integer> resultList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));


    public static void main(String[] args) {

        //int[] A
        //int[] B

        testEnq obj = new testEnq();

        obj.resultList.set(1,1);

        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1, 21, 31, 41, 51));

        //ArrayList<Integer> resultArray = new ArrayList<>();
        TreeSet<Integer> resultArray = new TreeSet<>();
        /*- resultArray.addAll(a1);
        resultArray.addAll(a2);*/
        //Collections.sort(resultArray);


        for (int i = 0, j = 0; i <= a1.size() - 1 && j <= a2.size() - 1; ) {

            if (a1.get(i) > a2.get(j)) {
                if (!resultArray.contains(a2.get(j))) {
                    resultArray.add(a2.get(j));
                    j++;
                }

            } else if (!resultArray.contains(a1.get(i))) {
                resultArray.add(a1.get(i));
                i++;
            }
            else {
                i++;
                j++;
            }


        }

        resultArray.forEach((s) -> System.out.println(s));


        resultArray.forEach((s) -> System.out.println(" " + s));

        String s = "Shubham";
        //s = "Narsimha ";


        String name = "Shubham";


    }
}
