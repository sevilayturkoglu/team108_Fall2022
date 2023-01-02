package day18_arrayList.BeniimSoru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deneme {

    public static void main(String[] args) {
        //verilen baslangic ve sayilari dahil  aradaki tum sayilari yazdirin

        /*int baslangic = 1;
        int bitis = 20;
        int[] arr = new int[(bitis - baslangic)+1];

        List<Integer> Sayilar = new ArrayList<>();

        for (int i = 0; i <bitis ; i++) {
            arr[i]=i+1;

            Sayilar.add(i+1);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Sayilar);*/

        int baslangic = 1;
        int bitis = 20;
        int[] arr = new int[(bitis - baslangic)+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        List<Integer> Sayilar = new ArrayList<>();

        for (Integer each:arr) {
       Sayilar.add(each);
        }
        System.out.println("Sayilar = " +Arrays.toString(arr) );
        System.out.println("Sayilar = "+Sayilar);
    }

}






