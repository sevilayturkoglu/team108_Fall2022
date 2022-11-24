package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner_SwapValue {
    public static void main(String[] args) {
            /*
    Soru 7 (Interview)- Kullanicidan iki sayi alip
    ikisinin degerlerini degistirin(swap).
        kullanicinin girdigi degerler
        sayi1= 10  sayi2=20 ise
        siz kod ile bunlarin degerlerini degistirip
        sayi1=20  sayi2=10 yapin
        */
     Scanner sc=new Scanner(System.in);
        System.out.println("Lutfen yerleri degistirilmek uzere iki sayi giriniz");
        int sayi1=sc.nextInt();
        int sayi2=sc.nextInt();

      //1.yol
        int dummy=0;
        dummy=sayi1;
        sayi1=sayi2;
        sayi2=dummy;
        System.out.println("sayi1= "+sayi1 + "  sayi2= " + sayi2);


   //ikinci islemi yaparken birinci islemi kapatmaliyiz cunki degerler degisir
       //2.yol
        sayi2=sayi1+sayi2;
        sayi1=sayi2-sayi1;
        sayi2=sayi2-sayi1;
        System.out.println("sayi1= "+sayi1 + "  sayi2= " + sayi2);
    }
}