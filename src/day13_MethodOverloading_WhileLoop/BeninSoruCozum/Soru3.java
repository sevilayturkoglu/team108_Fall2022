package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

public class Soru3 {
    public static void main(String[] args) {
        // 2 basamakli sayilardan 7 ile bolunebilenleri yazdirin

        int baslangic=10;
        while (baslangic<100){
            if(baslangic%7==0){
                System.out.print(baslangic+" ");
            }
            baslangic++;
        }
    }
}
