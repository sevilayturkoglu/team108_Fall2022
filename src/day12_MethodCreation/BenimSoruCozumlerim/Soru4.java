package day12_MethodCreation.BenimSoruCozumlerim;

public class Soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        bolenleri sayisini bulup bize donduren bir method olusturun
         */
       int bolenlerSayisi= pozitifBolenler(36);
        System.out.println(bolenlerSayisi);
    }
    public static int pozitifBolenler(int sayi) {
        int count=0;
        for (int j = 1; j <=sayi ; j++) {
            if(sayi%j==0){
                count++;
            }
        }return count;
    }
}
