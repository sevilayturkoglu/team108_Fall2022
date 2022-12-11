package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        // Kullanicidan toplamak uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // " Bu kadar sayi yeter" deyip toplami yazdirin

        Scanner sc=new Scanner(System.in);
        int toplam=0;

        while (toplam<500){
            System.out.println("Lutfen toplama islemi yapmak icin sayilar giriniz");
            int sayi=sc.nextInt();
            toplam+=sayi;
        }
        System.out.println("Bu kadar yeter toplam = " + toplam+" oldu");
    }
}
