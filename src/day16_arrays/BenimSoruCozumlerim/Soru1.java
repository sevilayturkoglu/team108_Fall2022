package day16_arrays.BenimSoruCozumlerim;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
olusturun. Eski array’i yeni haliyle kaydedin
         */
        int[]arr={1,2,3,4};
        arr=ikiArttir(arr);
        System.out.println(Arrays.toString(arr));

    }public static int[] ikiArttir(int[]arri){

        for (int i = 0; i < arri.length; i++) {
            arri[i]+=2;
        }
        return arri;
    }
}
