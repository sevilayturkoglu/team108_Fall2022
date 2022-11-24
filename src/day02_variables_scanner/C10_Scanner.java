package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen biri virgullu olacak sekilde iki sayi giriniz");
        double sayi1= scan.nextDouble();
        int sayi2= scan.nextInt();
        System.out.println("sayilarin carpimi : "+sayi2 * sayi1);
        System.out.println("sayilarin toplami : "+(sayi2 + sayi1));//sayilari string gibi yapistirmasin diye paranteze aldik
    }
}
