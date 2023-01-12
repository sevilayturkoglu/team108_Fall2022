package day33_map;

import day32_Set_Map.MapMethodDepo;

import java.util.Map;
import java.util.TreeMap;

public class C08_IsimSoyisimSiraliListe {
    public static void main(String[] args) {
        // tum ogrenci listesini isim soyisim no sinif sube bolum
        // seklinde sirali olarak yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap= MapMethodDepo.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        MapMethodDepo.isimSoyisimSiraliListeYazdir(ogrenciMap);
    }
}
