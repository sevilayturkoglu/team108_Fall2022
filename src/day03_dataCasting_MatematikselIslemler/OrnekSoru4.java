package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class OrnekSoru4 {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen iki ondalikli sayi giriniz");
        double sayi1=sc.nextDouble();
        double sayi2=sc.nextDouble();

        System.out.println((int)(sayi1 / sayi2));
    }
}
