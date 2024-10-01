package LeetCode;

public class flowerbed {
    /*-
    Example 1:

Input: flowerbed = [1,0,0,0,1], n = 1
Output: true
Example 2:

Input: flowerbed = [1,0,0,0,1], n = 2
Output: false
     */

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

    int count = 0;
    for(int i =0;i< flowerbed.length;i++){
        if((i == 0 || flowerbed[i-1]==0) && flowerbed[i]==0 && ((i == flowerbed.length - 1 )||(flowerbed[i+1]==0))) {
            count++;
            flowerbed[i]=1;
        }
    }

    return n==count;
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,0},1));

    }
}
