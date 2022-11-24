package day05_IfStatements;

import java.util.Scanner;

public class C03_ifStatmantSoru {

    public static void main(String[] args) {
        /*
           Basit if cumlelerinde sart parantezinden sonra body kullanmazsak
           ilk ;'e kadar olan kismi body olarak kabul eder
           yani sadece 1 satir kodu body olarak kabul eder

           Eger if body'si icin yazilacak kod 1 satirdan fazlaysa
        MUtlaka { } kullanilmalidir
         */
        /*
        Soru 3- Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.


         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();
        if (girilenSayi%3==0) System.out.println("Uc ile bolunebilen sayi");
        if (girilenSayi%5==0) System.out.println("Bes ile bolunebilen sayi");
    }
    }

