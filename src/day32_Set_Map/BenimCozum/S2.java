package day32_Set_Map.BenimCozum;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        /*
        Bir ogretmenden ogrencilerin notlarini girmesini isteyin, not grime islemi
bittiginde Q’ya basmalidir. Not grime islemi bittikten sonra asagidaki sekilde
output hazirlayin
not ortalamasi : …..
ogrenci sayisi : …..
ortalama altindaki ogrenci sayisi : ….
ortalamanin 10 puan alt ve ustunde olan ogrenci sayisi : …
         */
        Scanner sc = new Scanner(System.in);
        double not = 0;
        int ogrenciSayisi = 0;
        double toplam = 0;
        double notOrta = 0;
        int count = 0;

        Queue<Double> notlar = new LinkedList<>();
        try {
            while (not >= 0) {
                System.out.println("Lutfen ogrenci notlarini giriniz,bitirmek icin Q ya basiniz");
                notlar.add(sc.nextDouble());
            }
        } catch (InputMismatchException e) {
            ogrenciSayisi = notlar.size();
            System.out.println("ogrenci sayisi= " + ogrenciSayisi);
            for (Double each : notlar
            ) {
                toplam += each;
                notOrta = toplam / ogrenciSayisi;
            }

            System.out.println("Not ortalamasi= " + notOrta);

            for (Double each : notlar
            ) {
                if (notOrta > each) {
                    count++;
                }
            }
            System.out.println("Ortalama alti ogrenci sayisi= " + count);
            count = 0;
            for (Double each : notlar
            ) {
                if (notOrta+10<each) {
                    count++;
                }
            } System.out.println("Ortalama 10 puan ustu ogrenci sayisi= " + count);
            count = 0;
            for (Double each : notlar
            ) {
                if (notOrta-10>each) {
                    count++;
                }
            } System.out.println("Ortalama 10 puan alti ogrenci sayisi= " + count);
        }
    }
}
