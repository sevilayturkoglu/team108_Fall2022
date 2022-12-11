package day12_MethodCreation;

import day11_forLoop.C03_AsalSayi;

public class C06_MethodKullanimi {
    public static void main(String[] args) {
        System.out.println(C03_AsalSayiMethod.asalSayiMi(57));  // false
        C04_FacktorielMethod.faktoryelYazdir(10); // Girilen 10 icin faktoryel : 3628800
        C04_FacktorielMethod.faktoryelYazdir(16); // Girilen 16 icin faktoryel : 2004189184
        System.out.println(C05_HesapMakinesiMethod.hesapMakinasi(9.7, 6.5, '+'));// 16.2
    }
}
