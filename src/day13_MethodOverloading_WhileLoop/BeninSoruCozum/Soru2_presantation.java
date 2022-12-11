package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

import java.util.Scanner;

public class Soru2_presantation {
    public static void main(String[] args) {
        /*
        - While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int kullaniciRakami=scan.nextInt();
        int basamaklarToplami=0;
        boolean ready=true;
        while (ready){
           basamaklarToplami+=kullaniciRakami%10;
           kullaniciRakami=kullaniciRakami/10;
           if(kullaniciRakami==0){
               ready=false;
           }
        }
        System.out.println(basamaklarToplami);
    }
}
