package day11_forLoop.BenimSoruCozumu;

public class Soru10_Asal {
    public static void main(String[] args) {
        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
kontrol edin ve sonucu yazdirin
         */

        int asalMi = 119;
        String sonuc="Asal sayi";

        for (int i = 2; i < asalMi; i++) {
            if (asalMi % i == 0) {
                sonuc="asal sayi degil";
                break;
            }
        }
        System.out.println(sonuc);

    }

}