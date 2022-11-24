package day08_StringManiplation;

import java.util.Scanner;

public class C01_StringManiplation {
    public static void main(String[] args) {
        // Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Gun ismini giriniz");
        String kullanilacakGun= scan.next().toLowerCase();
       // String kullanilacakGun=girilenGun.toLowerCase();
        /*
           string ifadeler case sensitive'dir
           kullanicinin Pazar, PAzar, PazaR, PAZAR ... gibi 32 farkli sekilde yazma ihtimali
         */
        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(kullanilacakGun + " calisma zamani, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(kullanilacakGun + " calisma zamani, tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println(kullanilacakGun + " calisma zamani, tatile 3 gun var");
                break;
            case "persembe":
                System.out.println(kullanilacakGun+ " calisma zamani, tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(kullanilacakGun + " calisma zamani, tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Simdi dinlenme zamani");
                break;
            default:
                System.out.println("Yanlis gun ismi");
        }
    }


}
