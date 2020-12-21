package javaPrgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class inputNUm {

    public static void main(String args[]){
       /* Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("You have entered "+ input);
*/

        List<Integer> list1 = new ArrayList<>();
        int numOfOperations = 1;
        list1.add(2);
        list1.add(3);

        for(int i =1; i<=numOfOperations;i++){
            Collections.sort(list1,Collections.reverseOrder());
            list1.forEach((ks)-> System.out.println(ks));
            list1.add((int)Math.ceil(list1.get(0)/2.0));
            list1.remove(0);

        }
        int result=0;
        for(Integer i : list1){
            result=result+i;
        }
        System.out.println("min sum is " +result);




    }
}
