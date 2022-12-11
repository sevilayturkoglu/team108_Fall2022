package day12_MethodCreation.BenimSoruCozumlerim;

public class Soru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
sonuclarini donduren bir method olusturun
         */

        System.out.println(asalMi(7));
    }

    public static boolean asalMi(int sayi) {
        boolean asalMi=true;
        for (int j = 2; j <sayi ; j++) {
            if(sayi%j==0){
                asalMi=false;
                break;
            }
        }
        return asalMi;
    }
}
