package day18_arrayList.BeniimSoru;

import day16_arrays.C10_ArrayeBirElemanEkleme;
import day18_arrayList.C10_Soru2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sil {
    //s2
    public static void main(String[] args) {
//Kullanicidan istedigi kadar harf alip,X'e bastiginda harfleri  liste olarak yazdirin


        char GirilenHarf=' ';
        List<Character> HarfListesi= new ArrayList<>();
        List<String> HarfListesi1= new ArrayList<>();

        Scanner scan =new Scanner(System.in);
      while (GirilenHarf!='w'){
          GirilenHarf=scan.next().charAt(0);
        HarfListesi.add(GirilenHarf);
        HarfListesi1.add(String.valueOf(GirilenHarf));
      }
        System.out.println(HarfListesi);
    }
}
