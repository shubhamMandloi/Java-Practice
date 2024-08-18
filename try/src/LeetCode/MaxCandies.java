package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*-
Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */
public class MaxCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> resultList = new ArrayList<>(candies.length);
        int max = Arrays.stream(candies).max().getAsInt();

        for(int i : candies){
            if(i+extraCandies >= max)
                resultList.add(true);
            else
                resultList.add(false);
        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3},3));
    }
}
