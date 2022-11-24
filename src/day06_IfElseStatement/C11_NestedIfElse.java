package day06_IfElseStatement;

import java.util.Scanner;

public class C11_NestedIfElse {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen urun adedini giriniz");
        int urunAdedi = scan.nextInt();
        System.out.println("urunun liste fiyatini giriniz");
        double listeFiyati = scan.nextDouble();
        System.out.println("Musteri kartiniz var mi? \nE:Evet  H:Hayir");
        char kartVarmi = scan.next().toUpperCase().charAt(0);
        // Urun miktari ana degisken olsun
        if (urunAdedi > 10) {
            if(kartVarmi=='E'){
                System.out.println("%20 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.8);
            } else if (kartVarmi=='H') {
                System.out.println("%15 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.85);
            }else {
                 System.out.println("hatali kart bilgisi");
            }

        } else if (urunAdedi <= 10 && urunAdedi>=1) {
            if(kartVarmi=='E'){
                System.out.println("%15 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.85);
            } else if (kartVarmi=='H') {
                System.out.println("%10 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.90);
            }else{
                System.out.println("hatali kart bilgisi");
            }
        } else System.out.println("gecersiz urun adedi");
    }






       /* if (urunAdedi > 10) {
            if (kartVarmi == 'E') System.out.println("%20 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.8);
            else if (kartVarmi == 'H') System.out.println("%15 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.85);
            else System.out.println("hatali kart bilgisi");
        } else if (urunAdedi <= 10) {
            if (kartVarmi == 'H') System.out.println("%15 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.85);
            else if (kartVarmi == 'H') System.out.println("%10 indirimli toplam fiyat : " + urunAdedi * listeFiyati * 0.90);
            else System.out.println("hatali kart bilgisi");

        } else System.out.println("gecersiz urun adedi");*/


    }
