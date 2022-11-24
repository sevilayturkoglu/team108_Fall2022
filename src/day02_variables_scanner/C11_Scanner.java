package day02_variables_scanner;

import java.util.Scanner;

public class C11_Scanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char girilenIsim = scan.nextLine().charAt(0);
        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim = scan.nextLine();
        System.out.println("Lutfen Yasinizi giriniz");
        int girilenYas = scan.nextInt();
        System.out.println("isminiz : " + girilenIsim +
                "\nSoyisminiz : " + girilenSoyisim +
                "\nyasiniz : " + girilenYas +
                "\nkaydiniz basariyla tamamlanmistir.");
    }
}