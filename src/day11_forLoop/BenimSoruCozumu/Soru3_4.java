package day11_forLoop.BenimSoruCozumu;

public class Soru3_4 {
    public static void main(String[] args) {
/*
Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */


        //burada soru 3 ile 4 u birlestirdim
        int baslangic=10;
        int bitis=7;
        int top=0;

        if(baslangic<bitis){
            for (int i = baslangic; i <=bitis ; i++) {
                top+=i;
            }
        }else{
            for (int i = baslangic; i >=bitis ; i--) {
                top+=i;
            }
        }
        System.out.println("top = " + top);
    }
}
