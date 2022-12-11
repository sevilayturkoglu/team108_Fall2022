package day14_doWhileLoop_Scope.BenimSoruCozum;

import java.util.Scanner;

public class soru1Sifre {

    public static void main(String[] args) {
       /*
       1-“Merhaba Java” yazısını konsola 10 defa alt alta olacak sekilde ,once for sonra da while dongusu ile yazdirin
      115 miyiz diye deneyelim
      3- kullanici tamam diyene kadar konsola isim gondersin,ve bu kullanicinin gonderdigi isimleri
       aralarinda yildiz olacak sekilde yazdirin,ama dikkat edin sonunda yildiz olmasin.Bu soruyu while ile mi for ile mi cozmeliyiz dusunelim.

        */
       Scanner sc=new Scanner(System.in);
        String kullaniciIsimleri="";
        String kullaniciListesi="";

        while (!kullaniciIsimleri.equalsIgnoreCase("tamam")){
            kullaniciIsimleri=sc.next();
            kullaniciListesi+=kullaniciIsimleri+"*";
        }
        System.out.println(kullaniciListesi.substring(0,kullaniciListesi.length()-1));

        /*
        1-|     Bir sayının tam bölenlerini ve tam bölenlerinin toplamını bulun.

2-“Merhaba Mobilhanem” yazısını konsola 10 defa alt alta yazdırmak için aynı kodu 10 defa alt alta yazdık. Bunu while döngüsü ile aşağıdaki şekilde yapabiliriz.
2: This program will find the summation of numbers from 1 to 10. 
Şimdi, while döngüsünü kullanarak 10'dan geriye doğru giden ve bu sırada sayıları ekrana basan bir Java uygulaması yapalım:
Aşağıdaki programda bir faktöriyel hesabı yapalım. 1'den 10'a kadar olan sayıların faktöriyelini ekrana basan bir Java programı olsun.
         */
        String str="Merhaba Java";
        for (int i = 0; i <10 ; i++) {
            System.out.println(str);
        }

        for (char i = 'a'; i <='z' ; i++) {
            System.out.print(i+"-");
        }
        System.out.println("**************");
        int baslangic=0;
        while (baslangic<10){
            System.out.println(str);
            baslangic++;
        }
        int sayi=49;
        int toplam=0;

        while (sayi>49-10){
            toplam+=sayi;
            System.out.println(sayi+"-");
           sayi--;
        }
        System.out.println(toplam);

        for (int i = 49; i >49-10; i--) {
            toplam+=sayi;
        } System.out.println(toplam);

        int fact=5;
        int deger=1;
        while (fact>=1){
            deger*=fact;
            fact--;
        }
        System.out.println(deger);
    }
}