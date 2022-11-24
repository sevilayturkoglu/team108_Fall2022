package day06_IfElseStatement;

import java.util.Scanner;

public class C12_SoruBen {
    public static void main(String[] args) {

        /* Soru 3 - Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
                yazdirin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int kullaniciSayisi= scan.nextInt();

        if(kullaniciSayisi %2 !=0){
            if(kullaniciSayisi >=0) System.out.println("Kullanici sayisi pozitiftir tek sayidir");
            else System.out.println("Kullanici sayisi negatiftir tek sayidir");
        } else if (kullaniciSayisi % 10==0) System.out.println("Kullanici sayisi 10 un katidir");
            else System.out.println("Kullanici sayisi 10 un kati deggildir");
        }

    }
