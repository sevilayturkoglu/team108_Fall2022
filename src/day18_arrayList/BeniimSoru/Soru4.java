package day18_arrayList.BeniimSoru;

import java.util.ArrayList;
import java.util.List;

public class Soru4 {
    /*
    Soru 4- Verilen pozitif bir n tamsayisini alarak, bize ilk n tane tane Fibonacci
sayisini bir list olarak donduren bir method olusturun
     */
    public static void main(String[] args) {
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
        for (int i = 0; i <n-1 ; i++) {
            sayi3=sayi1+sayi2;
            fiboList.add(sayi3);
            sayi1=sayi2;
            sayi2=sayi3;
        }


return fiboList;
    }
}
