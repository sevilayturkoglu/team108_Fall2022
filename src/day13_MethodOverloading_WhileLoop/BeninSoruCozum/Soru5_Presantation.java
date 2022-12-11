package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

import java.util.Scanner;

public class Soru5_Presantation {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
olusturun
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi ve hesaplanmasini istediginiz ussu girin");
        int sayi=scan.nextInt();
        int us=scan.nextInt();
        
   ussHesapla(sayi,us);

    }public static void ussHesapla(int sayi,int us){
        int toplam=1;
        while (us>=1){
            toplam*=sayi;
         us--;
        }
        System.out.println(toplam);
    }
}
