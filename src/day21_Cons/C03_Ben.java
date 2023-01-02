package day21_Cons;

import java.util.Arrays;

public class C03_Ben {
    public static void main(String[] args) {
        int[]arr={2,3,4,8};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(don(arr)));
        System.out.println(Arrays.toString(arr));
        arr=don(arr);
    }public static int [] don(int[]arr){
        arr[0]=5;
        arr[3]=9;

        return arr;
    }
}
