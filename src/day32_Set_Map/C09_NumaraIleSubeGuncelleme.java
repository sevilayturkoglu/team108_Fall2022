package day32_Set_Map;

import java.util.Map;

public class C09_NumaraIleSubeGuncelleme {
    public static void main(String[] args) {
        // Numarasi verilen ogrencinin sube ismini degistirip
        // verilen sube yapan bir method olusturun

        Map<Integer, String > ogrenciMap= MapMethodDepo.ogrenciMapOlustur();

        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,104,"M");
        ogrenciMap=MapMethodDepo.numaraIleSubeDegistirme(ogrenciMap,101,"Z");

        System.out.println(ogrenciMap);
    }

}
