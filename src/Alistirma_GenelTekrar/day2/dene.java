package Alistirma_GenelTekrar.day2;

import java.util.Arrays;

public class dene {
    public static void main(String[] args) {


        String str = "javayi ozlediniz mi.ben ozledim.soru cozmek guzeldi";

        String [] arr = str.split("\\.");

        System.out.println(Arrays.toString(arr));
        for (String each:arr
             ) {
            System.out.println(each);
        }

    }
}