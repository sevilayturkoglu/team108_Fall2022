package day10_stringManipulation;

import java.util.Scanner;

public class C10_forLoop {
    public static void main(String[] args) {
        // input olarak verilen sayidan baslayip
        // 7'ser 7'ser artirarak input olarak verilen bitis sayisina kadar
        // - tum sayilari
        // - kac adet sayi oldugunu
        // - ve bu sayilarin toplaminin kac oldugunu yazdirin
        int inputBas = 340;
        int inputBit = 630;
       int count=0;
       int top=0;

        for (int i =inputBas; i <=inputBit; i+=7) {
            System.out.print(i+" ");
            top+=i;
            count++;
        }
        System.out.println("");
        System.out.println("Toplam " + count +" adet sayi var \nBu sayilarin toplami : " + top);

    }
}
