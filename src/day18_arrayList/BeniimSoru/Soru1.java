package day18_arrayList.BeniimSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru1 {
    public static void main(String[] args) {
        /*
         // Verilen bir array'deki tekrar eden elementleri silip
        // array'i unique degerlerden olusan bir array haline getirin
        */
        int[] arr = {4, 3, 6, 7, 3, 5, 3, 6, 7, 3, 5, 4, 6, 4, 7, 7, 7, 5};
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(!newList.contains(arr[i])){
               newList.add(arr[i]);

            }
        }

       arr=new int[newList.size()];
        for (int i = 0; i <newList.size() ; i++) {
            arr[i]=newList.get(i);

        }

        System.out.println(Arrays.toString(arr));
    }
}