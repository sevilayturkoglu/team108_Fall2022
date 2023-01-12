package day31_Collections;

import java.util.Set;
import java.util.TreeSet;

public class C05_Set {
    public static void main(String[] args) {
        // Set index yapisini desteklemez
        //uniq elementler tutar
        //hizli olsun istersek hashSet secebiliriz
        //ekleme cikarma kolay olsun istersek linkedSet secebiliriz
        //ekleme belli bir siraya gore mesela alfabeti olsun istersek TreeSet seceriz biz burda TreeSet sectik
        Set<String> ogrenciler = new TreeSet<>();
        ogrenciler.add("Esra");
        ogrenciler.add("Ayten");
        ogrenciler.add("Furkan");
        System.out.println(ogrenciler); // [Ayten, Esra, Furkan]
        ogrenciler.add("Ahmet");
        System.out.println(ogrenciler); // [Ahmet, Ayten, Esra, Furkan]
        ogrenciler.add("Furkan");//ikinci Furkan ekledik ama tek Furkan gorulur cunki oncekini siler yeni ekler
        System.out.println(ogrenciler); // [Ahmet, Ayten, Esra, Furkan]
        ogrenciler.add("Sevilay");
        System.out.println(ogrenciler);//[Ahmet, Ayten, Esra, Furkan, sevilay]
        ogrenciler.add("Hakan");
        System.out.println(ogrenciler);//sanki alfabetic siraya gore ekledi cunki TreeSet kullandik
    }
}
