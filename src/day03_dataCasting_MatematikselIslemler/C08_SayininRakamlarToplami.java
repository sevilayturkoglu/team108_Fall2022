package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplami {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi girirniz");

        int girilenSayi=sc.nextInt();
        int basamakToplami=0;
        int birlerBasamagi=1;
        int count=0;

        birlerBasamagi=girilenSayi%10;
         basamakToplami+=birlerBasamagi;
        girilenSayi= girilenSayi/10;
        count++;

        birlerBasamagi=girilenSayi%10;
        basamakToplami+=birlerBasamagi;
        girilenSayi= girilenSayi/10;
        count++;

        birlerBasamagi=girilenSayi%10;
        basamakToplami+=birlerBasamagi;
        girilenSayi= girilenSayi/10;
        count++;

        birlerBasamagi=girilenSayi%10;
        basamakToplami+=birlerBasamagi;
        girilenSayi= girilenSayi/10;
        count++;

        System.out.println("sayinin basamaklar toplami : "+basamakToplami);
        System.out.println("sayinin basamak sayisi : "+count);


     while(!(birlerBasamagi==0)){
            count++;
            birlerBasamagi=girilenSayi%10;
            basamakToplami+=birlerBasamagi;
            girilenSayi= girilenSayi/10;

        } System.out.println("sayinin basamaklar toplami : "+basamakToplami);
        System.out.println("sayinin basamak sayisi : "+(count-1));

        for (int i = 0; i < 4; i++) {
            count++;
            birlerBasamagi=girilenSayi%10;
            basamakToplami+=birlerBasamagi;
            girilenSayi= girilenSayi/10;

        }System.out.println("sayinin basamaklar toplami : "+basamakToplami);
        System.out.println("sayinin basamak sayisi : "+(count));


    }
}