package day33_map;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;

public class C06_SiniflariArtirma {
    // ogrenci map'indeki tum sinif degerlerini 1 artirin
    // 12.sinifta olan varsa sinif bilgisini Mezun yapin
    public static void main(String[] args) {


    Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

    ogrenciMap= MapMethodDepo.siniflariArtir(ogrenciMap);

        MapMethodDepo.tumListeYazdir(ogrenciMap);
}
}
