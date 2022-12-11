package day16_arrays.BenimSoruCozumlerim;

import java.util.Arrays;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
donduren bir method olusturun.
         */

        System.out.println(Arrays.toString(kendiArrayiniYap()));


    }public static String[] kendiArrayiniYap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen arrayinizin boyutunu giriniz");
        int arrLengt= sc.nextInt();

        sc.nextLine();

        System.out.println("Lutfen arrayinizin elenemtlerini giriniz");

        String[]kullaniciArrayi=new String[arrLengt];

        for (int i = 0; i < arrLengt; i++) {
           String element=sc.nextLine();
            kullaniciArrayi[i]=element;

        }
       return kullaniciArrayi;
    }
}

