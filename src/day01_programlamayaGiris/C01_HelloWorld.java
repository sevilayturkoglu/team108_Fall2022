package day01_programlamayaGiris;


import day12_MethodCreation.C07_TersCevirmeMethodu;

import java.util.Scanner;

public class C01_HelloWorld {
    public static void main(String[] args) {

        System.out.println("hello world");
        System.out.print("nasilsiniz");//println yazarsak alt satira gecer ,print yzarsak sonradan yazdigimizi ayni satira yazar
        System.out.print("  iyi misiniz");
        System.out.println("Hello world");
        // println  yazdirdiktan sonra alt satira gecer
        System.out.print("Bugun kodlamada ilk gunumuz");
        /*
        sadece print yazarsak yazdirdiktan sonra alt satira gecmez
        bir sonraki yazdirdigimiz ayni satirdan devam eder
        */
        System.out.println("Bu da 3.satir olsun");
        System.out.println(C07_TersCevirmeMethodu.metniTerseCevir("Hello world***"));


        System.out.println(true || 5/0==0);//daha hizlidir ilk true gorunce ikinciye bakmaz true yazar

     // System.out.println(true | 5/0==0);
        System.out.println(false && 5/0==0);//daha hizlidir ilk false gorunce ikinciye bakmaz false yazar

        int day=1;
        System.out.println(day == 1 ? "Monday" : day == 2 ? "Tuesday" : day == 3 ? "Wednesday" : day == 4 ? "Thuresday"
                : day == 5 ? "Friday" : day == 6 ? "Saturday" : day == 7 ? "Sunday" : "gecerli gun degil");
    }
}
