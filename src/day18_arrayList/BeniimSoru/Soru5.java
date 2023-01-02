package day18_arrayList.BeniimSoru;

import java.util.ArrayList;
import java.util.List;

public class Soru5 {
    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
bir liste olarak bize donduren bir method olusturun
         */
        int n=10;

        System.out.println(fibonacciDon(n));

    }public static List<Integer> fibonacciDon(int n){
        int sayi1=0;
        int sayi2=1;
        int sayi3=1;
        List<Integer>fiboList=new ArrayList<>();
        if(n<=1){
            return null;
        }
        fiboList.add(sayi1);
        fiboList.add(sayi2);
       while (sayi3<n){
            sayi3=sayi1+sayi2;
            fiboList.add(sayi3);
            sayi1=sayi2;
            sayi2=sayi3;
        }


        return fiboList;
    }
}


