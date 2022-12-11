package day14_doWhileLoop_Scope;

import java.util.Scanner;

public class C01_doWhileLoop {
    public static void main(String[] args) {
        // kullanicidan istedigi kadar sayi alin ve toplayin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        int girilenSayi=1;
        int toplam=0;
        Scanner scan= new Scanner(System.in);
        while (girilenSayi!=0){
            System.out.println("Lutfen toplama yapmak icin sayi giriniz,islemi bitirmek icin 0 a basin");
            girilenSayi=scan.nextInt();
            toplam+=girilenSayi;
        }
        System.out.println(toplam);


        /*
            While loop'un 2 tane negatif yonu vardir
            1- loop'dan once olusturdugumuz ve loop'da kullanacagimiz variable'lara
               yanlis bir deger verirsek, loop bodys'si hic calismayabilir
            2- loop condition'i loop body'sinden bir kez fazla calisir
            bu negatif yonler onu kullanilmaz yapacak buyuklukte degildir
            ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz
         */
    }
}
