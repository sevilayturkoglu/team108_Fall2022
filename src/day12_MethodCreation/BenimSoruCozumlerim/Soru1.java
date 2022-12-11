package day12_MethodCreation.BenimSoruCozumlerim;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
   baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
    bir method olusturun.
       - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
    mesaji verin
    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
    yazdirin
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen bir kelime veya cumle giriniz");
        String kullaniciStr=sc.nextLine();
        System.out.println("Lutfen yazdirilmak uzere bir baslangic ve bitis indexi girin");
        int baslangic= sc.nextInt();
        int bitis=sc.nextInt();

        benimKelimem(kullaniciStr,baslangic,bitis);

    }public static void benimKelimem(String str,int bas,int son){
        if(bas>son){
            System.out.println("Hatali giris");
        } else if (str.length()<bas || str.length()<son) {
            System.out.println("Kelimenizin uzunlugundan fazla sayi girdiniz");
        }else{
            System.out.println(str.substring(bas, son-1));
        }

    }
}
