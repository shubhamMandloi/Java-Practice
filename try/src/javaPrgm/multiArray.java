package javaPrgm;

import java.util.Arrays;

public class multiArray {

    public static void main(String args[]) {

        int rows = 3;
        int cols = 3;

        int[][] arr = {{1, 1, 1}, {1, 2, 1}, {2, 3, 4}};
        int rowSum = 0, ColSum = 0, fwdSum = 0, bwdSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSum = rowSum + arr[i][j];
                ColSum = ColSum + arr[j][i];
            }
            System.out.println("  sum of  row" + i + "  is :" + rowSum);
            rowSum = 0;
            System.out.println("  sum of  col" + i + "  is :" + ColSum);
            ColSum = 0;
        }

        for (int i = 0, j = 0; i < rows && j < cols; i++, j++) {
            fwdSum = fwdSum + arr[i][j];

        }
        System.out.println("  sum of forward diagonal is :" + fwdSum);

        for (int i = 0, j = cols - 1; i < rows && j >= 0; i++, j--) {
            bwdSum = bwdSum + arr[i][j];
        }

        System.out.println("  sum of backward diagonal is :" + bwdSum);

    }


}
