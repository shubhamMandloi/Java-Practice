
import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.SQLOutput;
import java.util.*;


class Subarray {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int inputArrLen = Integer.parseInt(sc.nextLine());
        String inp = sc.nextLine();
        int[] inputArr = new int[inputArrLen];
        for (int i = 0; i < inputArrLen; i++) {
            inputArr[i] = Integer.parseInt(inp.split(" ")[i]);
        }

        int loop = Integer.parseInt(sc.nextLine());
        int leftArr[] = new int[loop];
        int rightArr[] = new int[loop];
        for (int loopIndex = 0; loopIndex <= loop - 1; loopIndex++) {
            String inpLoop = sc.nextLine();
            leftArr[loopIndex] = Integer.parseInt(inpLoop.split(" ")[0]);
            rightArr[loopIndex] = Integer.parseInt(inpLoop.split(" ")[1]);

        }
        for (int loopIndex = 0; loopIndex <= loop - 1; loopIndex++) {


            //int[] inputArr = new int[]{2, 4, 5, 3, 1, 6};
            int left = leftArr[loopIndex];
            int right = rightArr[loopIndex];

            //to slice array element
            int[] subArray;
            if (left != right)
                subArray= Arrays.copyOfRange(inputArr, left - 1, right - 1);
            else
                subArray = new int[]{inputArr[left-1]};
            Arrays.sort(subArray);
            int index = 0;
            if (subArray.length % 2 != 0)
                index = (subArray.length / 2) + 1;
            else
                index = (subArray.length / 2);

            System.out.println(subArray[index - 1]);
        }
    }
}
