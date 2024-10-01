import java.util.Arrays;

public class test1 {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        Arrays.stream(nums).forEach(s-> System.out.print(s +" "));
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        System.out.println();
        Arrays.stream(nums).forEach(s-> System.out.print(s +" "));
    }
    public static void main(String[] args) {
        String input = "String435To456Digit";
        int sum =0;
        for(Character ch :  input.toCharArray()){
            if(Character.isDigit(ch))
                sum=sum+(Integer.parseInt(ch.toString()));
        }

        System.out.println(sum);
        moveZeroes(new int[]{1,0,2,3,0,0,4});

    }
}
