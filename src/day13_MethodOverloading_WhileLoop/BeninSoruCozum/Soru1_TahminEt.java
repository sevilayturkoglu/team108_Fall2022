package day13_MethodOverloading_WhileLoop.BeninSoruCozum;

import java.util.Random;
import java.util.Scanner;

public class Soru1_TahminEt {
    public static void main(String[] args) {
        Random rn=new Random();
        int randomSayi= rn.nextInt(20);
        System.out.println(randomSayi);
        Scanner sc=new Scanner(System.in);
        System.out.println("lutfen tahmin etmek uzere 0 ile 20 arasi bir sayi giriniz");
        int count=0;
        boolean tahmin=false;
        while (tahmin==false){
            int tahminNumarasi= sc.nextInt();
            if(tahminNumarasi>randomSayi){
                System.out.println("daha kucuk bir numara girin");
                count++;
            } else if (tahminNumarasi<randomSayi) {
                System.out.println("daha buyuk bir numara girin");
                count++;
            }else{
                tahmin=true;
            }
        }if(count<3){
            System.out.println("wooow sayiyi " + count + " kerede buldun");
        } else if (count<=8) {

            System.out.println("aferim sayiyi " + count + " kerede buldun");
        }else{
            System.out.println("basarisiz");
        }
    }
}
