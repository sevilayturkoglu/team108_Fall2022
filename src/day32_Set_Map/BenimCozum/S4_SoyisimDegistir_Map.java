package day32_Set_Map.BenimCozum;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

import static day32_Set_Map.MapMethodDepo.ogrencisoyIsminiDegistir;

public class S4_SoyisimDegistir_Map {
    /*
    Soru: 101 numarali ogrencinin soyismini Yan yapin
     */
    public static void main(String[] args) {


    Map<Integer,String>ogrenciList= MapMethodDepo.ogrenciMapOlustur();

    ogrenciList=MapMethodDepo.ogrencisoyIsminiDegistir(ogrenciList,101,"Vera");
        System.out.println(ogrenciList);
        System.out.println(ogrencisoyIsminiDegistir(ogrenciList, 106, "Kayhan"));


    }


}
