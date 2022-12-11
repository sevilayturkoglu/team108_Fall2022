package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean sifre=true;
        while (sifre){
            System.out.println("Lutfen sifrenizi giriniz");
            String kullaniciSifresi= sc.nextLine();
            if(sifreKontrolEt(kullaniciSifresi)){
                System.out.println("Sifre basariyla kaydedildi");
                sifre =false;
            }else{
                System.out.println("Tekrar deneyiniz.");

            }
        }
    }
    public static boolean sifreKontrolEt(String sifre) {

        boolean flag =true;

        // - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            // ilk harf kucuk degilse hatayi yazdir
            // sifre.charAt(0)<'a' || sifre.charAt(0)>'z'
            System.out.println("Ilk harf kucuk harf olmali");
            flag=false; // bir ceza puani aldi
        }

        // - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            // son karakter rakam degilse rapor yazdir
            System.out.println("Son karakter rakam olmali");
            flag=false;
        }
        // - sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli");
            flag=false;
        }
        // - uzunlugu en az 10 karakter olmali

        if (!(sifre.length() >= 10)) {
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag=false;

        }
        return flag;
    }
}