package day03_dataCasting_MatematikselIslemler;

import java.util.Scanner;

public class OrnekSoru5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
    //ve bolum isleminin sonucununun tamsayi kismini yazdirin.
    Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen ilki ondalikli ikincisi tam sayi olmak uzere iki sayi giriniz");
    double sayi1=sc.nextDouble();
    int sayi2=sc.nextInt();

        System.out.println((int) (sayi1 / sayi2));
}
}
