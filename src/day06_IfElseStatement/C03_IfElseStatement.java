package day06_IfElseStatement;

import java.util.Scanner;

public class C03_IfElseStatement {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        // char girilenKarakteri=scan.next().toUpperCase().charAt(0);burada direk buyuk harfe cevirdik
        if (girilenKarakter>='a' && girilenKarakter<='z'){
            // kucuk harf ise buyuk harf olarak yazdiralim
            System.out.println((char)(girilenKarakter-32));//15 ve 16. satir buyuk harf yazar
            System.out.println(Character.toUpperCase(girilenKarakter));
        }else {
            // kucuk harf degilse girilen harfi yazdiralim
            System.out.println(girilenKarakter);
        }

    }
}
