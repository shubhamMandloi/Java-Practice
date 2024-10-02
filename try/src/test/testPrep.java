package test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

public class testPrep {

    /*-code 1
    Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

     */
    static void EvenOddSortingArray(int[] input) {
//        int[] input = new int[]{3,1,2,4};

        Deque<Integer> result = new ArrayDeque<>();
        for (int i : input) {
            if (i % 2 == 0)
                result.addFirst(i);
            else
                result.addLast(i);
        }
        result.forEach(i -> System.out.print(i + " "));

    }

     /*-code 2
     Input: num = 14
Output: 6
Explanation:
Step 1) 14 is even; divide by 2 and obtain 7.
Step 2) 7 is odd; subtract 1 and obtain 6.
Step 3) 6 is even; divide by 2 and obtain 3.
Step 4) 3 is odd; subtract 1 and obtain 2.
Step 5) 2 is even; divide by 2 and obtain 1.
Step 6) 1 is odd; subtract 1 and obtain 0.

     */

    static void operationCount(int input) {
        int count = 0;
        while (input != 0) {
            if (input % 2 == 0) {
                input = input / 2;
                count++;
            } else {
                input = input - 1;
                count++;
            }
        }
        System.out.println("count :" + count);


    }

    /*-Input: nums = [8,1,2,2,3]
        Output: [4,0,1,1,3]
        Explanation:
        For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
        For nums[1]=1 does not exist any smaller number than it.
        For nums[2]=2 there exist one smaller number than it (1).
        For nums[3]=2 there exist one smaller number than it (1).
        For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).

            */
    static void compareArrayElement(int[] input) {
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i] > input[j])
                    result[i]++;
            }
        }
        Arrays.stream(input).forEach(i -> System.out.print(i + " "));
        System.out.println();
        Arrays.stream(result).forEach(i -> System.out.print(i + " "));

    }

    /*-
    Input: ransomNote = "aa", magazine = "aab"
    Output: true
    Input: ransomNote = "aa", magazine = "ab"
    Output: false
     */
    static boolean ransomNote(String ransome, String magzine) {
        StringBuffer magzineSB = new StringBuffer(magzine);
        for (int i = 0; i < ransome.length(); i++) {
            char currentChar = ransome.charAt(i);
            if (magzineSB.toString().contains(currentChar + "")) {
                magzineSB.deleteCharAt(magzine.indexOf(currentChar));
            } else
                return false;

        }
        return true;

    }

    /*-
    Input: [1,1,0,1,1,1]
    Output: 3
    Explanation: The first two digits or the last three digits are consecutive 1s.
        The maximum number of consecutive 1s is 3.
     */
    static int consecutiveOnes(int[] input) {

        boolean streak = false;
        int count = 0;
        for (int i : input) {
            if (i == 1) {
                if (streak)
                    count++;
                else {
                    count = 1;
                    streak = true;
                }
            } else streak = false;
        }

        return count;
    }

    /*-
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     Output: [1,2,2,3,5,6]
     */
    static void MergeSortedArrays(int[] input1, int len1, int[] input2, int len2) {

        for (int i = 0; i < len2; i++) {
            input1[len1 + i] = input2[i];
        }
        Arrays.sort(input1);
        Arrays.stream(input1).forEach(i -> System.out.print(i + " "));

    }

    /*-
    Input: s = "([)]"
    Output: false
    Input: s = "{[]}"
    Output: true
     */
    static boolean validParanthesis(String input) {
        Stack<Character> inputStack = new Stack<>();

        if ((input.length() % 2 != 0)) {
            return false;
        }
        /*-        for (Character ch : input.toCharArray()) {
            if (ch == '{' || ch == '(' || ch == '['){
                inputStack.push(ch);
            } else if (ch=='}'&&(!inputStack.isEmpty()) && (inputStack.peek()=='{')) {
                inputStack.pop();
            } else if (ch==')'&&(!inputStack.isEmpty()) && (inputStack.peek()=='(')) {
                inputStack.pop();
            }
            else if (ch==']'&&(!inputStack.isEmpty()) && (inputStack.peek()=='[')) {
                inputStack.pop();
            }
            else return false;

        }*/

        for (Character ch : input.toCharArray()) {
            switch(ch){
                case '{':
                case '(':
                case '[':
                    inputStack.push(ch);
                    break;
                case '}':
                    if(!inputStack.isEmpty() && inputStack.peek()=='{')
                        inputStack.pop();
                    break;
                case ']':
                    if(!inputStack.isEmpty() && inputStack.peek()=='[')
                        inputStack.pop();
                    break;
                case ')':
                    if(!inputStack.isEmpty() && inputStack.peek()=='(')
                        inputStack.pop();
                    break;
                default: return false;
            }

        }



        return inputStack.isEmpty();
    }

    public static void main(String[] args) {


        /*-EvenOddSortingArray(new int[]{3, 1, 2, 4});
        operationCount(14);
        compareArrayElement(new int[]{8,1,2,2,3});
        System.out.println(ransomNote("aa","ab"));
        System.out.println(consecutiveOnes(new int[]{1,1,0,1,1,1}));
        MergeSortedArrays(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        System.out.println(validParanthesis("(())"));*/

    }
}
