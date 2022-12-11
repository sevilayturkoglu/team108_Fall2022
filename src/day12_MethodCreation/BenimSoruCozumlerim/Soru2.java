package day12_MethodCreation.BenimSoruCozumlerim;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen sdinizi giriniz");
        String ad=sc.nextLine();
        System.out.println("Lutfen soyadinizi girin");
        String soyad=sc.nextLine();

       String kimlik= benimAdim(ad,soyad);
        System.out.println(kimlik);
    }

    public static String benimAdim(String ad, String soyad) {

        return  ad.substring(0,1).toUpperCase()+ad.substring(1).toLowerCase()+" "
           +soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();


    }
}
