package day33_map;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

public class C04_BolumListesiYazdirma {
    public static void main(String[] args) {
        // verilen bolumdeki ogrencilerin
        // No, isim soyisim ve siniflarini yazdiran
        // bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        MapMethodDepo.bolumListesiOlusturma(ogrenciMap,"tm");
    }
}
