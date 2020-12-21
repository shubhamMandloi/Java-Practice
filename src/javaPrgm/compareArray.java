package javaPrgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class compareArray {

    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("A","B","C"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("A","C","B"));
        ArrayList<String> list3 = new ArrayList<String>(Arrays.asList("A","C","D"));
        System.out.println(list1.equals(list2));
        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3));


        //list3.removeAll(list1);
        list3.retainAll(list1);
        System.out.println(list3);


    }
}
