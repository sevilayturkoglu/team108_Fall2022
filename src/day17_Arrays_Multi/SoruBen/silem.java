package day17_Arrays_Multi.SoruBen;

import java.util.Arrays;

public class silem {
    public static void main(String[] args) {

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        int[] sumOfInner = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumOfInner[i] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(sumOfInner));
    }
}