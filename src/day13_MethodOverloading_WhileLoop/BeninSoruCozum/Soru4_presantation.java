package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

import java.util.Scanner;

public class Soru4_presantation {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyinKullaniciya bitirmek
istediginde 0'a basmasini soyleyin
Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
bunlarin toplaminin kac oldugunu yazdirin
Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
negatif sayiyi sayi adedine ve toplama eklemeyin
         */
        Scanner scan=new Scanner(System.in);
        System.out.println( "Lutfen toplama yapmak uzere tam sayilar girin,bitirmek icin 0 a basin");
        int kullaniciSayisi=1;
        int toplam=0;
        int count=0;
        while(kullaniciSayisi!=0){
            kullaniciSayisi=scan.nextInt();
            if(kullaniciSayisi>=1){
                toplam+=kullaniciSayisi;
                count++;
            } else if (kullaniciSayisi<0) {
                System.out.println("Negatif sayi kullanamazsin");
            }
        }
        System.out.println("Sayilarin toplami= "+toplam+" ve  "+count+"  adet sayi girdiniz");
    }
}
