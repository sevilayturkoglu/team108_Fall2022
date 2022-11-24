package day06_IfElseStatement;

import java.util.Scanner;

public class C13_SoruBen {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
         “Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
         gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
         zamani” yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun adi giriniz");
        String gunIsmi = scan.nextLine().toLowerCase();

        int gunSayisi = 7;

        if (gunIsmi .equals("cumartesi") || gunIsmi .equals("pazar"))
            System.out.println("Simdi dinlenme zamani");
            else if (gunIsmi.equals("pazartesi"))
                System.out.println("Simdi calisma zamani tatile  " + (gunSayisi - 2) + "  gun var");
            else if (gunIsmi.equals("sali"))
                System.out.println("Simdi calisma zamani tatile  " + (gunSayisi - 3) + "  gun var");
            else if (gunIsmi.equals("carsamba"))
                System.out.println("Simdi calisma zamani tatile  " + (gunSayisi - 4) + "  gun var");
            else if (gunIsmi.equals("persembe"))
                System.out.println("Simdi calisma zamani tatile  " + (gunSayisi - 5) + "  gun var");
            else if (gunIsmi.equals("cuma"))
                System.out.println("Simdi calisma zamani tatile  " + (gunSayisi - 6) + "  gun var");

         else {
            System.out.println("Gecerli bir gun ismi giriniz");
        }

    }
}
